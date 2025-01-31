package com.campusdual.classroom;

import java.util.HashMap;
import java.util.Map;

public class Exercise23 {

    /*
  CRITERIOS PARA ESCOGER ENTRE ALTERNATIVAS

  EFICIENCIA .- ¿Qué opción consume menos recursos ?
  LEGIBILIDAD .- ¿Qué opción tiene código más legible y conciso?
  MANEJO DE ERRORES .- ¿Qué opción es menos susceptible de provocar errores?
  FLEXIBILIDAD .- ¿Qué opción aporta más opciones?
*/

    public static void main(String[] args) {
        Map<String, Person> map = createHashMap();
        addMapValue(map, "police", new PoliceOfficer("Charles", "Boyle", "B-99"));
        printMapValues(map);
    }

    public static Map<String, Person> createHashMap() {
        //Crear una colección de tipo Map e inicializarlo como HashMap en el metodo createHashMap().

        Map<String, Person> map = new HashMap<>();

        // Luego poblar el mapa con diferentes entradas
        map.put("person", new Person("John", "Smith"));
        map.put("teacher", new Teacher("María", "Montessori", "Educación"));
        map.put("police", new PoliceOfficer("Jake", "Peralta", "B-99"));
        map.put("doctor", new Doctor("Gregory", "House", "Nefrología e infectología"));
        //y devolver el mapa creado.
        return map;
    }

    public static Person addMapValue(Map<String, Person> map, String key, Person value) {
        //Añadir una entrada más al mapa en el metodo addMapValue()
        map.put(key, value);

        return map.get(key);
    }


    //Crear un metodo printMapValues() que reciba un mapa y recorra cada entrada del mismo, imprimiendo los detalles de cada value
    public static void printMapValues(Map<String, Person> map) {
        for (Map.Entry<String, Person> entry : map.entrySet()) {
            System.out.println("Clave " + entry.getKey() + ", ");
            entry.getValue().getDetails();//Vai fora do System.out.printl porque estes métodos xa teñen integrado un sout
        }


        //Streams en java

        //map.forEach((key, value)-> {
        //  value.getDetails();
        //});
    }

}
