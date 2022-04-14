package br.com.agenda.dao;

import java.sql.Connection;

import com.mysql.jdbc.PreparedStatement;

import br.com.agenda.factory.ConnectionFactory;
import br.com.agenda.model.Contato;

public class ContatoDAO{
	
	
	public void save(Contato contato) {
		String sql = "INSERT INTO contatos (nome, cpf, comida) VALUES (?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			
			
			ps = (PreparedStatement) conn.prepareStatement(sql);
			ps.setString(1, contato.getNome());
			ps.setString(2, contato.getCpf());
			ps.setString(3, contato.getProduto());
			
			ps.execute();
			
			System.out.println("Contato salvo com sucesso");
			
		}catch (Exception e) {
			e.printStackTrace();
		
		}finally {
			try {
				if (ps != null) {
					ps.close();
					}
				if (conn !=null ) {
					conn.close();
				}
				}catch (Exception e) {
					e.printStackTrace();
					
				}
		}
		
		
		
		
		
	}

}
