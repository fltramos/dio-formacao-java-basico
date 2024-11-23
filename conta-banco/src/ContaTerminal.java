import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){

        int numero = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 0.0;
        
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
       
        System.out.print("Por favor, digite o número da Conta !");
        numero = sc.nextInt();
        
        System.out.print("Por favor, digite o número da Agência !");
        agencia = sc.next();

        sc.nextLine();
        
        System.out.print("Por favor, digite o nome do Cliente !");
        nomeCliente = sc.nextLine();
        
        System.out.print("Por favor, digite o saldo do Cliente !");
        saldo = sc.nextDouble();
        
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque!", nomeCliente, agencia, numero, saldo);


        sc.close();
    }
}
