import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class ex5 {
    public static void main(String[] aStrings) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número : ") ;
        float primeiro = entrada.nextFloat();
        System.out.println("Digite outro número : ");
        float segundo = entrada.nextFloat();

        if(primeiro < segundo){
            System.out.println(primeiro + "\n" + segundo);
        }else  {
            System.out.println(segundo + "\n" + primeiro);

        }
        




}}
