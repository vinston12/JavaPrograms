package meta3;

public class R�wnanieKwadratowe {
	private int a;
	private int b;
	private int c;
	public R�wnanieKwadratowe(int a, int b ,int c) {
		this.a=a;
		this.b=b;
		this.c=c; 
		String rozwi�zanie = " ";
	}
	public String toString() {
		 if (a<0 && b<0 && c<0) {
				return "Funkcja kwadratowa f(x)= " + a + "x^2 +(" + b +")x +("+c+")";
			} 
		if (b<0 && c<0) {
				return "Funkcja kwadratowa f(x)= " + a + "x^2 +(" + b +")x +("+c+")";
			}
		if (b<0) {
			return "Funkcja kwadratowa f(x)= " + a + "x^2 +(" + b +")x +" +c;
		}
		 if (c<0) {
			return "Funkcja kwadratowa f(x)= " + a + "x^2 +" + b +"x +(" +c+")";
		}
		else
			return "Funkcja kwadratowa f(x)= " + a + "x^2 +" + b +"x +" +c;
	}
	public String rozwi��() {
		String rozwi�zanie = "";
		double delta;
		delta=(b*b-4*a*c);
		if(delta>0) {
			delta=Math.sqrt(delta);
			double x1=(-b-delta)/(2*a);
			double x2=(-b+delta)/(2*a);
			System.out.println("Delta= " + delta);
			System.out.println("Delta w przybli�eniu = " + (int)delta);
			System.out.println();
			rozwi�zanie = "Miejsca zerowe: \nx1 = " + x1 +"\nx2 = "+ x2+ "\nW przybli�eniu: \nx1 = " +(int)x1 + " \nx2 = " + (int)x2;
		}
		else if (delta == 0) {
			delta=Math.sqrt(delta);
			double x0=-b/(2*a);
			rozwi�zanie = "Miejsce zerowe: \nx0 = "+ x0 + "\nW przybli�eniu \nx0 = " +(int)x0 ;
			System.out.println();
			System.out.println("Delta= " + delta);
			System.out.println("Delta w przybli�eniu = " + (int)delta);
		}
		else if(delta < 0) {
			System.out.println("Delta= (" + delta + ")");
			System.out.println("Delta w przybli�eniu = (" + (int)delta + ")");
			System.out.println();
			System.out.println("R�wnanie nie ma pierwiastk�w rzeczywistych");
		}
		return rozwi�zanie;
		
	}
	public static void main(String[] args) {
		R�wnanieKwadratowe r�wnanie = new R�wnanieKwadratowe(1, -5, 3);
		System.out.println(r�wnanie.rozwi��());
	}
}
