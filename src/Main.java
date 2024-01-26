import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner banco = new Scanner(System.in);
        String nomeCliente;
        String tipoConta;
        int saldoInicial;
        int opcaoOpe;
        int recValor;
        int transValor;

        System.out.println("Insira seus dados: ");

        System.out.println("Digite seu nome completo ");
        nomeCliente = banco.nextLine();

        System.out.println("Digite seu tipo de conta ");
        tipoConta = banco.nextLine();

        System.out.println("Qual é o saldo inicial da sua conta ");
        saldoInicial = banco.nextInt();

        System.out.println("********************************");
        System.out.println("Dados iniciais do cliente: ");
        System.out.println("Nome: " + nomeCliente);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo inicial: R$" + saldoInicial);
        int valAtual = saldoInicial;
        System.out.println("******************************** \n");

        System.out.println("Operações");
        System.out.println("1 - Consultar saldo");
        System.out.println("2 - Receber valor");
        System.out.println("3 - Transferir valor");
        System.out.println("4 - Sair");

        opcaoOpe = banco.nextInt();

        while (opcaoOpe != 4) {
            switch (opcaoOpe) {
                case 1:
                    System.out.println("Saldo atual: R$" + valAtual);
                    break;
                case 2:
                    System.out.println("Digite o valor a receber: ");
                    recValor = banco.nextInt();
                    valAtual = saldoInicial + recValor;
                    System.out.println("Saldo atual atualizado: R$" + valAtual);
                    break;
                case 3:
                    System.out.println("Digite o valor a ser transferido: ");
                    transValor = banco.nextInt();

                    if (transValor > valAtual) {
                        System.out.println("Impossivel transferir esse valor.");
                    } else {
                        valAtual = valAtual - transValor;
                        System.out.println("Transferencia realizada com sucesso");
                        System.out.println("Saldo atual atualizado: R$" + valAtual);
                    }
                    break;
                default:
                    System.out.println("Opção incorreta");
            }

            System.out.println("Digite a opção desejada: ");
            opcaoOpe = banco.nextInt();
        }
        System.out.println("Programa finalizado.");
    }
}
