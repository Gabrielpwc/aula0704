import java.util.Scanner;

public class ex1 {
    public static void main(String[] aStrings) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escreva seu nome completo: ") ;
        String nome = entrada.next();
        System.out.println(" Digite o número do seu RA: ");
        String RA = entrada.next();
        System.out.println(" Digite o  seu curso: ");
        String curso = entrada.next();
        
        System.out.println(nome + " " +RA +" " +curso);
        
    }
}
