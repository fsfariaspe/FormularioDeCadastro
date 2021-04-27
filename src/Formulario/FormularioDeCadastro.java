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
		
		
		System.out.print("Olá, seu nome é: " + nome + "\nSeu CPF é: " + cpf + "\nSua idade é: " + idade + "\nSua altura é: " + altura + "\n");
		
		System.out.println("Digite o numero 1:");
		int numero1 = teclado.nextInt();
		System.out.println("Digite o numero 2:");
		int numero2 = teclado.nextInt();
		
		System.out.println("Os números são: " + numero1 + " e " + numero2);
		System.out.println("A soma é: " + (numero1 + numero2));
		System.out.println("A subtração é: " + (numero1 - numero2));
		System.out.println("A multiplicação é: " + (numero1 * numero2));
		System.out.println("A divisão é: " + (numero1 / numero2));
		
		
		
		
		
		
		
		

	}

}
