package modelo;
public class Servicio {
    private int idServicio ;
    private String nombre ;

    public Servicio(int idServicio, String nombre) {
        this.idServicio = idServicio;
        this.nombre = nombre;
    }

    public Servicio() {
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
  
}