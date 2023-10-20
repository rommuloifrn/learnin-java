package s15_excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		
		method1();
		System.out.println("fim!");
		
	}
	
	public static void method1() {
		System.out.println("***method1 start");
		method2();
		System.out.println("***method1 end");
	}
	
	public static void method2() {
		System.out.println("***method2 start");
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] arr = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(arr[position]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("posição inválida!");
			e.printStackTrace();
			sc.next();
		}
		catch (InputMismatchException e) {
			System.out.println("erro de input");
		}
		
		sc.close();
		System.out.println("***method2 end");
	}

}
