package com.classes.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
//import java.sql.ResultSet;
//import java.util.ArrayList;
//import java.util.List;
import com.classes.DTO.Pessoa;
import com.classes.Conexao.Conexao;


public class PessoaDAO {
	
	final String NOMEDATABELA = "pessoa";
    public boolean inserir(Pessoa pessoa) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "INSERT INTO " + NOMEDATABELA + " (nome, sobrenome, cpf) VALUES (?, ?, ?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, pessoa.getNome());
            ps.setString(3, pessoa.getCpf());
            ps.setString(2, pessoa.getSobrenome());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean excluir(Pessoa pessoa) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE cpf = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, pessoa.getCpf());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
    
    public boolean alterar(Pessoa pessoa) {
    	//System.out.println(pessoa);
    	try {
    		Connection conn = Conexao.conectar();
    		String sql = "UPDATE " + NOMEDATABELA + " SET  nome = ?, sobrenome = ? WHERE cpf = ?;";
    		PreparedStatement ps = conn.prepareStatement(sql);
    		ps.setString(1, pessoa.getNome());
    		ps.setString(2, pessoa.getSobrenome());
    		ps.setString(3, pessoa.getCpf());
    		//ps.setInt(4, pessoa.getCodigo());
    		ps.executeUpdate();
    		ps.close();
    		return true;
    	} catch (Exception e) {
    		e.printStackTrace();
            return false;
    	}	
    	//return true;
    }
    
    public Pessoa procurarPorCodigo(Pessoa pessoa) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE id = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, pessoa.getCodigo());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Pessoa obj = new Pessoa();
                obj.setCodigo(rs.getInt(1));
                obj.setNome(rs.getString(2));
                obj.setSobrenome(rs.getString(4));
                obj.setCpf(rs.getString(3));
                ps.close();
                rs.close();
                conn.close();
                return obj;
            } else {
                ps.close();
                rs.close();
                conn.close();
                return null;
            }
        } catch (Exception e) {
        	 e.printStackTrace();
             return null;
        }
    }
    
    public List<Pessoa> pesquisarTodos() {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Pessoa> listObj = montarLista(rs);
            return listObj;
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return null;
        }
    }
    
    public List<Pessoa> montarLista(ResultSet rs) {
        List<Pessoa> listObj = new ArrayList<Pessoa>();
        try {
            while (rs.next()) {
                Pessoa obj = new Pessoa();
                obj.setCodigo(rs.getInt(1));
                obj.setNome(rs.getString(2));
                obj.setSobrenome(rs.getString(3));
                obj.setCpf(rs.getString(4));
                listObj.add(obj);
            }
            return listObj;
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return null;
        }
    }
    
    public Pessoa procurarPorCpf(Pessoa pessoa) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE cpf = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, pessoa.getCpf());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Pessoa obj = new Pessoa();
                obj.setCodigo(rs.getInt(1));
                obj.setNome(rs.getString(2));
                obj.setSobrenome(rs.getString(3));
                obj.setCpf(rs.getString(4));
                ps.close();
                rs.close();
                conn.close();
                return obj;
            } else {
                ps.close();
                rs.close();
                conn.close();
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }
	
}
