package POO;

public class funcionario {
	private String turno;
	private String nome;
	private String sobrenome;
	private double salario;
	
	public funcionario (String t, String n, String s, double sal)
	{
		turno = t;
		nome = n;
		sobrenome = s;
		salario = sal;
	}
   public String getInfo ()
   {    
	   String info = "Turno:" + turno + "\n" + nome + " "+ sobrenome;
	   return info;
   }
   public double getSal ()
   {    
	   double sal =salario;
	   return sal; 
   }
   }
   
