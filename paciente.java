package POO;

public class paciente {
 private String nome;
 private String sobrenome;
 private  int idade;
 private String estado;
 private String tipoSangue;
 
 public paciente (String n, String s, int i, String e, String ts)
 {
	 nome = n;
	 sobrenome = s;
	 idade = i;
	 estado = e;
	 tipoSangue=ts;
 }
 public String getBasico ()
 {
	 String basico = nome + " " + sobrenome + "\n "+ idade;
	 return basico;
 }
 public String getTec()
 {
	 String tec = estado + "\n" + tipoSangue;
	 return tec;
 }
}
