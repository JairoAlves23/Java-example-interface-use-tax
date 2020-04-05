package exercicio.ex01.interf;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class PayPalJuro implements CalculoJuro {

	@Override
	public Object contratos(Contrato contrato, Double juro, Double taxa) {

		// public List<Contrato> contratos(Contrato contrato, Double juro, Double taxa)
		// {
		// ArrayList<Contrato> novaLista = new ArrayList<>();

		ArrayList<Parcela> novaParcela = new ArrayList<>();
		double valorContrato2 = contrato.getValorContrato();
		int numeroParcela = 1;
		int dataParcela = 2;
		double resultadoJuro = 0;
		double resultadoTaxa = 0;

		for (int i = 0; i < contrato.getNumeroParcelas(); i++) {

			GregorianCalendar gc = new GregorianCalendar(Calendar.getInstance().get(Calendar.YEAR), Calendar.MONTH,
					Calendar.DAY_OF_MONTH);
			Parcela parcela = new Parcela();
			gc.add(Calendar.MONTH, dataParcela);
			Date novaData = gc.getTime();
			resultadoJuro = valorContrato2 + ((valorContrato2 * juro) * numeroParcela);
			resultadoTaxa = (resultadoJuro * taxa) + resultadoJuro;
			parcela.setId(numeroParcela);
			parcela.setValor(resultadoTaxa);
			parcela.setDataParcela(novaData);
			novaParcela.add(parcela);
			contrato.setParcela(novaParcela);
			numeroParcela++;
			dataParcela++;
			resultadoTaxa = 0;
		}

		return contrato;
	}

}
