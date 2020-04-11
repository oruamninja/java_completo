import java.util.Locale;

public class Main {

	public static void main(String[] args) {

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
		
		System.out.printf("Products:%n "
				+ "%s, which price is R$ %.2f %n "
				+ "%s, which price is %.2f %n%n"
				+ "Record: %d years old, code %d and gender: %s %n%n"
				+ "Measure with eight decimal places: %.8f %n"
				+ "Rouded (three decimal places): %.3f %n"
				+ "US decimal point: %.3f %n", 
				product1, price1, product2, price2, age, code, gender, measure, measure, measure);

	}

}
