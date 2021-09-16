package interfaces;
import java.util.ArrayList;
import modelo.Servicio;
public interface ServicioInterface {
    public boolean agregar(Servicio d);
    public boolean editar(Servicio d);
    public boolean eliminar(Integer cod);
    public Servicio listarUno(Integer cod);
    public ArrayList<Servicio> listarTodo();
}