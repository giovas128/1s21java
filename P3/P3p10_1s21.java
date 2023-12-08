import java.util.Scanner;

public class P3p10_1s21{

	public static double factorial(double n){
		double fac = 1;
		for (int i=0;i<n;i++) {
			fac*=i+1;
		}
		return fac;
	}

	public static double alcubo(double n){
		double resultado = 1;
		for (int i=0;i<n;i++) {
			resultado = Math.pow(n,3);
		}
		return resultado;
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese el valor de n: ");
		double n = teclado.nextInt();
		double resultado = 0;
		for (int i=0;i<n+1;i++) {
            double dividendo = alcubo(n)*factorial(i);
            resultado+= dividendo/factorial(n);
		}
		System.out.println(resultado);
	}
}
