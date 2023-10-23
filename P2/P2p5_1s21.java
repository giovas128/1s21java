import java.util.Scanner;

public class P2p5_1s21{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a = teclado.nextInt();
		while(a<10){
			System.out.println("Estamos repitiendonos dentro del ciclo while");
			a++;
        }
	    a=10;
	    while(a<10){
	    	System.out.println("Que pasa con esta instruccion");

	    }
	
        a=2;
        while(true){
        	System.out.println("aqui controlamos el contador de forma manual");
        	System.out.println("y generamos if para la condicion decida");
            System.out.println("cuando devemos terminar la repeticion");
            if (a>10) break;
            a++;
        }
	
        a=1;
        while(true){
        	System.out.println("cual es la justificacion para no ejecutarse");
        }
    }
}
