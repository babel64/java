
public class split {

	public static void main(String[] args)
	{
		String str="wg,sd,fgs,sds"; //     /dsf-dfd
		
		String[] name=str.split(","); //     (",|/|-")
		// ,�� �����ڷ� �Ͽ� ������ =>�迭
		
		// for ����ؼ� ���� ��� 
    
	  System.out.println(name[6]);
	}
}
