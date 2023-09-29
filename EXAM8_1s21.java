import java.util.Scanner;

public class EXAM8_1s21 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		int numero2;
		int resultado;
		System.out.println("8.- Escribir un programa que pida un número del 1 al 9, y escriba por pantalla la tabla de multiplicar correspondiente.");
		System.out.println("Ingresa un número del 1 al 9: ");
		numero = teclado.nextInt();

		if (numero >=1 && numero <=9){
			System.out.println("Tabla de multiplicacion del " + numero + ":");
			for (numero2 = 1; numero2 <= 10; numero2++){
				resultado = numero * numero2;
				System.out.println(numero + "x" + numero2 + "=" + resultado);
			}
		}
	}
}