import java.util.Scanner;

public class P3p1_1s21{
	static Scanner teclado = new Scanner(System.in);
    public static void Suma(){
    	System.out.println("haremos una suma");
    	System.out.print("ingrese 1 numero: ");
    	int a=teclado.nextInt();
    	System.out.print("ingrese el siguiente numero: ");
    	int b=teclado.nextInt();
    	int c=a+b;
    	System.out.println("el resutado de la suma es: " + c);
    }
    public static void Resta(){
    	System.out.println("haremos una resta");
    	System.out.print("ingrese 1 numero: ");
    	int a=teclado.nextInt();
    	System.out.print("ingrese el siguiente numero: ");
    	int b=teclado.nextInt();
    	int c=a+b;
    	System.out.println("el resutado de la resta es: " + c);
    }
    public static void Multiplicacion(){
    	System.out.println("haremos una Multiplicacion");
    	System.out.print("ingrese 1 numero: ");
    	int a=teclado.nextInt();
    	System.out.print("ingrese el siguiente numero: ");
    	int b=teclado.nextInt();
    	int c=a*b;
    	System.out.println("el resutado de la Multiplicacion es: " + c);
    }
    public static void Division(){
    	System.out.println("haremos una Division");
    	System.out.print("ingrese 1 numero: ");
    	int a=teclado.nextInt();
    	System.out.print("ingrese el siguiente numero: ");
    	int b=teclado.nextInt();
    	int c=a/b;
    	System.out.println("el resutado de la Division es: " + c);
    }
    public static void Menu(){
    	System.out.println("operaciones basicas");
    	System.out.println("\n A) Suma");
    	System.out.println("B) Resta");
    	System.out.println("C) Multiplicacion");
    	System.out.println("D) Division");
    	System.out.println("\n ¿Que operacion deseas?");
    }
    public static void main(String[] args) {
    	Menu();
    	String opc=teclado.nextLine();
    	if (opc.equals("A")) Suma();
    	if (opc.equals("B")) Resta();
    	if (opc.equals("C")) Multiplicacion();
    	if (opc.equals("D")) Division();
    }
}