package co.osorio.EjerciciosCodigoFacilito;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CursoApp {

    public List<Curso> cursos;

    public CursoApp() {
        cursos = new ArrayList<>();
        cursos.add(new Curso(23, "Cursos profesional de Java", 6.5f, 50, 200));
        cursos.add(new Curso(53, "Cursos profesional de Python", 8.5f, 60, 800));
        cursos.add(new Curso(64, "Cursos profesional de DB", 4.5f, 70, 700));
        cursos.add(new Curso(14, "Cursos profesional de Android", 7.5f, 10, 400));
        cursos.add(new Curso(324, "Cursos profesional de Escritura", 1.5f, 10, 300));
    }

    // Obtener la cantidad de cursos con una duración mayor a 5 horas.

    public void obtenerCursoConDuracionMayorA5() {
        System.out.println("Cursos con duracion mayor a 5 horas: ");
        cursos.stream().filter((curso) -> curso.getDuracion() > 5).
                forEach((p) -> System.out.println("curso: " + p.getTitulo()));
    }

//   Obtener la cantidad de cursos con una duración menor a 2 horas.

    public void obtenerCursosConDuracionMenorA2() {
        System.out.println("Cursos con duracion menor a 2 horas: ");

        cursos.stream().filter((p) -> p.getDuracion() < 2).forEach((l) -> System.out.println("curso: " + l.getTitulo()));

    }

    //  Listar el título de todos aquellos cursos con una cantidad de vídeos mayor a 50.

    public void cursosConVideosMayoresA50() {
        System.out.println("Cursos con videos mayores a 50: ");
        cursos.stream().filter((curso) -> curso.getVideos() > 50).forEach((p) -> {
            System.out.println(p.getTitulo());
        });
    }

    //     Mostrar en consola el título de los 3 cursos con mayor duración.

    public void cursosConMayorDuracion() {
        System.out.println("Cursos con mayor duracion: ");

        cursos.stream().sorted((d1, d2) -> Float.compare(d2.getDuracion(), d1.getDuracion())).
                limit(3).forEach(curso -> System.out.println(curso.getTitulo()));
    }

    //Mostrar en consola la duración total de todos los cursos.

    public void DuracionTotalCursos() {
        System.out.println("la duracion total de todos los cursos es: " +
                cursos.stream().mapToDouble(p -> p.getDuracion()).sum());
        ;
    }

    // Mostrar en consola todos aquellos libros que superen el promedio en cuanto a duración se refiere.
    public void CursosSuperanPromedio() {
        System.out.println("Los cursos que superan el promedio son: ");

        cursos.stream().filter(curso -> curso.getDuracion() > cursos.stream().
                        mapToDouble(o -> o.getDuracion()).sum() / cursos.stream().count()).
                forEach((p) ->
                {
                    System.out.println(p.getTitulo());
                });
    }

    // Mostrar en consola la duración de todos aquellos cursos que tengan una cantidad de alumnos inscritos menor a 500.

    public void CursosConCantidadDeAlumnosMenorA500() {
        System.out.println("Los cursos con una cantidad de alumnos mayor a 500 es: ");

        cursos.stream().filter((k) -> k.getAlumnos() > 500).
                forEach((t) -> System.out.println("Curso: " + t.getTitulo()));
    }

// Mostrar el curso con mayor duracion

    public void CursoConMayorDuracion() {
        System.out.println("El curso con mayor duracion es: " +
                cursos.stream().max((p, k) -> Float.compare(p.getDuracion(), k.getDuracion())).get().getTitulo());
    }

    //     Crear una lista de Strings con todos los titulos de los cursos.
    public List<String> NombresCursos() {
        return cursos.stream().map((p) -> p.getTitulo()).collect(Collectors.toList());
    }


    public static void main(String[] args) {
        CursoApp app = new CursoApp();
        app.obtenerCursoConDuracionMayorA5();
        app.obtenerCursosConDuracionMenorA2();
        app.cursosConVideosMayoresA50();
        app.cursosConMayorDuracion();
        app.DuracionTotalCursos();
        app.CursosSuperanPromedio();
        app.CursosConCantidadDeAlumnosMenorA500();
        app.CursoConMayorDuracion();
        System.out.println("La lista de String es: ");
        app.NombresCursos().stream().forEach((p) -> System.out.println(p));

    }

}
