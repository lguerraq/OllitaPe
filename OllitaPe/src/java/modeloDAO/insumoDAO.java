package modeloDAO;

import config.DBConexion;
import interfaces.insumoInterface;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Insumo;


public class insumoDAO implements insumoInterface{
    DBConexion cn = new DBConexion();
    Connection con;
    PreparedStatement ps ;
    ResultSet rs;
    Insumo d;
    
    @Override
    public boolean agregar(Insumo d) {        
        try {
            String sql = "insert into insumo(idInsumo, nombre, idCategoria, idMedida, precio ) value(0, '"+d.getNombre()+"',  '"+d.getIdCategoria()+"',  '"+d.getIdMedida()+"',  '"+d.getPrecio()+"' )";            
            con = cn.conectar();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(insumoDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ERROR "+ex);
        }
        return false;
    }

    @Override
    public boolean editar(Insumo d) {
        try {
            String sql = "update insumo set nombre = '"+d.getNombre()+"' where idInsumo = "+d.getIdInsumo();
            con= cn.conectar();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(insumoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean eliminar(Integer cod) {
        try {
            String sql = "delete from insumo where idInsumo = "+cod;
            con= cn.conectar();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(comidaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override    
    public Insumo listarUno(Integer cod) {
        try {
            String sql = "select * from insumo where idInsumo ="+cod;
            con=cn.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                d=new Insumo();
                d.setIdInsumo(rs.getInt("idInsumo"));
                d.setNombre(rs.getString("nombre"));
                d.setIdCategoria(rs.getInt("idCategoria"));
                d.setIdMedida(rs.getInt("idMedida"));
                d.setPrecio(rs.getInt("Precio"));                
            }            
            
        } catch (SQLException ex) {
            Logger.getLogger(insumoDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ERROR "+ex);
        }
        return d;
    }

    @Override
    public ArrayList<Insumo> listarTodo() {
        ArrayList<Insumo> lista = new ArrayList<>();
        try {
            String sql = "select * from insumo";
            con= cn.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                d=new Insumo();
                d.setIdInsumo(rs.getInt("idInsumo"));
                d.setNombre(rs.getString("nombre"));
                d.setIdCategoria(rs.getInt("idCategoria"));
                d.setIdMedida(rs.getInt("idMedida"));
                d.setPrecio(rs.getInt("Precio"));                
                
                lista.add(d);
            }            
            
        } catch (SQLException ex) {
            Logger.getLogger(insumoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
}
