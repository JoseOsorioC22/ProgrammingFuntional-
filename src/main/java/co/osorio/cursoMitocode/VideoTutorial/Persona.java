package co.osorio.cursoMitocode.VideoTutorial;

import java.time.LocalDate;

public class Persona {

    private Integer id;
    private String nombre;
    private LocalDate FechaNacimiento;

    public Persona(Integer id, String nombre, LocalDate fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        FechaNacimiento = fechaNacimiento;
    }

    public Persona()
    {

    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", FechaNacimiento=" + FechaNacimiento +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }

    public String camina()
    {
       return "La persona camina";
    }

}
