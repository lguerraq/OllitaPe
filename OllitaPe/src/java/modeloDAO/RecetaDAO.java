package modeloDAO;
import config.DBConexion;
import interfaces.RecetaInterface;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Receta;
public class RecetaDAO implements RecetaInterface{
    DBConexion cn = new DBConexion();
    Connection con;
    PreparedStatement ps ;
    ResultSet rs;
    Receta d;

    @Override
    public boolean agregar(Receta d) {
        try {
            String sql = "insert into cabReceta(IdCategoria, nombre) value(0, '"+d.getNombre()+"')";            
            con = cn.conectar();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(RecetaDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ERROR "+ex);
        }
        return false;
    }

    @Override
    public boolean editar(Receta d) {
        try {
            String sql = "update cabReceta set nombre = '"+d.getNombre()+"' where IdCategoria = "+d.getIdReceta();
            con= cn.conectar();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(RecetaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean eliminar(Integer cod) {
        try {
            String sql = "delete from cabReceta where idCabReceta = "+cod;
            con= cn.conectar();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(RecetaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public Receta listarUno(Integer cod) {
        try {
            String sql = "select * from cabReceta where idCabReceta ="+cod;
            con=cn.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                d=new Receta();
                d.setIdReceta(rs.getInt("idReceta"));
                d.setNombre(rs.getString("nombre"));
            }            
            
        } catch (SQLException ex) {
            Logger.getLogger(RecetaDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ERROR "+ex);
        }
        return d;
    }

    @Override
    public ArrayList<Receta> listarTodo() {
        ArrayList<Receta> lista = new ArrayList<>();
        try {
            String sql = "select * from cabReceta";
            con= cn.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                d=new Receta();
                d.setIdReceta(rs.getInt("idReceta"));
                d.setNombre(rs.getString("nombre"));
                lista.add(d);
            }            
            
        } catch (SQLException ex) {
            Logger.getLogger(categoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
}