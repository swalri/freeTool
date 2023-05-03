package 문자열_;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		  escape문자
		  -문자열 안에서 특수한 기능을 하는것.
		  -문자열은 ""(큰따옴표)로 묶여있는 값들
		  -\n : 엔터와 비슷하다
		  -\t : tab키와 비슷하다
		  -\\ : \하나 푯현
		  -\" : "하나 표현
		 */
		System.out.println("안\n녕\n하\n세\n요");
		System.out.println("1\t1234567 12345678\t1");
		
		System.out.println("이름\t나이");
		System.out.println("홍길동\t20살");
		
		System.out.println(" \\ ");
		System.out.println("C:\\0.공유자료");

		System.out.println(" \" ");
		System.out.println("\"C:\\\\0.공유자료\\새 폴더\"");
		
	}

}
