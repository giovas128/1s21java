import java.util.Scanner;

public class P2p14_1s21{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[][] Ma,Mb,Mc;
		int fa,ca,fb,cb,f,c,r=0,h;
		System.out.println("ingresa el numero de filas de la Matriz A");
		fa = teclado.nextInt();
		System.out.println("ingresa el numero de filas de la Matriz A");
		ca = teclado.nextInt();
		System.out.println("ingresa el numero de filas de la Matriz B");
		fb = teclado.nextInt();
		System.out.println("ingresa el numero de filas de la Matriz B");
		cb = teclado.nextInt();
		if (ca ==fb){
			Ma = new int[fa][ca];
			Mb = new int[fb][cb];
			Mc = new int[fa][cb];
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
					 for (h=0;h<fb ;h++ ) {
					 	r+=Ma[f][h]*Mb[c][h];
					 	System.out.print("a["+f+"]["+h+"]("+Ma[f][h]+") *");
					 	System.out.println("b["+f+"]["+h+"]("+Mb[h][c]+")");
					 }
					 System.out.println("...................................");
					 Mc[f][c]=r;
					 r=0;
				}
			}
            for (f=0;f<fa;f++) {
            	for (c=0;c<cb;c++) {
            		System.out.println("el resultado para Mc["+f+"]["+c+"]: "+Mc[f][c]);
            	}
            }
		}else{
		System.out.println("No se puede realizar la multiplicaion");
		}			
	}
}
