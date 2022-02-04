package arreglos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Colecciones {
	public static void main(String[] args) {
		//colecciones sirven para almacenar un conjunto de objetos
		/*la diferencia entre colecciones y objetos
		 * es que las colecciones son dinámicas, 
		 * pueden cambiar el número de objetos agregados*/
		
		/*Set: tiene 3 implementaciones,
		 * no puede contener elementos repetidos
		 *
		 * HashSet: elementos no mantienen un orden*/
		
		Set<String> frutas = new HashSet<String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		
		/*foreach, recorre una coleccion y en cada
		 * recorrido recupera el valor y lo podemos
		 * almacenar en una var*/
		for(String fruta : frutas){
			System.out.println(fruta);
		}
		
		Set<String> frutas1 = new TreeSet<String>();
		frutas1.add("mango");
		frutas1.add("granada");
		frutas1.add("piña");
		frutas1.add("sandia");
		frutas1.add("mamey");
		frutas1.add("fresa");
		
		/*foreach, recorre una coleccion y en cada
		 * recorrido recupera el valor y lo podemos
		 * almacenar en una var*/
		for(String fruta1 : frutas1){
			System.out.println(fruta1);
		}
		
		//Orden de velocidad 
		//1.HashSet
		//2.LinkedHashSet
		//3.TreeSet
		
		/*List: se permite elementos
		 * duplicados, acceder a elementos especificos
		 * buscar elementos*/
		System.out.println("***********************");
		/*Array List*/
		List<String> pokemones = new ArrayList<String>();
		pokemones.add("Chicorita");
		pokemones.add("Eevee");
		pokemones.add("Psyduck");
		pokemones.add("Dragonite");
		pokemones.add("Charizard");
		pokemones.add("Gengar");
		pokemones.add("Flygon");
		
		pokemones.add(2, "Pikachu"); //ponemos en posición 2 y desplaza los demas
		
		for (String pokemon : pokemones) {
			System.out.println(pokemon);
		}
		
		/*indexOf, nos devuleve posición del elemento
		 * si no esta, devuelve -1*/
		System.out.println(pokemones.indexOf("Charizard"));
		System.out.println(pokemones.indexOf("Charizar"));
		
		pokemones.remove(3);
		
		pokemones.set(4, "Articuno");
		for (String pokemon : pokemones) {
			System.out.println(pokemon);
		}
		
		System.out.println("*************");
		
		/*LinkedList: lista doblemente enlazada
		 * más rápido para insertar y remover elementos*/
		List<String> digimones = new LinkedList<String>();
		digimones.add("Agumon");
		digimones.add("Patamon");
		digimones.add("Angemon");
		digimones.add("Andromon");
		digimones.add("Greymon");
		
		/*Map: asocia claves a valores, no puede
		 * contener claves duplicadas, solo puede
		 * tener un valor asociado*/
		
		/*HashMap, tiene mejor rendimiento pero no garantiza un orden
		 * a la hora de hacer iteraciones*/
		Map <Integer, String> usuarios = new HashMap<Integer, String>();
		usuarios.put(1, "Oscar");
		usuarios.put(2, "Ro");
		usuarios.put(3, "Raul");
		
		System.out.println("*************");
		System.out.println(usuarios.get(2));
		
		/*keySet. permite recuperar 
		 * nombre de la clave,*/
		
		System.out.println(usuarios.keySet());
		
		/*values,  permite recuperar valor directamente*/
		System.out.println(usuarios.values());
		
		/*TreeMap*/
		Map<String, String> tamales = new TreeMap<String, String>();
		tamales.put("Oaxaqueño", "Mole Rojo");
		tamales.put("Torta", "Mole Verde");
		tamales.put("Dulce", "Gansito");
		tamales.put("Salado", "Cochinita");
		
		System.out.println(tamales.keySet());
		System.out.println(tamales.values());
		
		System.out.println(tamales);
		
		tamales.entrySet().forEach(elemento ->{
			System.out.println(elemento.getKey().toString() + elemento.getValue().toString());
			System.out.println(elemento.getKey());
			System.out.println(elemento.getValue());
		});
		
		/*LinkedHashMap*/
		Map<Integer, String> Carros = new LinkedHashMap<Integer, String>();
		Carros.put(1, "Volvo");
		Carros.put(567, "Pointer");
		Carros.put(8, "Mustang");
		
		System.out.println("******************");
		System.out.println("******************");
		System.out.println("******************");
	}
}
