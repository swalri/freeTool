package op_test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class OP01_TestClass01 {
	Scanner scan = new Scanner(System.in);
	//실행
	public void StartMain() {
		int num;
		while(true) {
			System.out.println("==============");
			System.out.println("1. 이름 출력");
			System.out.println("2. 짝홀 구분");
			System.out.println("3. 3의 배수 구분");
			System.out.println("4. 소수 판별");
			System.out.println("5. 절대값");
			System.out.println("6. 종료");
			num = scan.nextInt();
			switch(num) {
			case 1:
				test01();
				break;
			case 2:
				test02();
				break;
			case 3:
				test03();
				break;
			case 4:
				test04();
				break;
			case 5:
				test05();
				break;
			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("오류");
				break;
			}
		}
	}
	
	//1. 3개의 이름을 입력받아 출력(배열, ArrayList, HashMap)
	public void test01() {
		boolean tf = true;
		while(tf) {
			int testNum;
			System.out.println("==============");
			System.out.println("1. 배열");
			System.out.println("2. ArrayList");
			System.out.println("3. HashMap");
			System.out.println("4. 종료");
			testNum = scan.nextInt();
			switch(testNum) {
			case 1:
				test01_01_result();
				break;
			case 2:
				test01_02_result();
				break;
			case 3:
				test01_03_result();
				break;
			case 4:
				tf = false;
				break;
			default:
				System.out.println("오류");
				break;
			}//switch
		}//while
	}
	//배열
	public String[] test01_01() {
		String name;
		String n[] = new String[3];
		for(int i=0;i<3;i++) {
			System.out.print("이름 입력 ");
			name = scan.next();
			n[i] = name;
		}
		return n;
	}
	public void test01_01_result(){
		String n[] = test01_01();
		for(int i=0;i<3;i++) {
			System.out.print(n[i]+" ");
		}
		System.out.println();
	}
	//ArrayList
	public ArrayList<String> test01_02() {
		String name;
		ArrayList<String> n = new ArrayList<>();
		for(int i=0;i<3;i++) {
			System.out.print("이름 입력 ");
			name = scan.next();
			n.add(name);
		}
		return n;
	}
	public void test01_02_result(){
		ArrayList<String> n = test01_02();
		System.out.println(n);
	}
	//HashMap
	public HashMap<Integer, String> test01_03() {
		String name;
		HashMap<Integer, String> n = new HashMap<>();
		for(int i=0;i<3;i++) {
			System.out.print("이름 입력 ");
			name = scan.next();
			n.put(i,name);
		}
		return n;
	}
	public void test01_03_result(){
		HashMap<Integer, String> n = test01_03();
		System.out.println(n.values());
	}
	
	//2. 입력 값이 짝/홀/ 구분
	public void test02() {
		int num;
		System.out.print("수 입력 ");
		num = scan.nextInt();
		if(test02_01(num)==0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
	}
	//값을받고 홀짝구분해서 리턴하는 코드
	public int test02_01(int num) {
		int n = num%2;
		return n;
	}
	
	//3. 입력 값이 3의 배수인지 아닌지 구분
	public void test03() {
		int num;
		System.out.print("수 입력 ");
		num = scan.nextInt();
		if(test03_01(num)) {
			System.out.println("3의 배수입니다");
		}else {
			System.out.println("3의 배수가 아닙니다");
		}
	}
	//값을받고 3의 배수인지 구분해서 리턴하는 코드
	public boolean test03_01(int num) {
		if(num%3==0) {
			return true;
		}
		return false;
	}
	
	//4. 입력값이 소수인지 아닌지 판별
	public void test04() {
		int num;
		System.out.print("수 입력 ");
		num = scan.nextInt();
		if(test04_01(num)) {
			System.out.println("소수입니다");
		}else {
			System.out.println("소수가 아닙니다");
		}
	}
	//값을 입력 받고 소수인지 판별
	public boolean test04_01(int num) {
		boolean bool = false;
		for(int i = 1;i<=num;i++) {
			if((i!=1&&i!=num)&&num%i==0) {
				bool = false;
				break;
			}else {
				bool = true;
			}
		}
		return bool;
	}
	
	//5. 절대값을 구하는 메소드
	public void test05() {
		int num;
		System.out.print("수 입력 ");
		num = scan.nextInt();
		System.out.println(num+"의 절대값은 "+test05_01(num)+"입니다");
	}
	//값을 입력 받고 그 값을 절대값으로 리턴하는 코드
	public int test05_01(int num) {
		int n;
		if(num<0) n = -num;
		else	  n = num;
		return n;
	}
	
	//6. 종료
	public void exit06() {
		System.exit(0);
	}
}