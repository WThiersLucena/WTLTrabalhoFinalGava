package br.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.conexao.Conexao;
import br.com.entidade.Veiculos;

public class VeiculosDAO {

	public VeiculosDAO() {
		super();
	}
	
			// - MODELO DE METODO ADICIONAR 
//	public void adicionarVeiculo(Veiculo veiculo) {
//		
//		Conexao c = Conexao.getInstance();
//		Connection con = c.getConnection();
//		
//		try {
//			PreparedStatement p = con.prepareStatement("insert into tb_veiculo (modelo_veiculo, cod_marca, numero_chassi, ano_veiculo, preco_veiculo, cod_cor, cod_motor, cod_combustivel, cod_cambio, cod_fornecedor, estoque, destaque) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
//			
//			p.setString(1, veiculo.getModelo_veiculo());
//			p.setInt(2, veiculo.getCod_marca());
//			p.setString(3, veiculo.getNumero_chassi());
//			p.setInt(4, veiculo.getAno_veiculo());
//			p.setDouble(5, veiculo.getPreco_veiculo());
//			p.setInt(6, veiculo.getCod_cor());
//			p.setInt(7, veiculo.getCod_motor());
//			p.setInt(8, veiculo.getCod_combustivel());
//			p.setInt(9, veiculo.getCod_cambio());
//			p.setInt(10, veiculo.getCod_fornecedor());
//			p.setBoolean(11, veiculo.isEstoque());
//			p.setBoolean(12, veiculo.isDestaque());
//			
//			System.out.println(p);
//			p.executeUpdate();
//			System.out.println("Veiculo Inserido");
//			p.close();
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
	public ArrayList<Veiculos> mostrarVeiculo() {
			
			Conexao c = Conexao.getInstance();
			Connection con = c.getConnection();
			
			ArrayList<Veiculos> lista = new ArrayList<Veiculos>();
			try {
				PreparedStatement p = con.prepareStatement("select * from tb_veiculo");
				
				ResultSet r = p.executeQuery();
				
				while(r.next()) {
					
					Integer cod_veiculo = r.getInt("cod_veiculo");
					
					String nome_veiculo = r.getString("nome_veiculo");
					
					Veiculos v = new Veiculos(cod_veiculo, nome_veiculo);
					
					v.setCod_veiculo(cod_veiculo);
					lista.add(v);

				}


			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return lista;
		}

		
	
	
	
	
//	
//	public void removerVeiculo(Integer cod_veiculo) {
//		
//		Conexao c = Conexao.getInstance();
//		Connection con = c.getConnection();
//		
//		
//		try {
//			PreparedStatement p = con.prepareStatement("delete * fron tb_veiculo where cod_veiculo = ?");
//			p.setInt(1, cod_veiculo);
//			System.out.println(p);
//			
//			p.executeUpdate();
//			System.out.println("Comando Executado");
//			p.close();
//			
//			
//		}catch(SQLException e) {
//			e.printStackTrace();
//			
//		}
//	}
	
	
	
	
	
	
}
