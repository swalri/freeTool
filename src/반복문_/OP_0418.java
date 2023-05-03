package 반복문_;

import java.util.Scanner;

public class OP_0418 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//230418_1조_반복문을이용한문제
		//1번
//		int k = 1;
//		for (int i = 1; i < 6; i++) {
//			// System.out.println(i+"번째 값은:"+k);
//			System.out.println(k);
//			switch (i) {
//				case 1:	k++; break;
//				case 2:	--k; break;
//				case 3:	k *= 3;
//				case 4:	k -= 10; continue;
//			}
//		}
		//2번
//		int num_Ch;
//		boolean tf = true;
//		String menu = null, menu_Ps;
//		while(tf) {
//			System.out.println("-------------");
//			System.out.println("   카페 메뉴   ");
//			System.out.println("1. 메뉴 추가   ");
//			System.out.println("2. 메뉴판 보기  ");
//			System.out.println("3. 종료       ");
//			System.out.println("-------------");
//			System.out.print(">>> ");
//			num_Ch = scan.nextInt();
//			if(num_Ch == 3) {
//				tf = false;
//				System.out.println("사용해 주셔서 감사합니다");
//			}else if(num_Ch == 1) {
//				System.out.println("어떤 메뉴를 추가 하시겠습니까?");
//				System.out.print(">>> ");
//				menu_Ps = scan.next();
//				System.out.println("추가되었습니다.");
//				if(menu == null) menu = menu_Ps+"\n";
//				else menu += menu_Ps+"\n";
//			}else if(num_Ch == 2) {
//				if(menu == null) {
//					System.out.println("메뉴부터 추가해주세요.");
//					continue;
//				}else {
//					System.out.println(menu);
//				}
//			}
//		}
		//3번
//		int x,y;
//		System.out.print("가로의 길이 입력 ");
//		x = scan.nextInt();
//		System.out.print("세로의 길이 입력 ");
//		y = scan.nextInt();
//		for(int i=0;i<y;i++) {
//			for(int j=0;j<x;j++) {
//				System.out.print("*");
//			}System.out.println();
//		}
///////////////////////////////////////////////////////////////////
		//2조 반복문 문제
		//1번
//		System.out.print("얼마를 가지고 있습니까?(숫자만 입력): ");
//		int won = scan.nextInt();
//		while(won > 0) {
//			System.out.print("얼마를 썼습니까?(숫자만 입력): ");
//			int minus = scan.nextInt();
//			won -= minus;
//			System.out.println("현재 잔액: " + won);
//		}
//		System.out.println("잔액이 없습니다.");
		//2번
//		int x;
//		System.out.print("출력할 라인 수 ");
//		x = scan.nextInt();
//		for(int i=1;i<=x;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}System.out.println();
//		}
		//3번
//		int num;
//		   while(true) {
//		      System.out.println("점수를 입력하시오");
//		      num = scan.nextInt();
//		      if (num < 0 || num > 100) {
//		         System.out.println("점수를 다시 입력해주세요");
//		         continue;
//		      }
//		      else if( num >=80) {
//		         System.out.println("축하합니다. 합격입니다");
//		         break;
//		      }
//		      else {
//		         System.out.println("아쉽지만 불합격입니다");
//		      }		      
//		}
///////////////////////////////////////////////////////////////////
		//3조 연습문제
		//1번
//		int x, y;
//		System.out.print("행 입력 (1~10까지의 수), 열 입력 (1~50까지의 수) ");
//		x = scan.nextInt();
//		y = scan.nextInt();
//		for(int i=1;i<=x;i++) {
//			for(int j=1;j<=y;j++) {
//				System.out.print(j*i+ " ");
//			}System.out.println();
//		}
		//2번
//		final String aa ="아메리카노", la = "라떼";
//		final int aa_p = 1000 , la_p = 1500;
//		int price, menu,sum=0;
//		boolean tf = true;
//		while(tf) {
//			System.out.println("1. "+aa);
//			System.out.println("2. "+la);
//			System.out.println("0. 종료");
//			menu = scan.nextInt();
//			if(menu == 0) {
//				System.out.println("종료합니다");
//				tf = false;
//			}else if(menu == 1) {
//				System.out.println(aa+"를 선택했습니다");
//				System.out.println(aa+"는 "+aa_p+"원 입니다");				
//				while(true) {
//					System.out.print("지불할 금액을 입력해주세요 ");
//					price = scan.nextInt();
//					if(price>=aa_p) {
//						sum = price-aa_p;
//						System.out.println("거스름돈 : "+sum+"원입니다.");
//						break;
//					}
//					else {
//						System.out.println("금액이 부족합니다. 처음부터 다시 입력해주세요");
//					}
//				}
//			}else if(menu == 2) {
//				System.out.println(la+"를 선택했습니다");
//				System.out.println(la+"는 "+la_p+"원 입니다");
//				while(true) {
//					System.out.print("지불할 금액을 입력해주세요 ");
//					price = scan.nextInt();
//					if(price>=la_p) {
//						sum = price-la_p;
//						System.out.println("거스름돈 : "+sum+"원입니다.");
//						break;
//					}
//					else {
//						System.out.println("금액이 부족합니다. 처음부터 다시 입력해주세요");
//					}
//				}
//			}else {
//			}
//		}
		//3번
//		int menu, num = 0, a_Num;
//		boolean tf = true;
//		while(tf) {
//			System.out.print("1)입금 2)출금 3)잔액조회 4)종료 ");
//			menu = scan.nextInt();
//			switch(menu) {
//			case 1:
//				System.out.println("입금할 금액을 입력해주세요");
//				a_Num = scan.nextInt();
//				num += a_Num;
//				System.out.println("입금이 완료되었습니다");
//				System.out.println("현재 금액은 "+num+"원입니다");
//				break;
//			case 2:
//				if(num == 0) {
//					System.out.println("출금가능한 금액이 없습니다");
//				}else {
//					System.out.println("현재 금액은 "+num+"원입니다");
//					System.out.print("얼마를 출금하시겠습니까? ");
//					a_Num = scan.nextInt();
//					num -= a_Num;
//					System.out.println("출금이 완료 되었습니다");
//					System.out.println("현재 금액은 "+num+"원입니다");
//				}
//				break;
//			case 3:
//				System.out.println("현재 금액은 "+num+"원입니다");
//				break;
//			case 4:
//				System.out.println("종료합니다");
//				tf = false;
//				break;
//			default:
//				break;
//			}
//		}
///////////////////////////////////////////////////////////////////
		//♣4조 문제♣
		//1번
//		for(int i=5;i>=1;i--) {
//			for(int j=1;j<=5;j++) {
//				if(j>=i)System.out.print("*");
//				else System.out.print(" ");
//			}System.out.println();
//		}
		//2번
//		int num;
//		   while(true) {
//		      System.out.println("점수를 입력하시오");
//		      num = scan.nextInt();
//		      if (num < 0 || num > 100) {
//		         System.out.println("점수를 다시 입력해주세요");
//		         continue;
//		      }
//		      else if( num >=80) {
//		         System.out.println("축하합니다. 합격입니다");
//		         break;
//		      }
//		      else {
//		         System.out.println("아쉽지만 불합격입니다");
//		      }		      
//		}
		//3번
//		int num1, num2=0;
//		System.out.println("수를 입력하시오");
//		num1 = scan.nextInt();
//		for(int i=1;i<=9;i++) {
//			for(int j=1;j<=9;j++) {
//				num2 = i*j;
//				if(num1==num2) {
//					System.out.println("구구단에 있습니다");
//					num2 = 0;
//					break;
//				}
//			}
//			if(num2 == 0) {
//				break;
//			}
//		}
//		if(num2 != 0) {
//			System.out.println("구구단에 없습니다");
//		}
///////////////////////////////////////////////////////////////////
		//230418_5조_문제연습
		//1번
//		for(int i=1;i<=100;i++) if(i%3==0)System.out.println(i);
		//2번
//		int i=1;
//		while(true) {
//			if(i>10) continue;
//			if(i%2!=0) System.out.println(i);
//			i++;
//		}
		//3번
//		for(int i=1;i<=6;i++) {
//			for(int j=1;j<=6;j++) {
//				if(i+j==6) {
//					System.out.println(i+", "+j);
//				}
//			}
//		}
		//4번
//		for(int i=1;i<=9;i++) {
//			for(int j=1;j<=9;j++) {
//				if(i %2 != 0) {
//					System.out.print(i+"*"+j+"="+i*j+", ");
//				}
//			}
//			System.out.println();
//		}
///////////////////////////////////////////////////////////////////
		//6조 연습문제_반복문02
		//1번
//		int num, num2, sum=0;
//		while(true) {
//			System.out.println("1. 숫자 입력");
//			System.out.println("2. 입력한 숫자 보여주기");
//			System.out.println("0. 종료");
//			num = scan.nextInt();
//			if(num == 0) {
//				break;
//			}
//			if(num == 1) {
//				System.out.println("숫자 입력");
//				num2 = scan.nextInt();
//				sum +=num2;
//			}
//			if(num == 2) {
//				System.out.println(sum);
//			}
//		}
//		System.out.println("합계 : "+sum);
		//2번
//		int num;
//		System.out.println();
//		num = scan.nextInt();
//		if(num >0)System.out.println("양수");
//		if(num ==0)System.out.println("0");
//		if(num <0)System.out.println("음수");
		//3번
//		int num,i;
//		System.out.println("수 입력");
//		num = scan.nextInt();
//		for(i = 2;i<num;i++) {
//			if(num%i == 0) {
//				break;
//			}
//		}
//		if(i == num) {
//			System.out.println("소수이다");
//		}else {
//			System.out.println("소수가 아니다");
//		}
		//4번
//		final int skill=20,nomal=10;
//		int count = 10, mp = 100;
//		int button_S;
//		double hp = Math.floor( Math.random() * 150+50 );
//		boolean tf = true;
//		
//		System.out.println("게임을 시작합니다");
//		System.out.println("적의 hp 는 "+hp+"입니다");
//		
//		while(tf) {
//			System.out.println();
//			System.out.println("당신의 남은 체력은 "+count+"남았습니다.");
//			System.out.println("당신의 남은 mp는 "+mp+"남았습니다.");
//			System.out.println();
//			System.out.println("공격수단을 선택해 주세요");
//			System.out.println("1. 일반공격(10데미지)");
//			System.out.println("2. 스킬사용(20데미지)");
//			button_S = scan.nextInt();
//			
//			if(button_S == 1) {
//				System.out.println("일반공격");
//				hp -= nomal;
//			}else if(button_S == 2) {
//				System.out.println("스킬사용");
//				if(mp < skill) {
//					System.out.println("mp가 부족하여 스킬사용이 불가능 합니다");
//				}else {
//					mp -= skill;
//					hp -= skill;
//				}
//			}else {
//				System.out.println("오류 다시 입력해주세요");
//			}
//			
//			System.out.println("적의 남은 hp : "+hp);
//			
//			if(hp <=0) {
//				System.out.println("적이 쓰러졌습니다");
//				System.out.println("당신이 승리하였습니다");
//				tf=false;
//			}else {
//				count--;
//			}
//			
//			if(count==0) {
//				tf=false;
//				System.out.println("패배하였습니다");
//			}
//		}//while
	}
}


