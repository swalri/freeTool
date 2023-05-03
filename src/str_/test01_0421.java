package str_;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
public class test01_0421 {
	//ArrayList 로또 3번문제
	private static ArrayList<Integer> arr_lotto(){
		ArrayList<Integer> lotto = new ArrayList<Integer>();
		for(int i=0;i<6;i++) {
			int random = (int) (Math.random()*6+1);
			if(lotto.contains(random)) {
				i--;
			}else {
				lotto.add(random);
			}//if else
		}//for
		return lotto;
	}
	//HashSet 로또 3번문제
	private static HashSet<Integer> set_lotto(){
		HashSet<Integer> lotto = new HashSet<Integer>();
		while(lotto.size()<6) {
			int random = (int) (Math.random()*45+1);
			lotto.add(random);
		}//while
		return lotto;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//1번
		//1-1
//		ArrayList<Integer> arri  = new ArrayList<>();
//		String one_one = "Have a nice day Have a nice day Have a nice day";
//		String lo_s = one_one.toLowerCase();
//		for(int i=0;i<lo_s.length();i++) {
//			if('a' == lo_s.charAt(i)) {
//				arri.add(i);
////			System.out.print(i+" ");
//			}
//		}
//		System.out.println(arri);
		
		//1-2
//		String one_two = "It is a fun java programming";
//		String lo_s = one_two.toLowerCase();
//		int a=0,g=0;
//		for(int i=0;i<one_two.length();i++) {
//			if('a' == lo_s.charAt(i)) {
//				a++;
//			}else if('g' == lo_s.charAt(i)) {
//				g++;
//			}
//		}
//		System.out.println("총 개수 : "+one_two.length());
//		System.out.println("a 개수 : "+a);
//		System.out.println("g 개수 : "+g);
		//1-3
//		String str = new String("tESt sTring   change   first");
//		String changeStr = new String();
//		String[] s = str.toLowerCase().split(" "); //기준잡기
//		
//		System.out.println("변경 전 : "+str);
//		for(int i=0;i<s.length;i++) {//배열
//			for(int j=0;j<s[i].length();j++) {//배열 첫 문자
//				if(j == 0) {
//					changeStr += s[i].toUpperCase().charAt(j);
//				}else {
//					changeStr += s[i].charAt(j);
//				}
//			}
//			changeStr += " ";
//		}
//		
//		System.out.println("변경 후 : "+changeStr);
		//2번
//		String str = "김개똥-2017년\n홍길동구리-2015년\n선우선녀-2018년";
//		String [] name_s = str.replace("-", ":").split("\n");
//		String [] s;
//		String ch_str = "";
//		System.out.println("====변경 전 str====");
//		System.out.println(str);
//		System.out.println("====변경 후 str====");
//		for(int i=0;i<name_s.length;i++) {
//			s = name_s[i].split(":");
//			for(int j=0;j<2;j++) {
//				if(j==1) {s[j] = ":1999년\n";}
//				ch_str += s[j];
//			}
//		}
//		System.out.println(ch_str);
		//3번
		int num;
		while(true) {
			System.out.println("===================");
			System.out.println("1. ArrayList");
			System.out.println("2. HashSet");
			System.out.println("3. exit");
			System.out.print(">>> ");
			num = scan.nextInt();
			switch(num) {
			case 1:
				System.out.println("이번 당첨번호는 ");
				System.out.println(arr_lotto());
				break;
			case 2:
				System.out.println("이번 당첨번호는 ");
				System.out.println(set_lotto());
				break;
			case 3:
				System.out.println("종료합니다");
				System.exit(0);
				break;
			default:
				System.out.println("오류");
				break;
			}//switch
		}//while	
	}
}