package com.classes.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.classes.Conexao.Conexao;
import com.classes.DTO.Compra;


public class CompraDAO {
	final String NOMEDATABELA = "compra";
	
	// Inserção de compras
	public boolean inserir(Compra compra) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "INSERT INTO " + NOMEDATABELA + " (totalVenda, dataVenda, cpfCliente, cpfVendedor, modeloVeiculo) VALUES (?, ?, ?, ?, ?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDouble(1, compra.getValorCompra());
            ps.setString(2, compra.getDataCompra());
            ps.setString(3, compra.getCpfCliente());
            ps.setString(4, compra.getCpfVendedor());
            ps.setString(5, compra.getModelo());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
	
	public List<Compra> pesquisarTodos() {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Compra> listObj = montarLista(rs);
            return listObj;
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return null;
        }
    }
	
	public List<Compra> montarLista(ResultSet rs) {
        List<Compra> listObj = new ArrayList<Compra>();
        try {
            while (rs.next()) {
            	Compra obj = new Compra();
                obj.setId(rs.getInt(1));
                obj.setCpfCliente(rs.getString(2));
                obj.setCpfVendedor(rs.getString(3));
                obj.setDataCompra(rs.getString(4));
//                obj.setValorCompra(rs.getDouble(5));
                obj.setModelo(rs.getString(4));
                listObj.add(obj);
            }
            return listObj;
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return null;
        }
    }
	
	public boolean excluir(Compra compra) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE id = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, compra.getId());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
	
	public boolean alterarId(Compra compra) {
    	try {
    		Connection conn = Conexao.conectar();
    		String sql = "UPDATE " + NOMEDATABELA + " SET  cpfCliente = ?, cpfVendedor = ?, totalVenda = ?, dataVenda = ?, modeloVeiculo = ? WHERE id = ?;";
    		PreparedStatement ps = conn.prepareStatement(sql);
    		ps.setString(1, compra.getCpfCliente());
    		ps.setString(2, compra.getCpfVendedor());
    		ps.setDouble(3, compra.getValorCompra());
    		ps.setString(4, compra.getDataCompra());
    		ps.setString(5, compra.getModelo());
    		ps.setInt(6, compra.getId());
    		//ps.setInt(4, pessoa.getId());
    		ps.executeUpdate();
    		ps.close();
    		return true;
    	} catch (Exception e) {
    		e.printStackTrace();
            return false;
    	}	
    	//return true;
    }
	
}
