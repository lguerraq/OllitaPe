package modeloDAO;

import config.DBConexion;
import interfaces.comidaInterface;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Comida;


public class comidaDAO implements comidaInterface{
    DBConexion cn = new DBConexion();
    Connection con;
    PreparedStatement ps ;
    ResultSet rs;
    Comida d;
    
    @Override
    public boolean agregar(Comida d) {        
        try {
            String sql = "insert into tipoComida(idTipoComida, nombre) value(0, '"+d.getNombre()+"')";            
            con = cn.conectar();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(comidaDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ERROR "+ex);
        }
        return false;
    }

    @Override
    public boolean editar(Comida d) {
        try {
            String sql = "update tipocomida set nombre = '"+d.getNombre()+"' where idTipoComida = "+d.getIdTipoComida();
            con= cn.conectar();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(comidaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean eliminar(Integer cod) {
        try {
            String sql = "delete from tipoComida where idTipoComida = "+cod;
            con= cn.conectar();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(comidaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override    
    public Comida listarUno(Integer cod) {
        try {
            String sql = "select * from tipoComida where idTipoComida ="+cod;
            con=cn.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                d=new Comida();
                d.setIdTipoComida(rs.getInt("idTipoComida"));
                d.setNombre(rs.getString("nombre"));
            }            
            
        } catch (SQLException ex) {
            Logger.getLogger(comidaDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ERROR "+ex);
        }
        return d;
    }

    @Override
    public ArrayList<Comida> listarTodo() {
        ArrayList<Comida> lista = new ArrayList<>();
        try {
            String sql = "select * from tipoComida";
            con= cn.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                d=new Comida();
                d.setIdTipoComida(rs.getInt("idTipoComida"));
                d.setNombre(rs.getString("nombre"));
                lista.add(d);
            }            
            
        } catch (SQLException ex) {
            Logger.getLogger(comidaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
}
