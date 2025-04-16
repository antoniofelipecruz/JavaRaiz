import java.util.Scanner;
public class basquete{

    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        int d = teclado.nextInt();
        int pontos =0;
        if(d<=800) pontos= 1;
        else if(d<=1400) pontos=2;
        else pontos =3;
        System.out.println(pontos);
        teclado.close();
    }
}