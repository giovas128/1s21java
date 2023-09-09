import java.util.Scanner;

class p4_1s21{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String cadena;
		String cadena1;
		String cadena2;
		String cadena3;
		System.out.println("Ingresa tu numero");
		cadena = teclado.nextLine();
		System.out.println("Ingresa tu edad");
		cadena1 = teclado.nextLine();
		System.out.println("Ingresa tu nombre");
		cadena2 = teclado.nextLine();
		System.out.println("Ingresa tu correo");
		cadena3 = teclado.nextLine();
		System.out.println("Tu numero es " + cadena);
		System.out.println("Tu edad es " + cadena1);
		System.out.println("Tu nombre es " + cadena2);
		System.out.println("Tu correo es " + cadena3);

	}
}