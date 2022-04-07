import java.util.Scanner;

public class Ex2 {
    public static void main(String[] aStrings) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a sua idade: ") ;
        String idade = entrada.next();
        System.out.println(" Digite a sua altura: ");
        String altura = entrada.next();
        System.out.println(" Digite o  seu status: ");
        String status = entrada.next();

                
        System.out.print(idade  + " " +altura +" cm " + status);
    }}
    

