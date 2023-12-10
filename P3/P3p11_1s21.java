import java.util.Scanner;

public class P3p11_1s21 {

	public static int factorial(int n){
		int fac = 1;
		for (int k=0;k<n;k++) {
			fac*=k+1;
		}
		return fac;
	}

	public static int resultado(int n){
		int dividendo = 0;
		for (int k=0;k<=n;k++) {
			dividendo = factorial(n)/(factorial(k)*factorial(n-k));
			System.out.print(dividendo+",");
		}
		return dividendo;
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("ingrese el valor de n: ");
		int n = teclado.nextInt();
		for (int k=0;k<=n;k++) {
			resultado(k);
			System.out.println("");
		}
	}
}
