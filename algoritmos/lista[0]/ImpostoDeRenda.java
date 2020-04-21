package exegith;

import java.util.Scanner;

public class ImpostoDeRenda {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double salario,ir=0,resto=0;

		System.out.println("Digite o valor do salario");
		salario = in.nextDouble();
		
		if(salario <= 2000.00) {
			System.out.println("Isento");
		}else if(salario > 3000.00) {
			salario = salario - 2000.00;
			ir = salario*0.08;
			if(ir > 1000) {
				resto = (ir - 1000.00)*0.18;
			}
			
			System.out.printf("R$ %.2f",(ir+resto));
			
			}else if(salario > 4500.00) {
				salario = salario - 2000.00;
				
				
				
				System.out.printf("R$ %.2f",(ir+resto));
			}
		}

}
