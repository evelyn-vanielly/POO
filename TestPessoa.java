package POO2;

public class TestPessoa {
public static void main (String args[])
{
	Pessoa TestPessoa = new Pessoa ("Jo�o", "Rua do limoeiro","99518-7845");
	TestPessoa.setNome("Jo�o");
	TestPessoa.setEndereco("Rua do Limoeiro");
	TestPessoa.setTelefone("99518-7845");
	
	System.out.println(TestPessoa.getNome());
	System.out.println(TestPessoa.getEndereco());
	System.out.println(TestPessoa.getTelefone());
			
}
}
