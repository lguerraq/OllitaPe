package interfaces;
import java.util.ArrayList;
import modelo.Categoria;

public interface CategoriaInterface {
    public boolean agregar(Categoria d);
    public boolean editar(Categoria d);
    public boolean eliminar(Integer cod);
    public Categoria listarUno(Integer cod);
    public ArrayList<Categoria> listarTodo();
}


