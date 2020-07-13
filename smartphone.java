package POO;

public class smartphone {
	public static void main (String args[])
	{
		produto_eletronico smartphone = new produto_eletronico (500, true, 8, 7.8);
		System.out.println(smartphone.getinfoTec());
		System.out.println(smartphone.getNet());
		System.out.println(smartphone.getscreen());
	}

}
