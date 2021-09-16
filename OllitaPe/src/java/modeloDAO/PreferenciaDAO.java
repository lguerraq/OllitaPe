package modeloDAO;
import config.DBConexion;
import interfaces.PreferenciaInterface;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Preferencia;
public class PreferenciaDAO implements PreferenciaInterface {
    DBConexion cn = new DBConexion();
    Connection con;
    PreparedStatement ps ;
    ResultSet rs;
    Preferencia d;

    @Override
    public boolean agregar(Preferencia d) {
        try {
            //String sql = "insert into categoria(IdCategoria, nombre) value('"+d.getIdCategoria()+"', '"+d.getNombre()+"')";
            String sql = "insert into Preferencia(IdPreferencia, nombre) value(0, '"+d.getNombre()+"')";            
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
    public boolean editar(Preferencia d) {
        try {
            String sql = "update Preferencia set nombre = '"+d.getNombre()+"' where IdPreferencia = "+d.getIdPreferencia();
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
            String sql = "delete from Preferencia where idPreferencia = "+cod;
            con= cn.conectar();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(categoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public Preferencia listarUno(Integer cod) {
        try {
            String sql = "select * from Preferencia where idPreferencia ="+cod;
            con=cn.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                d=new Preferencia();
                d.setIdPreferencia(rs.getInt("idPreferencia"));
                d.setNombre(rs.getString("nombre"));
            }            
            
        } catch (SQLException ex) {
            Logger.getLogger(categoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ERROR "+ex);
        }
        return d;
    }

    @Override
    public ArrayList<Preferencia> listarTodo() {
        ArrayList<Preferencia> lista = new ArrayList<>();
        try {
            String sql = "select * from Preferencia";
            con= cn.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                d=new Preferencia();
                d.setIdPreferencia(rs.getInt("idPreferencia"));
                d.setNombre(rs.getString("nombre"));
                lista.add(d);
            }            
            
        } catch (SQLException ex) {
            Logger.getLogger(categoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
}