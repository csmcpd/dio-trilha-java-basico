import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //TODO:Conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso usuário

        //Obter pela classe Scanner os valores digitados no terminaal


        //Exibir a mensagem conta criada
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da conta");
        int numeroConta = scanner.nextInt();


        System.out.println("Digite a agencia");
        String agencia = scanner.next();

        System.out.println("Digite seu nome");
        String nomeCliente = scanner.next();

        System.out.println("faça seu depósito");
        double saldo = scanner.nextDouble();
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
        + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já esta disponível para saque" );
    }
}
