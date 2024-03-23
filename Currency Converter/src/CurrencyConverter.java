import java.util.Scanner;

public class CurrencyConverter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre o valor em Real: ");
		double realAmount = sc.nextDouble();
		
		System.out.println("Para qual moeda você quer converter?");
		System.out.print("1 - Dólar Americano, 2 - Euro, 3 - Libra Esterlina");
		int answer = sc.nextInt();
		
		double dolarAmount = realAmount * 0.20;
		double eurAmount = realAmount * 0.18;
		double gbpAmount = realAmount * 0.16;
		
		switch (answer) {
		case 1:
			System.out.println("O valor em Dólar Americano é: " + dolarAmount);
			break;
		case 2:
			System.out.println("O valor em Euro é: " + eurAmount);
			break;
		case 3:
			System.out.println("O valor em Libra Esterlina é: " + gbpAmount);
			break;
		default:
			System.out.println("Opção Inválida!");
		}
		
		sc.close();
	}

}
