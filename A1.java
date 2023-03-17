import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o valor: ");
		int n1 = sc.nextInt();

		System.out.println("Informe o valor: ");
		int n2 = sc.nextInt();

		int soma = n1 + n2;

		if (soma >= 20) {
			soma = soma + 8;
			System.out.println("Valor é: " + soma);

		} else {
			soma = soma - 5;
			System.out.println("valor é: " + soma);
		}

	}

}
