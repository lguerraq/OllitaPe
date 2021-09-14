package interfaces;
import java.util.ArrayList;
import modelo.Receta;
public interface RecetaInterface {
    public boolean agregar(Receta d);
    public boolean editar(Receta d);
    public boolean eliminar(Integer cod);
    public Receta listarUno(Integer cod);
    public ArrayList<Receta> listarTodo();
}
