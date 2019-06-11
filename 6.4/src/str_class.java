
public class str_class {
 
	public static void main(String[] args)
	{
		String name="ghd";
		String str=new String("ghd");
		
		System.out.println(name+" +str");
		
		if(name==str)//name, srt 하나의 객체 다른 클래스에 존재 
			//그래서 자료형???
            System.out.println("smae");
		else
			System.out.println("deferent");
		
		if(name.equals(str))
			System.out.println("same");
		else
			System.out.println("deferent");
	}
}
