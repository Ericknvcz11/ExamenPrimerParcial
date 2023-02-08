import java.util.Scanner;
public class Examen {
		
	public static void primeraMayuscula() {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Ingresa tu cadena de texto para cambiar la primer letra a mayuscula: "); 
		String frase = scanner.nextLine();
		int length = frase.length();
		String upperString = frase.toUpperCase(); 
		char firstChar = upperString.charAt(0);
		String subString = frase.substring(1, length); 
		String juntar = firstChar + subString;
		System.out.println(juntar); 
	}	
	
	public static void invertirCadena() {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Ingresa tu cadena de texto para invertirla: "); 
		String cadena = scanner.nextLine();
		String cadenainv = ""; 
		for (int n = cadena.length() - 1; n >= 0; n--) {
			cadenainv += cadena.charAt(n); 
		}
		System.out.println(cadenainv); 
	}
	
	public static void vocalesMayuscula() { 
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Ingresa tu cadena de texto para cambiar las vocales a mayusculas: "); 
		String vocmayu = scanner.nextLine();
		String replaceA = vocmayu.replace("a", "A"); 
		String replaceE = replaceA.replace("e", "E"); 
		String replaceI = replaceE.replace("i", "I"); 
		String replaceO = replaceI.replace("o", "O"); 
		String replaceU = replaceO.replace("u", "U");  
		System.out.println(replaceU); 
	}
	
	 public static void fizzBuzz() {
		 System.out.println("Numeros del 1-100 con Fizz y Buzz: "); 
	        for (int n = 1; n <= 100; n++) {
	        	if (n % 3 == 0 && n % 5 ==0) {
	        		System.out.println("FizzBuzz"); 
	        	}
	        	else if (n % 3 == 0) {
	        		System.out.println("Fizz"); 
	        	}
	        	else if (n % 5 == 0) {
	        		System.out.println("Buzz"); 	        		
	        	}
	        	else {
	        		System.out.println(n); 
	        	}
	        }
	    }
	 
	public static void palindromo() {
	Scanner scanner = new Scanner(System.in); 
	System.out.println("Ingresa tu cadena de texto para saber si es un palindromo o no; "); 
	String cadena = scanner.nextLine();
	String lowerString = cadena.toLowerCase();
	String replacesp = lowerString.replace(" ", "");
	String cadenainv = ""; 
	for (int n = replacesp.length() - 1; n >= 0; n--) {
		cadenainv += replacesp.charAt(n); 
		}
	Boolean result = cadenainv.equals(replacesp);
	if (result == true) {
		System.out.println("Tu cadena es un palindromo"); 
	}
	else {
		System.out.println("Tu cadena no es un palindromo"); 
	}
	}
}
