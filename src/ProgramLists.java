import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramLists {
	public static void main(String[] args) {
		// listas não aceitam tipos primitivos
		List<String> list = new ArrayList<>();
		list.add("mary marilu");
		list.add("mary mareshaw");
		list.add("Rosemary schiavon");
		list.add("Moneta biosch");
		list.add("george Maximus");
		list.add("geovanna biori");
		list.add(2, "evelina");
		System.out.println(list.size());
		for (String item : list) {
			System.out.println(item);
		}
		
		System.out.println("-----------------------------------------------");
		
		list.remove("mary marilu");
		list.remove(0);
		list.removeIf(x -> x.charAt(0) == 'G');
		System.out.println(list.size());
		for (String item : list) {
			System.out.println(item);
		}
		
		System.out.println("-----------------------------------------------");
		System.out.println("Index de Moneta: " + list.indexOf("Moneta biosch"));
		System.out.println("-----------------------------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'g').collect(Collectors.toList());
		System.out.println(result.size());
		for (String item : result) {
			System.out.println(item);
		}
		
		String name = list.stream().filter(x -> x.charAt(0) == 'g').findFirst().orElse(null);
		System.out.println("--===--");
		System.out.println(name);
	
	}
}
