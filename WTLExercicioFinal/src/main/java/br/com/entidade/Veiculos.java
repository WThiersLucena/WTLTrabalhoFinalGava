package br.com.entidade;


public class Veiculos {
	private Integer cod_veiculo;
	private String nome_veiculo;

	
	
	public Veiculos(Integer cod_veiculo, String nome_veiculo) {
		super();
		this.cod_veiculo = cod_veiculo;
		this.nome_veiculo = nome_veiculo;
	}



	public Integer getCod_veiculo() {
		return cod_veiculo;
	}



	public void setCod_veiculo(Integer cod_veiculo) {
		this.cod_veiculo = cod_veiculo;
	}



	public String getNome_veiculo() {
		return nome_veiculo;
	}



	public void setNome_veiculo(String nome_veiculo) {
		this.nome_veiculo = nome_veiculo;
	}



	@Override
	public String toString() {
		return "Veiculos [cod_veiculo=" + cod_veiculo + ", nome_veiculo=" + nome_veiculo + "]";
	}



}
