import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        int numero = new Random().nextInt(100);
        int tentativas = 5;

        System.out.println("Teste sua sorte no jogo do Tigrinho , digite um número e ganhe premios !!! Lembre que voce tem somente 5 tentativas");

        while(tentativas > 0){
            int valor = Integer.parseInt(entrada.nextLine());

            int resultadoComparacao = Integer.compare(valor, numero);

            switch (resultadoComparacao) {
                case 0:
                    System.out.println("Parabéns voce ganhou R$5.0000 no tigrinho !!!!");
                    tentativas = 0;
                    break;
                case 1:
                    System.out.println("O número digitado é maior que o número da sorte !!!");
                    break;
                case -1:
                    System.out.println("O número digitado é menor que o número da sorte !!!");
                    break;
            }
            tentativas--;
            
            if(tentativas > 0){
                System.out.println("Não desista vc ainda tem "+ tentativas +" tentativas");
            }
            else{
                System.out.println("Voce Perdeu !!! O número da sorte era "+ numero);
            }
        }
        
        entrada.close();
    }
}
