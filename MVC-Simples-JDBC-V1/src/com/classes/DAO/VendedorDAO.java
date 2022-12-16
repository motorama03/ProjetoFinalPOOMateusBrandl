package com.classes.DAO;

import java.sql.Connection;
//import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.classes.Conexao.Conexao;
import com.classes.DTO.Vendedor;

public class VendedorDAO {
	final String NOMEDATABELA = "vendedor";
	final String NOMEDATABELA2 = "vendedorCompra";
    public boolean inserir(Vendedor vendedor) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "INSERT INTO " + NOMEDATABELA + " (nome, sobrenome, cpfVend, salario) VALUES (?, ?, ?, ?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, vendedor.getNome());
            ps.setString(3, vendedor.getCpf());
            ps.setString(2, vendedor.getSobrenome());
            ps.setDouble(4, vendedor.getSalario());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
//    public boolean inserirVenda(Vendedor vendedor) {
//        try {
//            Connection conn = Conexao.conectar();
//            String sql = "INSERT INTO " + NOMEDATABELA2 + " (cpf, totalVenda, dataVenda) VALUES (?, ?, ?);";
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setString(1, vendedor.getCpf());
//            ps.setDouble(2, vendedor.getTotalVenda());
//            ps.setDate(3, (Date) vendedor.getDataVenda());
//            ps.executeUpdate();
//            ps.close();
//            conn.close();
//            return true;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return false;
//        }
//    }
    
    public boolean excluir(Vendedor vendedor) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE cpfVend = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, vendedor.getCpf());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
    
    public boolean alterar(Vendedor vendedor) {
    	try {
    		Connection conn = Conexao.conectar();
    		String sql = "UPDATE " + NOMEDATABELA + " SET  nome = ?, sobrenome = ?, salario = ? WHERE cpfVend = ?;";
    		PreparedStatement ps = conn.prepareStatement(sql);
    		ps.setString(1, vendedor.getNome());
    		ps.setString(2, vendedor.getSobrenome());
    		ps.setDouble(3, vendedor.getSalario());
    		ps.setString(4, vendedor.getCpf());
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
    
//    public boolean alterarVenda(Vendedor vendedor) {
//    	//System.out.println(pessoa);
//    	try {
//    		Connection conn = Conexao.conectar();
//    		String sql = "UPDATE " + NOMEDATABELA + " SET  totalVenda = ?, valorVenda = ? WHERE cpf = ?;";
//    		PreparedStatement ps = conn.prepareStatement(sql);
//    		ps.setDouble(1, vendedor.getTotalVenda());
//    		ps.setDate(2, (Date) vendedor.getDataVenda());
//    		ps.setString(3, vendedor.getCpf());
//    		//ps.setInt(4, pessoa.getId());
//    		ps.executeUpdate();
//    		ps.close();
//    		return true;
//    	} catch (Exception e) {
//    		e.printStackTrace();
//            return false;
//    	}	
//    	//return true;
//    }
    
    public Vendedor procurarPorId(Vendedor vendedor) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE id = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, vendedor.getId());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
            	Vendedor obj = new Vendedor();
                obj.setId(rs.getInt(1));
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
    
    public List<Vendedor> pesquisarTodos() {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Vendedor> listObj = montarLista(rs);
            return listObj;
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return null;
        }
    }
    
    public List<Vendedor> montarLista(ResultSet rs) {
        List<Vendedor> listObj = new ArrayList<Vendedor>();
        try {
            while (rs.next()) {
            	Vendedor obj = new Vendedor();
                obj.setId(rs.getInt(1));
                obj.setNome(rs.getString(2));
                obj.setSobrenome(rs.getString(3));
                obj.setCpf(rs.getString(4));
                obj.setSalario(rs.getDouble(5));
                listObj.add(obj);
            }
            return listObj;
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return null;
        }
    }
    
    public Vendedor procurarPorCpf(Vendedor vendedor) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE cpfVend = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, vendedor.getCpf());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
            	Vendedor obj = new Vendedor();
                obj.setId(rs.getInt(1));
                obj.setNome(rs.getString(2));
                obj.setSobrenome(rs.getString(3));
                obj.setCpf(rs.getString(4));
                obj.setSalario(rs.getDouble(5));
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
