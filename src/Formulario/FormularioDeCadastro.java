package Formulario;

import java.util.Scanner;

public class FormularioDeCadastro {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite o seu nome:");
		String nome = teclado.nextLine();
		System.out.println("Nome: " + nome);
		
		System.out.println("Digite seu CPF:");
		String cpf = teclado.nextLine();
		System.out.println("CPF: " + cpf);
		
		System.out.println("Digite sua idade:");
		int idade = teclado.nextInt();
		System.out.println("Idade: " + idade);
		
		System.out.println("Digite sua altura");
		double altura = teclado.nextDouble();
		System.out.println("Altura: " + altura);
		
		
		System.out.print("Ol�, seu nome �: " + nome + "\nSeu CPF �: " + cpf + "\nSua idade �: " + idade + "\nSua altura �: " + altura + "\n");
		
		System.out.println("Digite o numero 1:");
		int numero1 = teclado.nextInt();
		System.out.println("Digite o numero 2:");
		int numero2 = teclado.nextInt();
		
		System.out.println("Os n�meros s�o: " + numero1 + " e " + numero2);
		System.out.println("A soma �: " + (numero1 + numero2));
		System.out.println("A subtra��o �: " + (numero1 - numero2));
		System.out.println("A multiplica��o �: " + (numero1 * numero2));
		System.out.println("A divis�o �: " + (numero1 / numero2));
		
		
		
		
		
		
		
		

	}

}
