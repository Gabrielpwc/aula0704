import java.util.Scanner;

public class ex6 {
    public static void main(String[] aStrings) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ") ;
        int numero = entrada.nextInt();

        if(50 < numero  && numero < 100){
            System.out.println("O número " + numero +" pertence ao intervalo");
        }else  {
            System.out.println("O número " + numero +" não pertence ao intervalo");
        }}}

