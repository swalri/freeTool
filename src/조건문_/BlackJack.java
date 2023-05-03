package 조건문_;

import java.util.Scanner;

public class BlackJack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int rand_me1, rand_me2, rand_pc1,rand_pc2;
		int prand, a, me_sum, pc_sum;
		
		rand_me1 = (int) Math.round(Math.random() * 10) + 1;
		rand_me2 = (int) Math.round(Math.random() * 10) + 1;
		
		rand_pc1 = (int) Math.round(Math.random() * 10) + 1;
		rand_pc2 = (int) Math.round(Math.random() * 10) + 1;
		
		me_sum = rand_me1+rand_me2;
		pc_sum = rand_pc1+rand_pc2;
		
		System.out.println("게임 시작");
		System.out.println("내가 가진 숫자 : "+rand_me1+" "+rand_me2+" 합계 : "+me_sum);
		if(me_sum>21)System.out.println("you lose");
		else {
			System.out.println("숫자를 추가하시려면 1을 눌러주시고 아닐경우 0을 입력해주세요 : ");
			a = scan.nextInt();
			if(a == 1) {
				prand = (int) Math.round(Math.random() * 10) + 1;
				me_sum += prand;
				System.out.println("내가 가진 숫자 : "+rand_me1+" "+rand_me2+" "+prand+" 합계 : "+me_sum);
				System.out.println("pc가 가진 숫자 : "+rand_pc1+" "+rand_pc2+ " 합계 : "+pc_sum);
			}
		}
		if(me_sum>21)System.out.println("you lose");
		else {
			if(pc_sum>21)System.out.println("pc lose");
			if(me_sum>pc_sum)System.out.println("you win");
			else System.out.println("you lose");
		}
	}

}
