import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do titular: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o numero da agencia: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o numero da conta: ");
        int numero = scanner.nextInt();

        System.out.println("informe o valor a depositar: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá sr(a) " + nome + ", obrigado por criar uma conta em nosso banco, sua agencia é "+ agencia + " , conta "+ numero +" e seu saldo "+ saldo + " já está disponivel para saque!");
}

}