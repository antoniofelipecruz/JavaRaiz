import java.util.Scanner;
public class fazenda{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        int qtde =1;
        double soma =0.0;
        double massa;
        double maior, menor;
        massa= teclado.nextDouble();
        
        maior = massa;
        menor =massa;

        while(massa!=0){
            soma+=massa;
            qtde++;
            massa=teclado.nextDouble();
            if(massa>maior) maior=massa;
            else if(massa<menor)menor=massa;
            massa = teclado.nextDouble();

        }
        System.out.println("mais pesado:"+maior);
        System.out.println("mais leve:"+menor);
        System.out.printf("mais media:%.2f%n",soma/qtde);

    }
}