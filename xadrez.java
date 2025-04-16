import java.util.Scanner;

public class xadrez{
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        int l = teclado.nextInt();
        int c = teclado.nextInt();
        //if((l+c)%2==0) System.out.println(1);
        //else System.out.println(0);
        System.out.println(Math.abs((l+c)%2-1));
        teclado.close();
    }

}