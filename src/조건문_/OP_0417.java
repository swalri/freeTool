package 조건문_;
import java.util.Scanner;
public class OP_0417 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		//230417_1조_for문을이용한문제
		//1번
//		final int won = 20;
//		int sum_w = 0;
//		for(int i=1; i<=60 ;i++) {
//			if(i%10 != 0) sum_w += won;
//			else {}
//		}System.out.println(sum_w+"원");
		//2번
//		int num;
//		System.out.println("단수를 입력 : ");
//		num = scan.nextInt();
//		for(int i=1;i<10;i++) System.out.println(num+"*"+i+"="+num*i);
		//3번
//		int a = 0, i ;
//		for (i =3 ; i<100; i*=3) a *= i ;
//		System.out.println(a);
//		System.out.println(i);
///////////////////////////////////////////////////////////////////
		//2조_for문_문제
		//1번
//		int num1, num2,sum=0;
//		System.out.println("두 수를 입력");
//		num1 = scan.nextInt();
//		num2 = scan.nextInt();
//		if(num1>num2) {
//			for(int i = num2; i<=num1; i++)	sum +=i;
//			System.out.println(num2+"부터 "+num1+"까지의 합은 "+sum+"이다");
//		}
//		else if(num1<num2) {
//			for(int i = num1; i<=num2; i++)	sum +=i;
//			System.out.println(num1+"부터 "+num2+"까지의 합은 "+sum+"이다");
//		}
		//2번
//		int num;
//		System.out.println("단수를 입력 : ");
//		num = scan.nextInt();
//		for(int i=1;i<10;i++) System.out.println(num+"*"+i+"="+num*i);
		//3번
//		System.out.print("짝수 : ");
//		for(int i=1;i<20;i++) if(i%2==0) System.out.print(i+" ");
///////////////////////////////////////////////////////////////////
		//3조 연습문제
		//1번
//		System.out.print("홀수 : ");
//		for(int i=1;i<20;i++) if(i%2==0) System.out.print(i+" ");
//		System.out.println();
//		System.out.print("짝수 : ");
//		for(int i=1;i<20;i++) if(i%2!=0) System.out.print(i+" ");
		//2번
//		int num, sum=0;
//		for(int i=0;i<5;i++) {
//			System.out.print("숫자를 입력하세요 : ");
//			num = scan.nextInt();
//			sum += num;
//			System.out.println("출력 : "+sum);
//		}
		//3번
//		int num, sum=0;
//		System.out.print("숫자를 입력하세요 : ");
//		num = scan.nextInt();
//		for(int i=1;i<=num;i++) sum += i;
//		System.out.println("출력 : "+sum);
///////////////////////////////////////////////////////////////////
		//★4조 문제★
		//1번
//		int person, test, sum =0;
//		float avg;
//		System.out.print("인원 : ");
//		person = scan.nextInt();
//		for(int i=1;i<=person;i++) {
//			System.out.print("성적을 입력하세요 : ");
//			test = scan.nextInt();
//			sum += test;
//		}
//		avg = sum/(float)person;
//		System.out.println("총점 : "+sum+" 평균 : "+avg);
		//2번
//		boolean tf = true;
//		int ch, sum=0;
//		while(tf) {
//			System.out.println("추가할 값을 입력하시오 0을 누르면 종료합니다");
//			ch = scan.nextInt();
//			if(ch == 0) tf = false;
//			else sum += ch;			
//		}
//		System.out.println(sum);
		//3번
//		int num, sum=0;
//		System.out.print("숫자를 입력하세요 : ");
//		num = scan.nextInt();
//		for(int i=1;i<=num;i++) sum += i;
//		System.out.println("출력 : "+sum);
///////////////////////////////////////////////////////////////////
		//230417_5조_for문연습
		//1번
//		int num, sum=0, h=0;
//		System.out.println("수를 입력");
//		num = scan.nextInt();
//		if(num>=1&&num<=100) {
//			for(int i = 1;i<=100;i++) {
//				if(i%num == 0) {
//					sum +=i;
//					h++;
//				}
//			}
//			System.out.println(num+"의 배수의 개수는 "+h+"이며 총합은 "+sum);
//		}else {
//			System.out.println("잘못된 입력입니다");
//		}
		//2번
//		int even_Sum=0, odd_Sum=0;
//		for(int i=1;i<50;i++) {
//			if(i%2==0) even_Sum +=i;
//			else odd_Sum +=i;
//		}
//		System.out.println("홀수 : "+odd_Sum);
//		System.out.println("짝수 : "+even_Sum);
		//3번
//		int num;
//		System.out.println("단수를 입력 : ");
//		num = scan.nextInt();
//		for(int i=1;i<10;i++) System.out.println(num+"*"+i+"="+num*i);
		//4번
//		String q="*";
//		int o=4, o2=4;
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<9;j++) {
//				if(j>=o && j<=o2)System.out.print(q+" ");
//				else System.out.print("  ");	
//			}
//			o--;
//			o2++;
//			System.out.println();
//		}
//		o++; o2--;
//		for(int i=0;i<4;i++) {
//			o++; o2--;
//			for(int j=0;j<9;j++) {
//				if(j>=o && j<=o2)System.out.print(q+" ");
//				else System.out.print("  ");	
//			}
//			System.out.println();
//		}
///////////////////////////////////////////////////////////////////
		//6조 연습문제_반복문 
		//1번
//		int ch, menu;
//		boolean tf = true;
//		
//		while(tf) {
//			System.out.println("어서오세요");
//			System.out.println("우유자판기 입니다. 주문하시겠습니까? (YES : 1,  NO : 2)");
//			ch = scan.nextInt();
//			if(ch == 1) {
//				System.out.println("1.바나나우유, 2.딸기우유, 3.초코우유, 4. 주문안함");
//				System.out.println("번호를 선택해주세요 : ");
//				menu = scan.nextInt();
//				switch(menu) {
//				case 1:
//					System.out.println("바나나우유를 선택하였습니다.");
//					break;
//				case 2:
//					System.out.println("딸기우유를 선택하였습니다.");
//					break;
//				case 3:
//					System.out.println("초코우유를 선택하였습니다.");
//					break;
//				case 4:
//					System.out.println("원하는 메뉴가 없습니다.");
//					break;
//				default: 
//					break;
//				}
//			}else {
//				tf = false;
//				System.out.println("안녕히가세요");
//			}
//		}
		//2번
//		int ch_Num, i= 0;
//		int rand = (int) Math.floor(Math.random() * 50);
//		System.out.println("수를 맞추세요");
//		for(i=0;i<5;i++) {
//			ch_Num = scan.nextInt();
//			if(rand == ch_Num) {
//				System.out.println("정답입니다 축하합니다");
//				i=0;
//				break;
//			}else if(rand > ch_Num) {
//				System.out.println("보다 큽니다");
//			}else if(rand < ch_Num) {
//				System.out.println("보다 작습니다");
//			}
//		}
//		if(i != 0) {
//			System.out.println("패배하였습니다.");
//		}
		//3번
//		String po = "* ", sp = "  ";
//		int gi=4, gi2=4;
//		for(int i=0;i<5;i++) {
//			for(int j=0; j<9; j++) {
//				if(j>=gi && j<=gi2) System.out.print(po);
//				else System.out.print(sp);
//			}
//			System.out.println();
//			gi--;
//			gi2++;
//		}
	}

}


