
public class split {

	public static void main(String[] args)
	{
		String str="wg,sd,fgs,sds"; //     /dsf-dfd
		
		String[] name=str.split(","); //     (",|/|-")
		// ,를 구분자로 하여 나눈다 =>배열
		
		// for 사용해서 전부 출력 
    
	  System.out.println(name[6]);
	}
}
