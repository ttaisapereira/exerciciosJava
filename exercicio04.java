package fundamentos;

import java.util.Scanner;

public class exercicio04 {

		public static void main(String[] args) {
			
			Scanner entrada = new Scanner (System.in);
			System.out.println("digite a primeira nota: ");
			double nota1 = entrada.nextDouble();
			System.out.println("digite a segunda nota: ");
			double nota2 = entrada.nextDouble();
			double media = (nota1 + nota2) /2;
			System.out.println(media);
			
			if (media >=7) {
				System.out.println("Aprovado");	
			}else if (media <=4) {
				System.out.println("Reprovado");
			}else {
				System.out.println("Recuperacao");
			}
				
		}
	}
