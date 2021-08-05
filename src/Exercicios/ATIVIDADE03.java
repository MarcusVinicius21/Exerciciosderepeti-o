package Exercicios;

import java.util.Scanner;

public class ATIVIDADE03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int idade = 0, GP1 = 0, GP2 = 0;
		
		while(idade <= 100) {
			System.out.println("Digite sua idade: ");
			idade = entrada.nextInt();
			idade++;
			
			if(idade <=21) {
				GP1= GP1 +1;
				System.out.println("Qtde de pessoas menor de idade: " + GP1);
			}else if(idade >=51 && idade<=99) {
				GP2 = GP2 + 1;
				System.out.println("Qtde de pessoas com mais de 50 anos: " + GP2);
			}
			
		
		}
		
		entrada.close();
	}

}