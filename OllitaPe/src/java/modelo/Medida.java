package modelo;

public class Medida {
    private int idMedida ;
    private String nombre ;
    private String prefijo ;

    public Medida() {
    }

    public Medida(int idMedida, String nombre, String prefijo) {
        this.idMedida = idMedida;
        this.nombre = nombre;
        this.prefijo = prefijo;
    }

    public int getIdMedida() {
        return idMedida;
    }

    public void setIdMedida(int idMedida) {
        this.idMedida = idMedida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrefijo() {
        return prefijo;
    }

    public void setPrefijo(String prefijo) {
        this.prefijo = prefijo;
    }
      
}
