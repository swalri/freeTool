package 조건문_;

import java.util.Scanner;

public class QP01_0414 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int su_scan;
		String result_scan;
		int num1_scan, num2_scan;
		
		
		System.out.print("수 입력 : ");
		su_scan = scan.nextInt();
		result_scan = (su_scan%2 ==0)?"짝수":"홀수";
		System.out.println(result_scan);
		result_scan = (su_scan%3 ==0)?"3의 배수이다":"3의 배수가 아니다";
		System.out.println(result_scan);
		
		System.out.print("두 수 입력 : ");
		num1_scan = scan.nextInt();
		num2_scan = scan.nextInt();
		System.out.println("num1 : "+num1_scan+", num2 : "+num2_scan);
		result_scan = (num1_scan > num2_scan)?"num1이 num2보다 크다":"num2이 num1보다 크다";
		result_scan = (num1_scan == num2_scan)?"num1와 num2는 같다":result_scan;
		System.out.println(result_scan);
		
	}
}
