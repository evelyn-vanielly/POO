package POO2;

public class Empregado extends Pessoa
{
  private int codigoSetor;
  private double salarioBase;
  private float imposto;

  public Empregado (String nome, String endereco, String telefone, int codigoSetor, double salarioBase, float imposto)
  {
	  super (nome, endereco, telefone);
	  this.codigoSetor = codigoSetor;
	  this.salarioBase = salarioBase;
	  this.imposto=imposto;
  }

public int getCodigoSetor() {
	return codigoSetor;
}

public void setCodigoSetor(int codigoSetor) {
	this.codigoSetor = codigoSetor;
}

public double getSalarioBase() {
	return salarioBase;
}

public void setSalarioBase(double salarioBase) {
	this.salarioBase = salarioBase;
}

public float getImposto() {
	return imposto;
}

public void setImposto(float imposto) {
	this.imposto = imposto;
}
  public double getcalcularSalario()
  {   double calcularSalario = salarioBase - ((imposto*salarioBase)/100); 
	  return calcularSalario;
  }
  
}

