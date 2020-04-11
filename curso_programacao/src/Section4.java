import java.util.Locale;
import java.util.Scanner;

public class Section4 {
	
	public void saidaDados() {

		Locale.setDefault(Locale.US);

		double y = 32.2335365;
		System.out.println(y);
		System.out.printf("%.2f%n", y); // imprimir um valor double formatado.

		System.out.println("Hello World !");

		System.out.printf("O valor a pagar é: %.2f reais%n", y); // concatenar e formatar valor

		String nome = "João";
		int idade = 15;
		double salario = 1500.0;

		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, salario);

		String product1 = "Computer";
		String product2 = "Office Desk";

		int age = 30;
		int code = 5290;
		char gender = 'F';

		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.printf("Products:%n " + "%s, which price is R$ %.2f %n " + "%s, which price is %.2f %n%n"
				+ "Record: %d years old, code %d and gender: %s %n%n" + "Measure with eight decimal places: %.8f %n"
				+ "Rouded (three decimal places): %.3f %n" + "US decimal point: %.3f %n", product1, price1, product2,
				price2, age, code, gender, measure, measure, measure);

	}
	
	public void entradaDados() {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		char c;
		
		x = sc.next(); // ler um texto;
		y = sc.nextInt();  // ler numero inteiro;
		z = sc.nextDouble(); // let numero casas decimais;
		c = sc.next().charAt(0); // let o valor e pega o primeiro caracter da string;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(c);
		
		sc.close();
	}
	
	public void funcoesMatematicas() {
		
		double A, B, C;
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		
		A = Math.sqrt(x); // raiz quadrada
		B = Math.pow(x, y); // potenciação
		C = Math.abs(z); // valor absoluto
		
		System.out.println("A raiz quadrada de " + x + " é " + A);
		System.out.println(x +  " elevedado " + y + " é igual a " + B);
		System.out.println("Valor absoluto de " + z + " é igual a " + C);
		
		
	}
}
