package exercicio.ex01.interf;

import java.util.Date;

public class Principal {

	public static void main(String[] args) {

		Contrato contrato = new Contrato("8028", new Date(System.currentTimeMillis()), 200.00, 3);

		CalculoJuro listaJuros = new PayPalJuro();
		System.out.println(listaJuros.contratos(contrato, 0.01, 0.02));

		
		
		//GregorianCalendar gc = new GregorianCalendar(Calendar.getInstance().get(Calendar.YEAR),Calendar.MONTH,Calendar.DAY_OF_MONTH);
		//gc.add(Calendar.MONTH, 3);
		//Date data = gc.getTime();
		//DateFormat f = DateFormat.getDateInstance(DateFormat.ERA_FIELD); 
		//System.out.println(new Date(System.currentTimeMillis()));

	}

}
