package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaPj;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Pessoa> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 1; i<=n; i++) {
			
			System.out.println("Tax payer #"+ i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char c = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String nome = sc.nextLine();
			System.out.print("Anual income: ");
			double rendaAnual = sc.nextDouble();
						
			if (c == 'i') {
				System.out.print("Health expenditures: ");
				double gastosSaude = sc.nextDouble();
				list.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
				
			} else {
				System.out.print("Number of employees: ");
				int numFunc = sc.nextInt();
				list.add(new PessoaPj(nome, rendaAnual, numFunc));
			}
		}
		System.out.println();
		System.out.println("TAXES PAID:");
		
		double total =0.0;
		for(Pessoa pessoa : list) {
			
			System.out.println(pessoa.getNome() + ": $ " +
					String.format("%.2f", pessoa.imposto()));
			total += pessoa.imposto();
		}
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", total));
		
		
		
		
		sc.close();

	}

}
