
public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		System.out.println(segundaConta.saldo);
		
		System.out.println("A primeira conta tem R$" + primeiraConta.saldo + " reais.");
		System.out.println("A segunda conta tem R$" + segundaConta.saldo + " reais.");
		
		
		if (primeiraConta == segundaConta) {
			System.out.println("São a mesma conta");
		} else {
			System.out.println("São contas diferentes");
		}
	}
}
