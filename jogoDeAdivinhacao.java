import java.util.Random;
import java.util.Scanner;

public class jogoDeAdivinhacao {

    public jogoDeAdivinhacao() {
    }

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numero = (new Random()).nextInt(100);
        System.out.println("Adivinhe o numero com 5 tentativas de 0 a 100");
        System.out.println("Chute o primeiro numero: ");
        int chutes = 0;

        while(chutes < 5) {
            int chute1 = leitura.nextInt();
            ++chutes;
            if (numero > chute1) {
                System.out.println("O numero é maior, chute outro: ");
            } else {
                System.out.println("O numero é menor, chute outro: ");
            }

            if (chute1 == numero) {
                System.out.println("Você acertou o número: " + numero);
                break;
            }

            if (chutes == 5) {
                System.out.println("Você não conseguiu acertar, o numero é: " + numero);
                break;
            }
        }

    }
}

