import java.util.Scanner;
public class idades {
        public static void main(String [] args) {
        
        Scanner entrada = new Scanner(System.in);

        int soma = 0;
        for (int i=0; i<5; i++){

        System.out.println("Digite a sua idade: ");

        int idade;
        idade = entrada.nextInt();
        soma = soma + idade;
        System.out.println("Idade " + idade );

        }
        System.out.println(soma);
    }
}
