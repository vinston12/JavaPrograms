package meta3;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Czas {
	public static void main(String[] args) {
		GregorianCalendar dzi� = new GregorianCalendar();
		GregorianCalendar urodziny = new GregorianCalendar(2018, Calendar.SEPTEMBER, 14);
		if (dzi�.before(urodziny)) {
			System.out.println("Jest czas kupi� prezent!");
		}
		System.out.printf("%tc", urodziny);
		System.out.printf("\n%tc",dzi�);
	}
}
