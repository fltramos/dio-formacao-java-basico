//Feitos os imports das classes Locale e Scanner

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception{

//Cirando e iniciando as variáveis necessárias para o sistema 
        int numero = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 0.0;

//Iniciando a classe Scanner com a configuração de localidade feita pela classe Locale
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

    //Exibir as mensagens para os usuários interagirem com o sistema
        System.out.print("Por favor, digite o número da Conta !");
        numero = sc.nextInt();
        
        System.out.print("Por favor, digite o número da Agência !");
        agencia = sc.next();

        sc.nextLine(); //Este sc.nextLine() é para comsumir a linha extra criada pelos next anteriores

        System.out.print("Por favor, digite o nome do Cliente !");
        nomeCliente = sc.nextLine();
        
        System.out.print("Por favor, digite o saldo do Cliente !");
        saldo = sc.nextDouble();
        
        //Exibição da mensagem, formatada com printf, informando a criação da conta
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque!", nomeCliente, agencia, numero, saldo);


        sc.close();
    }
}
