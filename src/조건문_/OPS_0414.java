package 조건문_;

import java.util.Scanner;

public class OPS_0414 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		//230414_if문만을이용한문제_1반
		//1번
//		int k,m,e,ch;
//		System.out.print("1번 국어점수 :");
//		k = scan.nextInt();
//		System.out.print("2번 수학점수 :");
//		m = scan.nextInt();
//		System.out.print("3번 영어점수 :");
//		e = scan.nextInt();
//		System.out.println("1. 국어점수 2. 수학점수 3. 영어점수");
//		ch = scan.nextInt();
//		if(ch == 1) System.out.println("국어점수 : "+k);
//		else if(ch == 2) System.out.println("수학점수 : "+m);
//		else if(ch == 3) System.out.println("영어점수 : "+e);
//		else System.out.println("에러");
		//2번
//		int day, da = 0;
//		String a = "짱구", b = "유리", c = "철수", d = "맹구", e = "훈이";
//		System.out.println("날짜입력");
//		day = scan.nextInt();
//		if(day <= 30) {
//			da = day%5;
//			if(da == 1) System.out.println(a);
//			if(da == 2) System.out.println(b);
//			if(da == 3) System.out.println(c);
//			if(da == 4) System.out.println(d);
//			if(da == 5) System.out.println(e);
//		}else {
//			System.out.println("오류");
//		}
		//3번
//		String name, aaa="";
//		int k,m,e,sum;
//		float av;
//		System.out.print("이름 : ");
//		name = scan.nextLine();
//		System.out.print("1번 국어점수 :");
//		k = scan.nextInt();
//		System.out.print("2번 수학점수 :");
//		m = scan.nextInt();
//		System.out.print("3번 영어점수 :");
//		e = scan.nextInt();
//		sum = k+m+e;
//		av = sum / (float) 3.0;
//		System.out.println("합계 : "+sum);
//		System.out.println("평균 : "+av);
//		if(av >= 80) aaa = "합격";	
//		if(av < 80) aaa = "불합격";	
//		System.out.println("합격여부 : "+aaa);
 
		//2조 문제
		//1번
//		int dan, xe, erl,num1;
//		System.out.print("구구단 수를 입력 : ");
//		dan = scan.nextInt();
//		System.out.println("대입수 입력 : ");
//		xe = scan.nextInt();
//		erl = dan*xe;		
//		System.out.println("정답 입력 : ");
//		num1 = scan.nextInt();
//		if(num1 == erl)System.out.println("정답입니다.");
//		if(num1 != erl)System.out.println("오답입니다.");
		//2번
//		int a, b, c;
//		int sum, av, max,min;
//		System.out.print("세 수를 입력 : ");
//		a = scan.nextInt();
//		b = scan.nextInt();
//		c = scan.nextInt();
//		sum = a+b+c;
//		av = sum / 3;
//		max = (a>b)?(a>c)?a:c:b;
//		min = (a>b)?(b>c)?c:b:a;
//		System.out.println("합계 : "+sum);
//		System.out.println("평균 : "+av);
//		System.out.println("최댓값 : "+max);
//		System.out.println("최솟값 : "+min);
		//3번
//		int age;
//	    System.out.println("나이를 입력하시오");
//	    System.out.print("당신의 나이는? : ");  
//		age = scan.nextInt();
//		if(age>=20)System.out.println("성인입니다.");
//		if(age<20)System.out.println("미성년자 입니다.");
		//3조 연습문제
		//1번
//		int year;
//		System.out.println("날짜를 입력");
//		year = scan.nextInt();
//		if((year%4 == 0 && year%100 != 0) || year%400 == 0)System.out.println("0 윤년입니다.");
//		else System.out.println("1 윤년이 아닙니다.");
		//2번
//		int a, b, c;
//		int sum, av, max,min;
//		System.out.print("세 수를 입력 : ");
//		a = scan.nextInt();
//		b = scan.nextInt();
//		c = scan.nextInt();
//		sum = a+b+c;
//		av = sum / 3;
//		max = (a>b)?(a>c)?a:c:b;
//		min = (a>b)?(b>c)?c:b:a;
//		System.out.println("합계 : "+sum);
//		System.out.println("평균 : "+av);
//		System.out.println("최댓값 : "+max);
//		System.out.println("최솟값 : "+min);
		//3번
//		int num_scan;
//		String p="F", name;
//		System.out.print("이름을 입력 :");
//		name = scan.nextLine();
//		System.out.print("성적을 입력 : ");
//		num_scan = scan.nextInt();
//		if(num_scan >= 60) p = "D";
//		if(num_scan >= 70) p = "C";
//		if(num_scan >= 80) p = "B";
//		if(num_scan >= 90) p = "A";
//		System.out.println("성적 : "+p);		
		//♥4조 문제♥
		//1번
//		int a, b;
//		int sum, av, max,min;
//		System.out.print("세 수를 입력 : ");
//		a = scan.nextInt();
//		b = scan.nextInt();
//		sum = a+b;
//		av = sum / 2;
//		max = (a>b)?a:b;
//		min = (a>b)?b:a;
//		System.out.println("합계 : "+sum);
//		System.out.println("평균 : "+av);
//		System.out.println("최댓값 : "+max);
//		System.out.println("최솟값 : "+min);
		//2번
//		int num1;
//		System.out.println("수를 입력");
//		num1 = scan.nextInt();		
//		if(num1>100 || num1<0)System.out.println("숫자를 잘못 입력하셨습니다");
//		if(num1<=100 && num1>=0) {
//			if(num1>=60)System.out.println("합격");
//			if(num1<60)System.out.println("불합격");
//		}
		//3번
//		int num_scan;
//		String p="F", name;
//		System.out.print("이름을 입력 :");
//		name = scan.nextLine();
//		System.out.print("성적을 입력 : ");
//		num_scan = scan.nextInt();
//		if(num_scan >= 60) p = "D";
//		if(num_scan >= 70) p = "C";
//		if(num_scan >= 80) p = "B";
//		if(num_scan >= 90) p = "A";
//		System.out.println("이름 : "+name);
//		System.out.println("점수 : "+num_scan);		
//		System.out.println("성적 : "+p);		
		//230414_5조_if문_연습
		//1번
//		int num1;
//		System.out.println("수를 입력");
//		num1 = scan.nextInt();
//		if(num1%2==0||num1%5==0)System.out.println("2와5의 배수이다");
//		else System.out.println("2와5의 배수가 아니다");
		//2번
//		int a, b;
//		int max,min;
//		System.out.print("세 수를 입력 : ");
//		a = scan.nextInt();
//		b = scan.nextInt();
//		max = (a>b)?a:b;
//		min = (a>b)?b:a;
//		System.out.println("최댓값 : "+max);
//		System.out.println("최솟값 : "+min);
		//3번
//		int num_scan;
//		String p="F", name;
//		System.out.print("이름을 입력 :");
//		name = scan.nextLine();
//		System.out.print("성적을 입력 : ");
//		num_scan = scan.nextInt();
//		if(num_scan >= 60) p = "D";
//		if(num_scan >= 70) p = "C";
//		if(num_scan >= 80) p = "B";
//		if(num_scan >= 90) p = "A";
//		System.out.println("이름 : "+name);
//		System.out.println("점수 : "+num_scan);		
//		System.out.println("성적 : "+p);		
		//4번
//		int num1;
//		System.out.println("수를 입력");
//		num1 = scan.nextInt();
//		if(num1%15==0) System.out.println("15의 배수이다");
//		else if(num1%3==0&&num1%5==0)System.out.println("3과5의 배수이다");
//		else if(num1%3==0)System.out.println("3의 배수이다");
//		else if(num1%5==0)System.out.println("5의 배수이다");
//		else System.out.println("3과5의 배수가 아니다");
		//6조 문제(if문)
		//1번
//		int num_scan;
//		String p="F", name;
//		System.out.print("이름을 입력 :");
//		name = scan.nextLine();
//		System.out.print("성적을 입력 : ");
//		num_scan = scan.nextInt();
//		if(num_scan >= 60) p = "D";
//		if(num_scan >= 70) p = "C";
//		if(num_scan >= 80) p = "B";
//		if(num_scan >= 90) p = "A";
//		System.out.println("이름 : "+name);
//		System.out.println("점수 : "+num_scan);		
//		System.out.println("성적 : "+p);		
		//2번
//		int h,m,pm;
//		System.out.println("시간과 분을 입력하시오. 시간은 0~24, 분은 0~60인 정수이다 : ");
//		h = scan.nextInt();
//		m = scan.nextInt();
//		System.out.println("산책을 나간 시간을 입력하시오. 분으로 입력하되 1시간이 넘어가면 60분으로 계산해서 추가한다. : ");
//		pm = scan.nextInt();
//		System.out.println(h+"시 "+m+"분 산책을 나가며");
//		m += pm;
//		if(m>=60) { h += m/60; m %= 60;}
//		if(h>=24) h %= 24;
//		System.out.println(h+"시 "+m+"분 산책을 마쳤습니다");
		//3번
//		int a,sum, rand;
//		rand = (int) ((Math.random() * 99) + 1);
//		System.out.println("1부터 100까지중 하나 입력 : ");
//		a = scan.nextInt();
//		if(a>100 || a<1)System.out.println("오류");
//		if(a<=100 && a>=1) {
//			sum = a+rand;
//			if(sum<0)sum *= -1;
//			if(sum<=10)System.out.println("승리");
//			if(sum>10)System.out.println("패배");
//			System.out.println("입력값 : "+a+"\n랜덤값 : "+rand+"\n두수의 차 : "+sum);
//		}
		//4번
//		int num_scan;
//		String p="";
//		System.out.print("성적을 입력 : ");
//		num_scan = scan.nextInt();
//		if(num_scan >= 80) p = "pass";
//		if(num_scan < 80) p = "fail";		
//		System.out.println(p);
	}

}
