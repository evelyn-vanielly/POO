package POO;

public class produto_eletronico {

	private int hd;
	private boolean wifi;
	private int ram;
	private double tela;
	
	public produto_eletronico (int h, boolean w, int r, double d)
	{
		hd = h;
		wifi = w;
		ram = r;
		tela = d;
	}
	
	public String getinfoTec()
	{   String infoTec = "O HD � de: " +hd+ " e a mem�ria RAM � de: "+ ram;
		return infoTec;
	}
	public boolean getNet()
	{   
		boolean net = wifi;
		return net;
	}
	public double getscreen()
	{
		double screen= tela;
		return screen;
	}
}
