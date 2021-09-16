package interfaces;
import java.util.ArrayList;
import modelo.Preferencia;
public interface PreferenciaInterface {
    public boolean agregar(Preferencia d);
    public boolean editar(Preferencia d);
    public boolean eliminar(Integer cod);
    public Preferencia listarUno(Integer cod);
    public ArrayList<Preferencia> listarTodo();
}