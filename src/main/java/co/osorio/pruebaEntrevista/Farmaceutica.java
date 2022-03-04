package co.osorio.pruebaEntrevista;

public class Farmaceutica {

    private int id;
    private String nombre;
    private double cantidadVendidas;

    public Farmaceutica(int id, String nombre, double cantidadVendidas) {
        this.id = id;
        this.nombre = nombre;
        this.cantidadVendidas = cantidadVendidas;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "co.osorio.pruebaEntrevista.Farmaceutica{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", cantidadVendidas=" + cantidadVendidas +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCantidadVendidas() {
        return cantidadVendidas;
    }

    public void setCantidadVendidas(double cantidadVendidas) {
        this.cantidadVendidas = cantidadVendidas;
    }
}
