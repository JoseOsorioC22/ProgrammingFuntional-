package co.osorio.pruebaEntrevista;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class PruebaApp {


    /*
    Prueba Técnica #2:

Debido a la situación de emergencia sanitaria que está viviendo el mundo, hoy en día,
por la pandemia del COVID-19, las empresas farmacéuticas, tales como: 1. Pfizer 2. AstraZeneca 3. Moderna ,
hicieron un esfuerzo titánico y ya tienen una vacuna avalada por la OMS (Organización Mundial de la Salud).
Todos los países han iniciado gestiones, para adquirir esas vacunas, ya sea por acuerdos bilaterales o por medio
del mecanismo COVAX (de la OMS, para países pobres). En este contexto, la OPS (Organización Panamericana de la Salud)
desea obtener los siguientes datos, de estos países de Centroamérica y Suramérica: México, Costa Rica, Guatemala,
Honduras, Nicaragua, Panamá, Colombia, Chile, Ecuador, Argentina, Venezuela, Perú, Uruguay.
1. El país que menos vacunas ha adquirido
2. La farmacéutica que más vacunas ha vendido.....Defina la estructura que considere pertinente.

Nota: asumir que todos los países compraron vacunas.

return Arrays.stream(num)        // crear un stream
        .filter(i -> i != 0) // eliminar los ceros
        .min()               // elegir el menor
        .orElse(0);          // si ha ocurrido un error devolver 0
Compartir
     */


    public static void main (String[] args)
    {
        List<Registro> registros = new ArrayList<>();
        registros.add(
                new Registro (111, new Pais(121,"Colombia", "CO", 8000000),
                        new Farmaceutica(1541, "Astrazeneca", 8000000)));
        registros.add(
                new Registro (112, new Pais(122,"Peru", "PE", 1000),
                        new Farmaceutica(1541, "Astrazeneca", 1000)));

        registros.add(
                new Registro (113, new Pais(124,"Uruguay", "UR", 44000),
                        new Farmaceutica(1543, "Moderna", 44000)));

        registros.add(
                new Registro (114, new Pais(1243,"Mexico", "MX", 8000000),
                        new Farmaceutica(1548, "Sinovac", 8000000)));

        registros.add(
                new Registro (115, new Pais(121,"Colombia", "CO", 5000),
                        new Farmaceutica(1541, "Astrazeneca", 5000)));

        registros.add(
                new Registro (116, new Pais(1788,"Paraguay", "PR", 700000),
                        new Farmaceutica(1741, "Jhonson", 700000)));

        registros.add(
                new Registro (117, new Pais(121,"Colombia", "CO", 8000000),
                        new Farmaceutica(1541, "Astrazeneca", 8000000)));
        registros.add(
                new Registro (118, new Pais(1243,"Mexico", "MX", 700000000),
                        new Farmaceutica(1543, "Moderna", 700000000)));

/*
        System.out.println("el pais que menos vacunas tiene es: " +
                registros.stream().filter( y -> y.getPais().getId() ==
                        registros.stream().collect(Collectors.groupingBy( (p) -> p.getPais().getId(),
                Collectors.summingInt(reg -> (int)
reg.getPais().getCantidadVacunas()))).entrySet().stream().
                                min( (d,f) -> Integer.compare(d.getValue(), f.getValue()) )
                                .get().getKey()  ).findFirst().get().getPais().getNombre() );



        System.out.println("la farmaceutica que mas vendio vacunas es: " +
                registros.stream().filter( y -> y.getFarmaceutica().getId() ==
                        registros.stream().collect(Collectors.groupingBy( (p) -> p.getFarmaceutica().getId(),
                                        Collectors.summingInt(reg -> (int)
                                                reg.getFarmaceutica().getCantidadVendidas()))).entrySet().stream().
                                max( (d,f) -> Integer.compare(d.getValue(), f.getValue()) )
                                .get().getKey()  ).findFirst().get().getFarmaceutica().getNombre() );
*/





      /*
      .max(Map.Entry.comparingByValue()).get().getValue());
                 forEach((pais, cantidad) -> System.out.println("pais ->" + pais + " cantidad -> " + cantidad));
        for (co.osorio.pruebaEntrevista.Registro registro: registros) {
            System.out.println(registro.getPais().getNombre());
        }
*/

       // System.out.println("La farmaceutica que mas vacunas ha vendido es: ");






    }
}
