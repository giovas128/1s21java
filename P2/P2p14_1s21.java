import java.util.Scanner;

public class p2p14_1s21{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[][] Ma,Mb,Mc;
		int fa,ca,fb,cb,f,c,r;
		System.out.println("ingresa el numero de filas de la Matriz A");
		fa = teclado.nextIne();
		System.out.println("ingresa el numero de filas de la Matriz A");
		ca = teclado.nextInt();
		System.out.println("ingresa el numero de filas de la Matriz B");
		fb = teclado.nextInt();
		System.out.println("ingresa el numero de filas de la Matriz B");
		cb = teclado.nextInt();
		if (ca ==fb){
			Ma = int[fa][ca];
			Mb = int[fb][cb];
			Mc = int[fa][cb];
			for (f=0;f<fa;f++) {
				for (c=0;c<ca;c++) {
					System.out.println("ingresa el valor para Ma["+f+"]["+c+"]: ");
					Ma[f][c]=teclado.nextInt();
				}
			}
			for (f=0;f<fa;f++) {
				for (c=0;c<cb;c++) {
					System.out.println("ingresa el valor para Mb["+f+"]["+c+"]: ");
					Mb[f][c]=teclado.nextInt();
            	}
            }
            //aqui empezamos la multiplicacion
            for (f=0;f<fa;f++) {
				for (c=0;c<cb;c++) {


				}
			}

		}else{
		System.out.println("No se puede realizar la multiplicaion");
		}			
	}
}
