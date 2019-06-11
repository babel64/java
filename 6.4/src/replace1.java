
public class replace1 {

	public static void main(String[] args) {
		//replace=바꿔주기
		//trim=문자열 좌우에 있는 빈칸을 지우는 역할

        String str="하이!! 오늘은           월요일이야";
        
        // String new_str=str.replace("월요일", "화요일");
        System.out.println(str.length());

        String trim_str=str.trim();
        
        System.out.println(trim_str.length());
        
        System.out.println(trim_str);
        
        String tt_str=trim_str.replace("  ", "");

        		System.out.println(tt_str);
        
        
        // System.out.println(new_str);
	}

}
