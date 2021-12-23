package br.com.alura.jdbc.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.alura.jdbc.dao.CategoriaDAO;
import br.com.alura.jdbc.factory.ConnectionFactory;
import br.com.alura.jdbc.modelo.Categoria;

public class CategoriaController {
	
	private CategoriaDAO categoriaDAO;
	
	

	public CategoriaController() {
		Connection conexao = new ConnectionFactory().recuperarConexao();
		this.categoriaDAO = new CategoriaDAO(conexao);  
	}



	public List<Categoria> listar(){
		return this.categoriaDAO.listar();
		
//		List<Categoria> categorias = 
//				new ArrayList<Categoria>();
//		categorias.add(new Categoria(1, "Categoria de teste")); 
//		return categorias;
	}
}
