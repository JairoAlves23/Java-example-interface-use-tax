package exercicio.ex01.interf;

import java.util.Date;

public class Parcela {
	
	private Integer id;
	private Double valor;
	private Date dataParcela;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public void setDataParcela(Date dataParcela) {
		this.dataParcela = dataParcela;
	}
	
	public Date getDataParcela() {
		return dataParcela;
	}
	
	
	@Override
	public String toString() {
		return "Parcela [id=" + id + ", valor=" + valor + ", dataParcela=" + dataParcela + "]";
	}
	
	
	
	
	
	
	
	
	

}
