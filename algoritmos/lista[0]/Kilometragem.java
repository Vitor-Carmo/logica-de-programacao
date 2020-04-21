package exegith;

import java.util.Scanner;

public class Kilometragem {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		
		int x;
		double y, total;
		
		System.out.println("Digite um valor inteiro para a distancia total");
		x = in.nextInt();
		
		System.out.println("Digite o valor total do combustivel podendo ter até uma casa decimal");
		y = in.nextDouble();
		
		total = x/y;
		
		System.out.printf("%.3f km/l",total);

	}

}
