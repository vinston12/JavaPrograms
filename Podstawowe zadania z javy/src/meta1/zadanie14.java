package meta1;




public class zadanie14 {
	private double promien;
	private int id;
	private static int nextId;
	public zadanie14()
	{
		this(1.0);
	}
	
	public int getId()
	{
		return id;
	}
	
	
	public zadanie14(double r) {
		this(r, "co�");  
	}
	
	public zadanie14(double r, String j) {
		id=nextId;
		nextId++;
		promien = r;
		if (j.equals("km"))
		{
			promien = promien*1000;
		}else if (j.equals("cm"))
		{
			promien=promien/100;
		}
	}
	
	public void setPromien(double r) {
	
		promien = r;
	}
	public double getPromien() {
		
		return promien;
	}
	public double obliczObwod()
	{
		return 2*Math.PI*promien;
	}
	public double poleKola() {
		double pole;
		
		pole = Math.PI*promien*promien;
		
		return pole;
	}
	public static void main(String[] args) {
		zadanie14 k�eczkotab[] = new zadanie14[3];
		k�eczkotab[0] =new  zadanie14(5);
		k�eczkotab[1] =new  zadanie14(5.7);
		k�eczkotab[2] =new  zadanie14(4, "cm");
		for (zadanie14 x: k�eczkotab)
		{
			System.out.println("ID ko�a wynosi: " + x.getId());
			 System.out.println("Promien ko�a: "+x.getPromien());
			 System.out.println("Pole ko�a: "+x.poleKola());
			 System.out.println("Obw�d ko�a wynosi: "+x.obliczObwod());
			 System.out.println();
			 
		}
		
}
	static
	{
		nextId=1;
	}
}