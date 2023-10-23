import java.util.HashMap;
import java.util.Map;

public class DiccionarioEjemplo {
    public static void main(String[] args) {
        // 1. Crear un HashMap vacío
        Map<String, Integer> map = new HashMap<>();

        // 2. Añadir elementos
        map.put("Uno", 1);
        map.put("Dos", 2);
        map.put("Tres", 3);

        // 3. Obtener un elemento por clave
        int valor = map.get("Dos");
        System.out.println("Valor asociado a 'Dos': " + valor);  // Salida: Valor asociado a 'Dos': 2

        // 4. Verificar si contiene una clave
        boolean contiene = map.containsKey("Cuatro");
        System.out.println("¿Contiene 'Cuatro'? " + contiene);  // Salida: ¿Contiene 'Cuatro'? false

        // 5. Modificar el valor asociado a una clave
        map.put("Dos", 22);
        System.out.println("Nuevo valor de 'Dos': " + map.get("Dos"));  // Salida: Nuevo valor de 'Dos': 22

        // 6. Eliminar un elemento por clave
        map.remove("Dos");

        // 7. Iterar sobre el HashMap
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // 8. Tamaño del HashMap
        System.out.println("Tamaño del map: " + map.size());

        // 9. Limpiar el HashMap
        map.clear();
        System.out.println("Tamaño del map después de limpiar: " + map.size());
    }
}
