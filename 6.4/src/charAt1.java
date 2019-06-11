
public class charAt1 {
	
	public static void main(String[] args)
	{// String 클래스에 있는 charAt(인덱스)
		// 남자는 1,3번   여자는 2,4번
		
		String str="123456-1891011";
		// 성별을 구분하는 번호만 가져온다..
        
				
				char chk=str.charAt(7);
				
				if(chk=='1' || chk=='3')
					System.out.println("남");
				else
					System.out.println("여");
	}

	
}
