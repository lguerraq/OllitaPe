package modelo;
public class Preferencia {
    private int idPreferencia ;
    private String nombre ;

    public Preferencia(int idPreferencia, String nombre) {
        this.idPreferencia = idPreferencia;
        this.nombre = nombre;
    }

    public Preferencia() {
    }

    public int getIdPreferencia() {
        return idPreferencia;
    }

    public void setIdPreferencia(int idPreferencia) {
        this.idPreferencia = idPreferencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
  
}