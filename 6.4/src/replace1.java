
public class replace1 {

	public static void main(String[] args) {
		//replace=�ٲ��ֱ�
		//trim=���ڿ� �¿쿡 �ִ� ��ĭ�� ����� ����

        String str="����!! ������           �������̾�";
        
        // String new_str=str.replace("������", "ȭ����");
        System.out.println(str.length());

        String trim_str=str.trim();
        
        System.out.println(trim_str.length());
        
        System.out.println(trim_str);
        
        String tt_str=trim_str.replace("  ", "");

        		System.out.println(tt_str);
        
        
        // System.out.println(new_str);
	}

}
