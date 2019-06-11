import java.util.Date;
public class simple_date {
	
	public static void main(String[] args)
	{
		Date today=new Date();
		
		// 2019-06=11 로 출력해 보기 
		
		//2019년 6월 11일
		
		//10:30:31 (시분초)
		int y=today.getYear()+1900;
		int m=today.getMonth()+1;
		String m2=m+"";
		
		if(m2.length()==1)
			m2="0"+m2;
		
		int d=today.getDate();
		String d2=d+"";
		if(d2.length()==1)
			d2="0"+d2;
		
		int h=today.getHours();
		int mm=today.getMinutes();
		int s=today.getSeconds();
	
		
		String ch1=y+"-"+m2+"-"+d2;
		
		String ch2=y+"년"+m2+"월"+d2+"일";
		
		String ch3=h+":"+mm+":"+s;
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
	}

}
