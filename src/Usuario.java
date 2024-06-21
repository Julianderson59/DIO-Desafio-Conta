import java.util.Locale;
import java.util.Scanner;

public class Usuario {

    public static void main(String[] args){

        ContaTerminal contaTerminal = new ContaTerminal();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        contaTerminal.nome = scanner.next();

        System.out.println("Informe o número da conta: ");
        contaTerminal.numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência: ");
        contaTerminal.agencia = scanner.next();

        System.out.println("Olá " + contaTerminal.nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + contaTerminal.agencia +
                ", conta " + contaTerminal.numero + " e seu saldo " + String.format("%.3f", contaTerminal.saldo) + " já está disponível para saque");

    }

}
