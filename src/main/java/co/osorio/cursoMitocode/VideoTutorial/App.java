package co.osorio.cursoMitocode.VideoTutorial;

import java.text.CollationElementIterator;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static int getEdad(LocalDate fecha) {
        return Period.between(fecha, LocalDate.now()).getYears();
    }


    public static void main(String[] args) {
        // personas

        Persona persona1 = new Persona(78237, "Jose Osorio Catalan", LocalDate.of(2000, 8, 28));
        Persona persona2 = new Persona(78237, "Gustavo Torres Torres", LocalDate.of(1999, 1, 8));
        Persona persona3 = new Persona(78237, "Fernando Ortega Montes", LocalDate.of(1987, 5, 5));
        Persona persona4 = new Persona(78237, "Maria Montes Perez", LocalDate.of(2001, 3, 9));
        Persona persona5 = new Persona(78237, "Ana Yepes Osorio", LocalDate.of(2000, 12, 31));
        Persona persona6 = new Persona(78237, "Luis Perez Perez ", LocalDate.of(1937, 9, 12));
        Persona persona7 = new Persona(78237, "Carlos Espinosa Espinosa", LocalDate.of(2008, 11, 4));
        Persona persona8 = new Persona(78237, "Jose Osorio Catalan", LocalDate.of(2001, 8, 28));
        // ana
        // carlos,
        // fernando,
        // gustavo,
        // jose,
        // luis,
        // maria


        // productos
        Producto producto1 = new Producto(45, "Bandeja paisa", 20.5);
        Producto producto2 = new Producto(786, "Casuela de marizcos", 35.5);
        Producto producto3 = new Producto(454, "Ceviche", 15.5);
        Producto producto4 = new Producto(459, "Ceviche", 19.5);


        // Lista de personas
        List<Persona> personas = Arrays.asList(persona1, persona2, persona3, persona4, persona5, persona6, persona7, persona8);

        // Lista de productos
        List<Producto> productos = Arrays.asList(producto1, producto2, producto3, producto4);

    /*
    System.out.println("Los nombres de las personas que se encuentran en la lista son: ");
    // imprimir los nombres de todas las personas
    personas.forEach( (p) ->  System.out.println(p.getNombre())  );

    // imprimir las personas que son menores de edad

    System.out.println("devuelve las personas menores a 18 años");
    personas.stream()
            .filter( (p) -> App.getEdad(p.getFechaNacimiento()) < 18 )
            .collect(Collectors.toList())
            .forEach(p -> System.out.println(p.getNombre())) ;
*/

        // generar una lista de las edades de las personas que se encuentran en la lista

    /*
    System.out.println("Las edades de las personas que se encuentran en la lista son: ");
    List<Integer> lista = personas.stream().map( p -> App.getEdad(p.getFechaNacimiento())).collect(Collectors.toList());
   lista.forEach(System.out::println);
     */

        // ordenar la lista de personas por el nombre y la edad.

        Comparator<Persona> byNameAsc = (Persona per1, Persona per2) -> per1.getNombre().compareTo(per2.getNombre());
        Comparator<Persona> byAge = (Persona person1, Persona person2) -> person1.getFechaNacimiento().compareTo(person2.getFechaNacimiento());

        // Ordernar la lista de personas por el criterio de Nombre y la edad

       /*

       // ORDENAR POR DOS CRITERIOS

        personas.stream()
                .sorted(byNameAsc.thenComparing(byAge))
                .collect(Collectors.toList())
                .forEach((p) -> System.out.println(p.getNombre().concat(", con edad: ").
                        concat("" + App.getEdad(p.getFechaNacimiento())))); */

// MATCH

        /*
        Predicate<Persona> pred = (p) -> (App.getEdad(p.getFechaNacimiento()) > 90);

        boolean resultadoConAnyMatch = personas.stream().anyMatch(pred);
        boolean resultadoConAllMatch = personas.stream().allMatch(pred);
        boolean resultadoConNoneMatch = personas.stream().noneMatch(pred);


        System.out.println("el resultado de esa lista (con AnyMatch) es: " + resultadoConAnyMatch);
        System.out.println("el resultado de esa lista (con AllMatch) es: " + resultadoConAllMatch);
        System.out.println("el resultado de esa lista (NoneMatch) es: " + resultadoConNoneMatch);
*/

        // SKIP Y LIMIT PARA PAGINACION
/*
        // Numero de pagina
        int pageNumber = 0;

        // Longitud de la pagina
        int pageSize = 2;

        personas.stream()
                .skip(pageNumber).limit(pageSize).forEach((p) -> System.out.println(p.getNombre()));


        // agrupando por nombre y contando cuantos productos existen con dicho nombre.
 productos
                .stream()
                .collect(Collectors.groupingBy
                        (Producto::getNombre,
                                Collectors.counting()))
                .forEach( (p,k) -> System.out.println("clave " + p  + "- valor: " + k )  );



// agrupando por nombre y sumando el precio de cada producto por nombre.

        productos.stream()
                .collect(Collectors.groupingBy(
                        Producto::getNombre, Collectors.summingDouble(Producto::getPrecio)
                )).forEach((k,v) -> System.out.println("clave: " + k +  " - valor:  " + v ) );  ;


          Optional<Double>   op =    productos.stream().map(Producto::getPrecio).reduce(Double::sum)  ;

          System.out.println("Opcional: " + op.get());
*/


    }


}
