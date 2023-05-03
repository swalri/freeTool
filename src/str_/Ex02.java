package str_;

public class Ex02 {
	public static void main(String[] args) {
		int num = 1111;
		String st = String.valueOf(num);//숫자를 문자열로
		System.out.println("st"+st);

		int n = Integer.parseInt(st);//문자열을 숫자로
		n+=1;
		System.out.println("n"+n);
		String st02 = "";
		st02+="a";
		st02+="b";
		st02+= (char)('c'-32);//아스키코드 변환 계산 대입
		System.out.println(st02);
		
	}
}


