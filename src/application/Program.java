package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Empregado;
import entities.Tercerizado;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Empregado> lista = new ArrayList<>();

		System.out.print("QUANTOS EMPREGADOS SERÃO CADASTRADOS? ");
		int i = sc.nextInt();

		System.out.print("\nDADOS DOS FUNCIONÁRIOS\n");
		sc.nextLine();

		for (int contador = 1; contador <= i; contador++) {
			System.out.println("Entre com a informação do empregado #" + contador + "\n");
			System.out.println("NOME:");
			String nome = sc.nextLine();

			System.out.println("HORAS TRABALHADAS:");
			int horasTrab = sc.nextInt();

			System.out.println("VALOR HORA:");
			double valorHora = sc.nextDouble();

			System.out.println("TERCERIZADO? (y/n)");
			char resp = sc.next().charAt(0);

			if (resp == 'y') {
				System.out.println("VALOR ADICIONAL:");
				double valorAdicional = sc.nextDouble();
				Empregado emp = new Tercerizado(nome, valorHora, horasTrab, valorAdicional);
				lista.add(emp);
			} else {
				Empregado emp = new Empregado(nome, valorHora, horasTrab);
				lista.add(emp);
			}
			
			sc.nextLine();
			
		}
		
		for(Empregado empregado : lista) {
			System.out.println(empregado);
		}

		sc.close();

	}

}
