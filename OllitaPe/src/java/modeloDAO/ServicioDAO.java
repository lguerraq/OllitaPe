package modeloDAO;
import config.DBConexion;
import interfaces.ServicioInterface;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Servicio;
public class ServicioDAO implements ServicioInterface{
    DBConexion cn = new DBConexion();
    Connection con;
    PreparedStatement ps ;
    ResultSet rs;
    Servicio d;

    @Override
    public boolean agregar(Servicio d) {
        try {
            //String sql = "insert into categoria(IdCategoria, nombre) value('"+d.getIdCategoria()+"', '"+d.getNombre()+"')";
            String sql = "insert into Servicio(IdCategoria, nombre) value(0, '"+d.getNombre()+"')";            
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
    public boolean editar(Servicio d) {
        try {
            String sql = "update Servicio set nombre = '"+d.getNombre()+"' where IdCategoria = "+d.getIdServicio();
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
            String sql = "delete from Servicio where idServicio = "+cod;
            con= cn.conectar();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(categoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public Servicio listarUno(Integer cod) {
        try {
            String sql = "select * from Servicio where idServicio ="+cod;
            con=cn.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                d=new Servicio();
                d.setIdServicio(rs.getInt("idServicio"));
                d.setNombre(rs.getString("nombre"));
            }            
            
        } catch (SQLException ex) {
            Logger.getLogger(categoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ERROR "+ex);
        }
        return d;
    }

    @Override
    public ArrayList<Servicio> listarTodo() {
        ArrayList<Servicio> lista = new ArrayList<>();
        try {
            String sql = "select * from Servicio";
            con= cn.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                d=new Servicio();
                d.setIdServicio(rs.getInt("idServicio"));
                d.setNombre(rs.getString("nombre"));
                lista.add(d);
            }            
            
        } catch (SQLException ex) {
            Logger.getLogger(categoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
}