package interfaces;
import java.util.ArrayList;
import modelo.Comida;

public interface comidaInterface {
    public boolean agregar(Comida d);
    public boolean editar(Comida d);
    public boolean eliminar(Integer cod);
    public Comida listarUno(Integer cod);
    public ArrayList<Comida> listarTodo();
}


