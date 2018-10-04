package meta3;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Czas {
	public static void main(String[] args) {
		GregorianCalendar dziœ = new GregorianCalendar();
		GregorianCalendar urodziny = new GregorianCalendar(2018, Calendar.SEPTEMBER, 14);
		if (dziœ.before(urodziny)) {
			System.out.println("Jest czas kupiæ prezent!");
		}
		System.out.printf("%tc", urodziny);
		System.out.printf("\n%tc",dziœ);
	}
}
