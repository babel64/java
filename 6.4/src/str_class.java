
public class str_class {
 
	public static void main(String[] args)
	{
		String name="ghd";
		String str=new String("ghd");
		
		System.out.println(name+" +str");
		
		if(name==str)//name, srt �ϳ��� ��ü �ٸ� Ŭ������ ���� 
			//�׷��� �ڷ���???
            System.out.println("smae");
		else
			System.out.println("deferent");
		
		if(name.equals(str))
			System.out.println("same");
		else
			System.out.println("deferent");
	}
}
