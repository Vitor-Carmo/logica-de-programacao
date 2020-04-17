package exegith;

import java.util.Scanner;

public class AreaDoCirculo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		double area, raio, pi = 3.14159f;
		
		System.out.println("Por favor digite o valor do raio");
		raio = in.nextDouble();
		
		area = pi*(raio*raio);
		
		System.out.printf("A = %.4f",area);
	}

}
