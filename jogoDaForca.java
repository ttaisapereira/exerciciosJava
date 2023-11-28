package fundamentos;

import java.util.Scanner;

public class jogoDaForca {


		public static void main(String[] args) {
	        String palavraChave = "macaxeira";
	        String letrasUsadas = " ";
	        String palavraAdivinhada = "";
	        int tentativas_MAX = 8;

	        for (int i = 0; i < palavraChave.length(); i++) {
	            palavraAdivinhada += "_";
	        }
	        	System.out.println("Bem vindo ao jogo da forca!");
	        	System.out.println("Adivinhe a palavra. Vamos começar!!");
	        for (int tentativas = 0; tentativas < tentativas_MAX; tentativas++) {
	        	System.out.printf("Rodada %d. Ate agora adivinhada: %s. Qual a letra?%n", tentativas + 1, palavraAdivinhada);

	            char letraTentada = new Scanner(System.in).next().charAt(0);

	            if (letrasUsadas.indexOf(letraTentada) >= 0) {
	                System.out.printf("Voce ja tentou a letra %c.%n", letraTentada);
	            } else {
	                letrasUsadas += letraTentada;

	                if (palavraChave.indexOf(letraTentada) >= 0) {
	                    palavraAdivinhada = "";

	                    for (int j = 0; j < palavraChave.length(); j++) {
	                        palavraAdivinhada += (letrasUsadas.indexOf(palavraChave.charAt(j)) >= 0) ? palavraChave.charAt(j) : "_";
	                    }

	                    if (palavraAdivinhada.contains("_")) {
	                        System.out.printf("Muito bom ^_^ ! %c existe na palavra. Ainda tem letras escondidas%n", letraTentada);
	                    } else {
	                        System.out.printf("Parabens o! A palavra adivinhada era '%s'%n", palavraAdivinhada);
	                        System.exit(0);
	                    }
	                } else {
	                    System.out.printf("Infelizmente a letra %c nao existe na palavra.%n " , letraTentada);
	                }
	            }
	        }

	        System.out.printf("Foram %d tentativas. A palavra era '%s'%n", tentativas_MAX, palavraChave);
	    }
	}
