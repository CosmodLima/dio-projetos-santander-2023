import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
    //TODO:Conhecer e importar a classe Scanner
    //Exibir as mensagens para nosso usuario
    //Obter pela scanner os valores digitados pelo terminal
    //Exibir a menssagem conta criada
       int numeroConta = 1021;
       String agencia = "067-8";
       double saldoConta;
       
       Scanner scanner = new Scanner(System.in);

        
       System.out.println("Bem vindo a Banco Cosmos o Número 1 da Galáxia.");
       System.out.println("Digite seu nome para que possamos encontrar sua conta:");
       String nome = scanner.next();


       System.out.println("Digite seu sobrenome:");
       String sobrenome = scanner.next();

       System.out.println("Parece que o cliente: " + nome + " " + sobrenome + " não possue conta em nosso banco.");

       System.out.println("Digite sua data de nascimento para criar uma conta:");
       String dataNascimento = scanner.next();
    
       System.out.println("Digite o saldo inicial da sua conta:");
       saldoConta = scanner.nextDouble();

       System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque.");
      
       
    }
}
