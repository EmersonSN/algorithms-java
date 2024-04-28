package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marcos");
		list.add("Emerson");
		list.add("Everton");

		System.out.println(list.size());

		for (String obj : list) {
			System.out.println(obj);
		}

		System.out.println("*/*/*/*//**/*/*//*/*/*/**/*/*/*/");

		list.remove("Anna");
		list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'M');/* Lambda/pedicado que apagado tudo que inicia com M */

		for (String obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("*/*/*/*//**/*/*//*/*/*/**/*/*/*/");
		
		System.out.println("Index of Bob: " + list.indexOf("Bob"));/*Se não tiver então retorna -1*/
		
		System.out.println("*/*/*/*//**/*/*//*/*/*/**/*/*/*/");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'E').collect(Collectors.toList());
		
		for (String obj : result) {
			System.out.println(obj);
		}
		System.out.println("*/*/*/*//**/*/*//*/*/*/**/*/*/*/");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'E').findFirst().orElse(null);
		
		System.out.println(name);
	}

}
