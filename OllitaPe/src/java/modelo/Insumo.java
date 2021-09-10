package modelo;

public class Insumo {
    private int idInsumo;
    private String nombre;
    private int idCategoria;
    private int idMedida;
    private double precio;

    public Insumo() {
    }

    public Insumo(int idInsumo, String nombre, int idCategoria, int idMedida, double precio) {
        this.idInsumo = idInsumo;
        this.nombre = nombre;
        this.idCategoria = idCategoria;
        this.idMedida = idMedida;
        this.precio = precio;
    }

    public int getIdInsumo() {
        return idInsumo;
    }

    public void setIdInsumo(int idInsumo) {
        this.idInsumo = idInsumo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getIdMedida() {
        return idMedida;
    }

    public void setIdMedida(int idMedida) {
        this.idMedida = idMedida;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    
    

  
}
