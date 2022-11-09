package unico;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

//Diseñar un programa que muestre el producto de los 10 primeros números impares .
		
		final int TOPE = 10;
		
		int contador = 0;
		int prodimpar = 0;  
		int i;
		
		for (i = 1; i <= TOPE; i++) {
		   if (i % 2 != 0) {
		       contador ++;
		       prodimpar = contador*i;
		   }
		}
		System.out.println("El producto de los " + TOPE + " primeros números impares es: " + prodimpar);
	}
}