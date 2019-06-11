import java.util.Calendar;
public class tz {

	public static void main(String[] args) {
		
		//Date today=new Date();
		TimeZone tz=TimeZone.getTimeZone("America/Los_Angeles");
		Calendar today=Calendar.getInstance(tz);
		int ap=today.get(Calendar.AM_PM);
		System.out.println(ap);
		
		int y=today.get(Calendar.YEAR);
		int m=today.get(Calendar.MONTH);
		
	}

}
