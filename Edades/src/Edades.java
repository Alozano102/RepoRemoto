import java.util.Scanner;

public class Edades {

	public static void main(String[] args) {
		int edad;
		boolean error = true ;
		Scanner teclado = new Scanner(System.in);
		
		
		while (error == true) {
			System.out.println("Introduzca su edad");
			edad = teclado.nextInt();
			
			if ( edad <0 || edad > 125) {
				System.out.println("Te has equivocado. Por favor introduzca un número entre 0 y 125");
			} else if (edad >= 0 && edad < 4){
				System.out.println(" Usted es un bebé ");
				error = false;
			} else if ( edad >= 5 && edad <= 12) {
				System.out.println(" Usted es un niño ");
				error = false;
			} else if (edad >= 12 && edad <= 18) {
				System.out.println(" Usted es un adolescente ");
				error = false;
			} else if (edad >=19 && edad <=64) {
				System.out.println(" Usted es un adulto ");
				error = false;
			} else if (edad >= 65 && edad <=125) {
				System.out.println(" Usted es un anciano ");
				error = false;
			} 			
		}

	} 

}


