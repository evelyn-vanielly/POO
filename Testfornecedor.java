package POO2;

public class Testfornecedor {
	public static void main (String args[]) {
		
		Fornecedor novo = new Fornecedor ("Jo�o Amoedo", "Rua do Limoeiro", "99518-7845",500.50, 250.50);
		
		System.out.println(novo.getNome());
		System.out.println(novo.getEndereco());
		System.out.println(novo.getTelefone());
		System.out.println ("Cr�dito: " + novo.getValorCredito());
		System.out.println ("Divida: "+novo.getValorDivida());
		System.out.println ("Saldo de: "+novo.getObterSaldo());
	}

}
