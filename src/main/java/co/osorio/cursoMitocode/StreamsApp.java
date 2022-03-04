package co.osorio.cursoMitocode;

import java.util.ArrayList;
import java.util.List;


public class StreamsApp {

    List<String> lista;

    public StreamsApp()
    {
        lista = new ArrayList<>();

        lista.add("Jose Osorio Catalan");
        lista.add("Andres Torres Perez");
        lista.add("Maria Montes");
        lista.add("Gabriel Ortega");
    }

    public void filtrar()
    {
        lista.stream().filter( (p) -> p.startsWith("M") ).forEach((reg) -> System.out.println(reg));
    }

    public void ordenar()
    {
        lista.stream().sorted().forEach(System.out::println);
    }

    public void transformar()
    {
        lista.stream().map((p) -> p.toUpperCase() ).forEach(System.out:: println);
    }
    public void limitar()
    {
        lista.stream().limit(2).forEach(System.out::println);
    }

    public void contar()
    {
        System.out.println(lista.stream().count() );;
    }

    public static  void main(String [] args)
    {
        StreamsApp app = new StreamsApp();
       // app.filtrar();
       // app.ordenar();
        // app.transformar();
      //  app.limitar();
       //  app.contar();
    }


}
