import Animal.Inter;

public class Outside {
	private class Inside{
	private int i=100;
	private void check() {
		
	}
	}
Inside ins = new Inside();
public void changeI() {
	ins.i=90;
	ins.check();
	Inter inter = new Inter(){
		public void inter() {
		
	}
	};
}
public void change() {
	int i=35;
	double j = 1.0;
	double a = 56;
	int b = (int)a;
}
}
