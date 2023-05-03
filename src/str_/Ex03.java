package str_;

public class Ex03 {
	public static void main(String[] args) {
		String id = "test       ";
		id.trim();//공백제거
		System.out.println(id.trim()+"a");
		id = id.trim();
		if(id.equals("test")) {
			System.out.println("확인");
		}else {
			System.out.println("실패");
		}
		String addr = "우편번호/주소///상세주소";
		System.out.println(addr);
		
		String[] s = addr.split("/"); //기준잡기
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		System.out.println(s[3]);
		System.out.println(s[4]);
		System.out.println("addr : "+addr);
		addr = addr.replace("/","=>"); //변경
		System.out.println(addr);
		
	}
}


