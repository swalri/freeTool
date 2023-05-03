package str_;

public class Ex01 {
	public static void main(String[] args) {
		String s = new String();
		s = "abcddfg";
		System.out.println(s);
		s = s.toUpperCase();//전체 대문자		
		System.out.println(s);
		
		s = s.toLowerCase();//전체 소문자
		System.out.println(s);
		
		System.out.println(s.length());
		s.charAt(0);//문자열 n번째
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		char c = s.charAt(0);
	}
}


