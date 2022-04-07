import java.util.Scanner;

public class ex4 {
    public static void main(String[] aStrings) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um numero inteiro: ") ;
        int primeiro = entrada.nextInt();
        System.out.println("Digite outro número inteiro: ");
        int segundo = entrada.nextInt();
        int Produto = primeiro * segundo; 
               
        System.out.println("O produto de " + primeiro +" e " + segundo +" é:  " + (int)(Produto));
        
    }
}