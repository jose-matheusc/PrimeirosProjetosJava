
//Um jogo de adivinhaçao
import java.util.Scanner;

public class sistemaDeBanco {

    public sistemaDeBanco() {
    }

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        float saldo = 2500.0F;
        int opcao = 0;
        String mensagemInicial = "*********************************************\nDados iniciais do cliente\n\nNome:               José Matheus\nTipo de conta:      Corrente\nSaldo inicial:      R$ 2500,00\n*********************************************\n";
        System.out.println(mensagemInicial);

        while (opcao != 4) {
            String mensagem = "\n1- Consultar saldos\n2 - Receber valor\n3- Transferir valor\n4 - Sair\n\nDigite a opção desejada";
            System.out.println(mensagem);
            opcao = leitura.nextInt();
            System.out.println(opcao);
            if (opcao == 1) {
                System.out.println("Seu saldo é: " + saldo);
            }

            float transferencia;
            if (opcao == 2) {
                System.out.println("Digite o valor que deseja receber: ");
                transferencia = leitura.nextFloat();
                saldo += transferencia;
                System.out.println("Seu novo saldo é: " + saldo);
            }

            if (opcao == 3) {
                System.out.println("Digite o valor que deseja transferir");
                transferencia = leitura.nextFloat();
                if (saldo >= transferencia) {
                    saldo -= transferencia;
                    System.out.println("Transferência concluída, novo saldo: " + saldo);
                } else {
                    System.out.println("Saldo insuficiente, não é possível fazer a transferência, faça uma transação  ");
                }
            }

            if (opcao == 4) {
                System.out.println("Volte sempre! "); //terminando
            }
        }
    }
}
