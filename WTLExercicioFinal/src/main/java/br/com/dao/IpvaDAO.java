package br.com.dao;

public class IpvaDAO {

	private Integer cod_veiculo;
	private Integer ano;
	private Integer comIPVA = 0;
	private Integer semIPVA = 0;
	private Integer cont = 0;
	
	
	public IpvaDAO() {
		super();

	}


	public Integer getId() {
		return cod_veiculo;
	}


	public Integer getAno() {
		return ano;
	}

	
	public Integer verificacao(Integer valor) {
		this.cont++;
		if(valor <= this.ano) {
			return this.semIPVA++;
		} else {
			return this.comIPVA++;
		}
	}


	public Object getListUser() {
		// TODO Auto-generated method stub
		return null;
	}


	public Integer buscarUser(Integer id1) {
		// TODO Auto-generated method stub
		this.cont++;
		if(ano <= this.ano) {
			return this.semIPVA++;
		} else {
			return this.comIPVA++;
		}
	}
	
	
	
}