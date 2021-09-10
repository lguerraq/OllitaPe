
package interfaces;
import java.util.ArrayList;
import modelo.Insumo;

public interface insumoInterface {
    public boolean agregar(Insumo d);
    public boolean editar(Insumo d);
    public boolean eliminar(Integer cod);
    public Insumo listarUno(Integer cod);
    public ArrayList<Insumo> listarTodo();
}


