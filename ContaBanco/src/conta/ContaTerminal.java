package conta;
import java.util.Scanner;
import java.util.Locale;
public class ContaTerminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("teste");
		int numeroConta;
		double saldo;
		String agencia,nomeCliente;
		Scanner scanner=new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Por favor, digite o numero da conta");
		numeroConta=scanner.nextInt();
		
		System.out.println("Por favor, digite o numero da Agencia");
		agencia=scanner.next();
	
		nomeCliente = scanner.nextLine();
		System.out.println("Por favor, digite o seu nome:");
		//System.out.println(nomeCliente);
		
		
		System.out.println("Por favor, digite o saldo da conta");
		saldo=scanner.nextDouble();
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %f já está disponível para saque", nomeCliente,agencia,numeroConta,saldo);
		
	}

}
