package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutSourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		
		System.out.println("Enter the number of employees:");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++ ) {
			System.out.println("é terceirizado? s/n");
			String x = sc.next();
			sc.nextLine();
			if (x.equals("s")) {
				
				System.out.print("nome: ");
				String name = sc.nextLine();
				System.out.print("horas: ");
				int horas = sc.nextInt();
				System.out.print("Valor por Hora: ");
				double valorPorHora = sc.nextDouble();
				System.out.print("dispesas adicionais: ");
				double dispesas = sc.nextDouble();
				OutSourcedEmployee funcionario = new OutSourcedEmployee(name, horas, valorPorHora, dispesas);
				list.add(funcionario);
			}
			if (x.equals("n")) {
				
				System.out.print("nome: ");
				String name = sc.nextLine();
				System.out.print("horas: ");
				int horas = sc.nextInt();
				System.out.print("Valor por Hora: ");
				double valorPorHora = sc.nextDouble();
				Employee funcionario = new Employee(name, horas, valorPorHora);
				list.add(funcionario);
			}
		}
		
		for (Employee y : list) {
			System.out.println(y.getName() + " - $ " + y.payment());
		}
		
		sc.close();

	}

}
