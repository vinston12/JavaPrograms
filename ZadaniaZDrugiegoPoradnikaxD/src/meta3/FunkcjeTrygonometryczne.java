package meta3;

public class FunkcjeTrygonometryczne {
	private int a;
	private int b;
	private int c;
	public FunkcjeTrygonometryczne(int a,int b,int c) {
		this.a=a;
		this.b=b;
		this.c=c;
		String rozwi�zanie="";
		
	}
	public String rozwi��() {
		String rozwi�zanie = "";
		double sinA = (a/c);
		double cosA = (b/c);
		double tgA = (a/b);
		double ctgA = (b/a);
		double sinB = (b/c);
		double cosB = (a/c);
		double tgB = (b/a);
		double ctgB = (a/b);
		sinA=Math.sqrt(sinA);
		sinB=Math.sqrt(sinB);
		cosA=Math.sqrt(cosA);
		cosB=Math.sqrt(cosB);
		tgA=Math.sqrt(tgA);
		tgB=Math.sqrt(tgB);
		ctgA=Math.sqrt(ctgA);
		ctgB=Math.sqrt(ctgB);
		rozwi�zanie = "Funkcje trygonometyczne w tym tr�jk�cie: \nSin a= " + sinA +"\nCos a="+cosA+"\ntg a="+tgA+"+\nCtg a="+ctgA;
		return rozwi�zanie;
	}
public static void main(String[] args) {
	FunkcjeTrygonometryczne funkcja = new FunkcjeTrygonometryczne(5, 1, 4);
	System.out.println(funkcja.rozwi��());
}
}
