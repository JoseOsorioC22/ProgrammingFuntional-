package co.osorio.cursoMitocode;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapApp {

    Map<Integer, String> map;

    public void poblar ()
    {
        map = new HashMap<>();
        map.put(111,"Jose Osorio Catalan");
        map.put(775, "Francisco Perez");
        map.put(547,"Gustavo Gomez");

    }

    public void recorrer()
    {
        map.entrySet().stream().filter((k) -> k.getKey() >=547 ).forEach(System.out::println);

    }

    public void insertarSiAsusente()
    {
        map.putIfAbsent(3321, "Fernando Ortega AA");
    }

    public void recolectar()
    {
        map.entrySet().stream().filter( p -> p.getValue().toUpperCase().
        contains("c".toUpperCase() )).collect(Collectors.toMap(k -> k.getKey(), t -> t.getValue() )).forEach( (k,v) -> System.out.println("llave: " + k + " - valor: " + v) );

    }

    public void  obtenerOrPredeterminado()
    {
      System.out.println(  "predeterminado: " + map.getOrDefault(73336,"Por defecto"));
    }

    public static void main(String [] args)
    {
        MapApp app = new MapApp();
        app.poblar();
        /*
        app.insertarSiAsusente();
        app.obtenerOrPredeterminado();
        app.recorrer(); */

        app.recolectar();


    }


}
