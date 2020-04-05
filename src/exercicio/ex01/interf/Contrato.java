package exercicio.ex01.interf;

import java.util.Date;
import java.util.List;


public class Contrato {

	private String number;
	private Date dataContrato;
	private Double valorContrato;
	private Integer numeroParcelas;
	private List<?> parcela;

	
	public Contrato(String number, Date dataContrato, Double valorContrato, Integer numeroParcelas) {
		super();
		this.number = number;
		this.dataContrato = dataContrato;
		this.valorContrato = valorContrato;
		this.numeroParcelas = numeroParcelas;

	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Date getDataContrato() {
		return dataContrato;
	}

	public void setDataContrato(Date dataContrato) {
		this.dataContrato = dataContrato;
	}

	public Double getValorContrato() {
		return valorContrato;
	}

	public void setValorContrato(Double valorContrato) {
		this.valorContrato = valorContrato;
	}

	public Integer getNumeroParcelas() {
		return numeroParcelas;
	}

	public void setNumeroParcelas(Integer numeroParcelas) {
		this.numeroParcelas = numeroParcelas;
	}

	public List<?> getParcela() {
		return parcela;
	}

	public void setParcela(List<?> parcela) {
		this.parcela = parcela;
	}

	@Override
	public String toString() {
		return "Contrato [number=" + number + ",\n dataContrato=" + dataContrato + ",\n valorContrato=" + valorContrato
				+ "\n, numeroParcelas=" + numeroParcelas + "\n, parcela=" + parcela + "]\n";
	}

	

	
	
	

}
