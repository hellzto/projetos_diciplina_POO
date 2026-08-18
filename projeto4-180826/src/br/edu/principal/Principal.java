package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o dia de 1 a 7: ");
		int dia = scanner.nextInt();
		
		//IF - ESLE-IF
		/*
		if (dia == 1) {
			System.out.print("Domingo");
			
		}
		else if(dia == 2) {
			System.out.print("Segunda");
			
		}
		else if(dia == 3) {
			System.out.print("Terça");
			
		}
		else if(dia == 4) {
			System.out.print("Quarta");
			
		}
		else if(dia == 5) {
			System.out.print("Quinta");
			
		}
		else if(dia == 6) {
			System.out.print("Sexta");
			
		}
		else if(dia == 7) {
			System.out.print("Sábado");
			
		}
		 
		else{
			System.out.print("Esse dia não existe!");
			
		}
		*/
		
		
		//SWITCH-CASE
		/*
		switch(dia) {
		case 1:
			System.out.print("Domingo");
			break;
		case 2:
			System.out.print("Segunda");
			break;
		case 3:
			System.out.print("Terça");
			break;
		case 4:
			System.out.print("Quarta");
			break;
		case 5:
			System.out.print("Quinta");
			break;
		case 6:
			System.out.print("Sexta");
			break;
		case 7:
			System.out.print("Sábado");
			break;
		default:
			System.out.print("Esse dia não existe!");
		}
		*/
		
		
		//SWITCH-CASE moderno
		switch(dia) {
			case 1 -> System.out.print("Domingo");
			case 2 -> System.out.print("Segunda");
			case 3 -> System.out.print("Terça");
			case 4 -> System.out.print("Quarta");
			case 5 -> System.out.print("Quinta");
			case 6 -> System.out.print("Sexta");
			case 7 -> System.out.print("Sábado");
			default -> System.out.print("Esse dia não existe!");
		}
		
	}

}
