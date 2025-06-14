import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o número da sua agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o número da sua conta: ");
        int numero = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite seu saldo: ");
        double saldo = Double.parseDouble(scanner.nextLine());

        System.out.printf(
                "\nOlá %s, obrigado por criar uma conta em nosso banco.%n" +
                        "Sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.%n",
                nomeCliente, agencia, numero, saldo
        );

        scanner.close();
    }
}
