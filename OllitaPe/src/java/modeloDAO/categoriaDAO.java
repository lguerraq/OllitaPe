package modeloDAO;

import config.DBConexion;
import interfaces.CategoriaInterface;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Categoria;


public class categoriaDAO implements CategoriaInterface{
    DBConexion cn = new DBConexion();
    Connection con;
    PreparedStatement ps ;
    ResultSet rs;
    Categoria d;
    
    @Override
    public boolean agregar(Categoria d) {        
        try {
            //String sql = "insert into categoria(IdCategoria, nombre) value('"+d.getIdCategoria()+"', '"+d.getNombre()+"')";
            String sql = "insert into categoria(IdCategoria, nombre) value(0, '"+d.getNombre()+"')";            
            con = cn.conectar();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(categoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ERROR "+ex);
        }
        return false;
    }

    @Override
    public boolean editar(Categoria d) {
        try {
            String sql = "update categoria set nombre = '"+d.getNombre()+"' where IdCategoria = "+d.getIdCategoria();
            con= cn.conectar();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(categoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean eliminar(Integer cod) {
        try {
            String sql = "delete from categoria where idCategoria = "+cod;
            con= cn.conectar();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(categoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override    
    public Categoria listarUno(Integer cod) {
        try {
            String sql = "select * from categoria where idCategoria ="+cod;
            con=cn.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                d=new Categoria();
                d.setIdCategoria(rs.getInt("idCategoria"));
                d.setNombre(rs.getString("nombre"));
            }            
            
        } catch (SQLException ex) {
            Logger.getLogger(categoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ERROR "+ex);
        }
        return d;
    }

    @Override
    public ArrayList<Categoria> listarTodo() {
        ArrayList<Categoria> lista = new ArrayList<>();
        try {
            String sql = "select * from categoria";
            con= cn.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                d=new Categoria();
                d.setIdCategoria(rs.getInt("idCategoria"));
                d.setNombre(rs.getString("nombre"));
                lista.add(d);
            }            
            
        } catch (SQLException ex) {
            Logger.getLogger(categoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
}
