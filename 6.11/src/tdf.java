import java.text.SimpleDateFormat;

public class tdf {

	public static void main(String[] args) {
		
		Date today=new Date();
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String ch1=sdf.format(today);

	}

}
