import java.util.Scanner;

public class p9_1s21{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String operacion;
		int numero1;
		int numero2;
		double resultado;
		System.out.println("Que tipo de operacion desea realizar");
		System.out.println("escribala: Suma, Resta, division, multiplicacion");
		operacion = teclado.nextLine();

		if (operacion.equals("Suma")) {
			System.out.println("Haremos una suma");
			System.out.println("ingresa 2 numeros");
			numero1 = teclado.nextInt();
			numero2 = teclado.nextInt();
			resultado = numero1 + numero2;
			System.out.println("el resultado es: " + resultado);
		} else if (operacion.equals("Resta")){
			System.out.println("Haremos una resta");
			System.out.println("ingresa 2 numeros");
			numero1 = teclado.nextInt();
			numero2 = teclado.nextInt();
			resultado = numero1 - numero2;
			System.out.println("el resultado es: " + resultado);
		} else if (operacion.equals("division")){
			System.out.println("Haremos una division");
			System.out.println("ingresa 2 numeros");
			numero1 = teclado.nextInt();
			numero2 = teclado.nextInt();
			resultado = numero1 / numero2;
			System.out.println("el resultado es: " + resultado);
		} else if (operacion.equals("multiplicacion")){
			System.out.println("Haremos una multiplicacion");
			System.out.println("ingresa 2 numeros");
			numero1 = teclado.nextInt();
			numero2 = teclado.nextInt();
			resultado = numero1 * numero2;
			System.out.println("el resultado es: " + resultado);
		} else {
			System.out.println("No existe la operacion");
		}
	}
}
