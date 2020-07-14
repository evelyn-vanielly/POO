package POO2;

public class TestPessoa {
public static void main (String args[])
{
	Pessoa TestPessoa = new Pessoa ("João", "Rua do limoeiro","99518-7845");
	TestPessoa.setNome("João");
	TestPessoa.setEndereco("Rua do Limoeiro");
	TestPessoa.setTelefone("99518-7845");
	
	System.out.println(TestPessoa.getNome());
	System.out.println(TestPessoa.getEndereco());
	System.out.println(TestPessoa.getTelefone());
			
}
}
