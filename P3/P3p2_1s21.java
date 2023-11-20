import java.util.Scanner;

public class P3p2_1s21{
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
    	System.out.println("A) Suma");
    	System.out.println("B) Resta");
    	System.out.println("C) Multiplicacion");
    	System.out.println("D) Division");
        System.out.println("S) Salir");
    	System.out.println("¿Que operacion deseas?");
    }
    public static void Salir(){
        System.out.println("gracias por ingresar");
    }
    public static void main(String[] args) {
    	boolean estado = true;
        do{
        Menu();
    	String opc=teclado.nextLine();
        switch(opc){
        case "A","a":
            Suma();
            break;
        case "B","b":
            Resta();
            break;
        case "C","c":
            Multiplicacion();
            break;
        case "D","d":
            Division();
            break;
        case "S", "s":
            Salir();
            estado=false;
            break;
            }
        }while(estado);
    }
}