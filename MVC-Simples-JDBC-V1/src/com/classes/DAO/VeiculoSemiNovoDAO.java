package com.classes.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.classes.Conexao.Conexao;
import com.classes.DTO.VeiculoSemiNovo;

public class VeiculoSemiNovoDAO {
	final String NOMEDATABELA = "veiculoSemiNovo";
    public boolean inserir(VeiculoSemiNovo veiculoSemiNovo) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "INSERT INTO " + NOMEDATABELA + " (modelo, marca, valor, quantidade, ano) VALUES (?, ?, ?, ?, ?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, veiculoSemiNovo.getModelo());
            ps.setString(2, veiculoSemiNovo.getMarca());
            ps.setDouble(3, veiculoSemiNovo.getValor());
            ps.setInt(4, veiculoSemiNovo.getQuantidade());
            ps.setInt(5, veiculoSemiNovo.getAno());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean excluir(VeiculoSemiNovo veiculoSemiNovo) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE id = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, veiculoSemiNovo.getId());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
    
    public boolean alterarPorModelo(VeiculoSemiNovo veiculoSemiNovo) {
    	//System.out.println(pessoa);
    	try {
    		Connection conn = Conexao.conectar();
    		String sql = "UPDATE " + NOMEDATABELA + " SET  marca = ?, modelo = ?, valor = ?, quantidade = ? WHERE modelo = ?;";
    		PreparedStatement ps = conn.prepareStatement(sql);
    		ps.setString(1, veiculoSemiNovo.getMarca());
    		ps.setString(2, veiculoSemiNovo.getModelo());
    		ps.setDouble(3, veiculoSemiNovo.getValor());
    		ps.setInt(4, veiculoSemiNovo.getQuantidade());
    		ps.setInt(5, veiculoSemiNovo.getId());
    		ps.executeUpdate();
    		ps.close();
    		return true;
    	} catch (Exception e) {
    		e.printStackTrace();
            return false;
    	}	
    	//return true;
    }
    
    public boolean alterarId(VeiculoSemiNovo veiculoSemiNovo) {
    	//System.out.println(pessoa);
    	try {
    		Connection conn = Conexao.conectar();
    		String sql = "UPDATE " + NOMEDATABELA + " SET  marca = ?, modelo = ?, valor = ?, quantidade = ? WHERE id = ?;";
    		PreparedStatement ps = conn.prepareStatement(sql);
    		ps.setString(1, veiculoSemiNovo.getMarca());
    		ps.setString(2, veiculoSemiNovo.getModelo());
    		ps.setDouble(3, veiculoSemiNovo.getValor());
    		ps.setInt(4, veiculoSemiNovo.getQuantidade());
    		ps.setInt(5, veiculoSemiNovo.getId());
    		ps.executeUpdate();
    		ps.close();
    		return true;
    	} catch (Exception e) {
    		e.printStackTrace();
            return false;
    	}	
    	//return true;
    }
    
    public VeiculoSemiNovo procurarPorId(VeiculoSemiNovo veiculoSemiNovo) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE id = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, veiculoSemiNovo.getId());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                VeiculoSemiNovo obj = new VeiculoSemiNovo();
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
    
    public List<VeiculoSemiNovo> pesquisarTodos() {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<VeiculoSemiNovo> listObj = montarLista(rs);
            return listObj;
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return null;
        }
    }
    
    public List<VeiculoSemiNovo> montarLista(ResultSet rs) {
        List<VeiculoSemiNovo> listObj = new ArrayList<VeiculoSemiNovo>();
        try {
            while (rs.next()) {
                VeiculoSemiNovo obj = new VeiculoSemiNovo();
                obj.setId(rs.getInt(1));
                obj.setMarca(rs.getString(2));
                obj.setModelo(rs.getString(3));
                obj.setQuantidade(rs.getInt(4));
                obj.setValor(rs.getDouble(5));
                obj.setAno(rs.getInt(6));
                listObj.add(obj);
            }
            return listObj;
        } catch (Exception e) {
            System.err.println("Erro: " + e.toString());
            e.printStackTrace();
            return null;
        }
    }

    public boolean vendeuUmVeiculo(VeiculoSemiNovo veiculoNovo) {
    	try {
    		Connection conn = Conexao.conectar();
    		String sql = "UPDATE " + NOMEDATABELA + " SET quantidade = (quantidade - 1) WHERE id = ?;";
    		PreparedStatement ps = conn.prepareStatement(sql);
    		ps.setInt(1, veiculoNovo.getId());
    		ps.executeUpdate();
    		ps.close();
    		return true;
    	} catch (Exception e) {
    		e.printStackTrace();
            return false;
    	}	
    }
}
