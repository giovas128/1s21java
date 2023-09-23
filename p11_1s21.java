import java.util.Scanner;

public class p11_1s21 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("ingresar una operacion [suma,resta,multiplicacion,division,potencia,raiz cuadrada]: ");
		String opc="suma";
		int numero1;
		int numero2;
		int base;
		int potencia;
		int dividendo;
		int divisor;
		double resultado;
		opc=teclado.nextLine();
		switch(opc){
		case "suma":
			System.out.println("ingrese 2 numeros para la suma");
			numero1=teclado.nextInt();
			numero2=teclado.nextInt();
			resultado=numero1+numero2;
			System.out.println("el resultado es: " + resultado);
			break;
		case "resta":
			System.out.println("ingrese 2 numeros para la resta");
			numero1=teclado.nextInt();
			numero2=teclado.nextInt();
			resultado=numero1-numero2;
			System.out.println("el resultado es: " + resultado);
			break;
		case "multiplicacion":
			System.out.println("ingrese 2 numeros para la multiplicacion");
			numero1=teclado.nextInt();
			numero2=teclado.nextInt();
			resultado=numero1*numero2;
			System.out.println("el resultado es: " + resultado);
			break;
		case "division":
			System.out.println("ingrese 1 numero para el  dividendo");
			dividendo=teclado.nextInt();
			System.out.println("ingrese 1 numero para el  divisor");
			divisor=teclado.nextInt();
			resultado=dividendo/divisor;
			System.out.println("el resultado es: " + resultado);
			break;
		case "potencia":
			System.out.println("ingrese la base para la potencia");
			base=teclado.nextInt();
			System.out.println("ingrese la potencia");
			potencia=teclado.nextInt();
			resultado = Math.pow(base,potencia);
			System.out.println("el resultado es: " + resultado);
			break;
		case "raiz cuadrada":
			System.out.println("ingrese un numero para la raiz cuadrada");
			numero1=teclado.nextInt();
			resultado = Math.sqrt(numero1);
			System.out.println("el resultado es: " + resultado);
			break;
		default:
			System.out.println("no existe esa operacion");
		}
	}
}
