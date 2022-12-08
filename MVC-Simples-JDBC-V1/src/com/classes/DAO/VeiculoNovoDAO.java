package com.classes.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.classes.Conexao.Conexao;
import com.classes.DTO.VeiculoNovo;

public class VeiculoNovoDAO {
	final String NOMEDATABELA = "veiculoNovo";
    public boolean inserir(VeiculoNovo veiculoNovo) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "INSERT INTO " + NOMEDATABELA + " (modelo, marca, valor, quantidade, ano) VALUES (?, ?, ?, ?, ?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, veiculoNovo.getModelo());
            ps.setString(2, veiculoNovo.getMarca());
            ps.setDouble(3, veiculoNovo.getValor());
            ps.setInt(4, veiculoNovo.getQuantidade());
            ps.setInt(5, veiculoNovo.getAno());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean excluir(VeiculoNovo veiculoNovo) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE modelo = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, veiculoNovo.getModelo());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
    
    public boolean alterar(VeiculoNovo veiculoNovo) {
    	//System.out.println(pessoa);
    	try {
    		Connection conn = Conexao.conectar();
    		String sql = "UPDATE " + NOMEDATABELA + " SET  marca = ?, modelo = ? WHERE id = ?;";
    		PreparedStatement ps = conn.prepareStatement(sql);
    		ps.setString(1, veiculoNovo.getMarca());
    		ps.setString(2, veiculoNovo.getModelo());
    		ps.setInt(3, veiculoNovo.getId());
    		ps.executeUpdate();
    		ps.close();
    		return true;
    	} catch (Exception e) {
    		e.printStackTrace();
            return false;
    	}	
    	//return true;
    }
    
    public VeiculoNovo procurarPorId(VeiculoNovo veiculoNovo) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE id = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, veiculoNovo.getId());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                VeiculoNovo obj = new VeiculoNovo();
                obj.setId(rs.getInt(1));
                obj.setMarca(rs.getString(2));
                obj.setModelo(rs.getString(4));
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
    
    public List<VeiculoNovo> pesquisarTodos() {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<VeiculoNovo> listObj = montarLista(rs);
            return listObj;
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return null;
        }
    }
    
    public List<VeiculoNovo> montarLista(ResultSet rs) {
        List<VeiculoNovo> listObj = new ArrayList<VeiculoNovo>();
        try {
            while (rs.next()) {
                VeiculoNovo obj = new VeiculoNovo();
                obj.setId(rs.getInt(1));
                obj.setMarca(rs.getString(2));
                obj.setModelo(rs.getString(3));
                listObj.add(obj);
            }
            return listObj;
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return null;
        }
    }
    
    public boolean vendeuUmVeiculo(VeiculoNovo veiculoNovo) {
    	try {
    		Connection conn = Conexao.conectar();
    		String sql = "UPDATE " + NOMEDATABELA + " SET quantidade = quantidade - 1 WHERE id = ?;";
    		PreparedStatement ps = conn.prepareStatement(sql);
    		ps.setString(1, veiculoNovo.getModelo());
    		ps.executeUpdate();
    		ps.close();
    		return true;
    	} catch (Exception e) {
    		e.printStackTrace();
            return false;
    	}	
    }
}
