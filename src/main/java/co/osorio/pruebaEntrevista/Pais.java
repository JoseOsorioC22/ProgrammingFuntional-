package co.osorio.pruebaEntrevista;

public class Pais {

    private int id;
    private String nombre;
    private String acronimo;
    private double cantidadVacunasCompradas;

    @Override
    public String toString() {
        return "co.osorio.pruebaEntrevista.Pais{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", acronimo='" + acronimo + '\'' +
                ", cantidadVacunasCompradas=" + cantidadVacunasCompradas +
                '}';
    }

    public Pais(int id, String nombre, String acronimo, double cantidadVacunas) {
        this.id = id;
        this.nombre = nombre;
        this.acronimo = acronimo;
        this.cantidadVacunasCompradas = cantidadVacunas;
    }

    public int getId() {
        return id;
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

    public String getAcronimo() {
        return acronimo;
    }

    public void setAcronimo(String acronimo) {
        this.acronimo = acronimo;
    }

    public double getCantidadVacunas() {
        return cantidadVacunasCompradas;
    }

    public void setCantidadVacunas(double cantidadVacunas) {
        this.cantidadVacunasCompradas = cantidadVacunas;
    }
}
