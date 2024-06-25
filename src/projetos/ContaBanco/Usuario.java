package projetos.ContaBanco;

import java.util.Scanner;

public class Usuario{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaTerminal contaTerminal = new ContaTerminal();

        System.out.println("Qual o número da sua agencia?");
        int numeroInteiro = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Qual a sua agência?");
        String agenciaTexto = scanner.nextLine();

        if (numeroInteiro == 1021 && agenciaTexto.equals("067-8"))
            System.out.println("Bem vindo a sua conta " + contaTerminal.nomeCliente + ", o seu saldo atual é de: " + contaTerminal.saldo);
        else
            System.out.println("Dados incorretos!");

scanner.close();
    }

}
