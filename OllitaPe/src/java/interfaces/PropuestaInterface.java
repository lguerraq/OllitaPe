package interfaces;
import java.util.ArrayList;
public interface PropuestaInterface {
    public boolean agregar(Receta d);
    public boolean editar(Receta d);
    public boolean eliminar(Integer cod);
    public Receta listarUno(Integer cod);
    public ArrayList<Receta> listarTodo();
}
