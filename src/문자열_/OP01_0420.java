package 문자열_;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class OP01_0420 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//동명이인일경우를 생각해서 다시만들어야 함
		Scanner scan = new Scanner(System.in);
		ArrayList<String> name_Arr = new ArrayList<>();
		ArrayList<String> phon_Arr = new ArrayList<>();
		int num;
		final String phonSetting = "010";
		String name=null, phon=null;
		while(true) {
			System.out.println("==================");//칸나누기
			System.out.println("1.연락처 등록");
			System.out.println("2.연락처 보기");
			System.out.println("3.연락처 삭제");
			System.out.println("4.모든 연락처 보기");
			System.out.println("5.종료");
			System.out.print(">>> ");
			num = scan.nextInt();
			//실행
			switch(num) {
			case 1://연락처 등록
				System.out.println("==================");//칸나누기
				System.out.print("이름 : ");
				name  = scan.next();
				if(name_Arr.contains(name)) {
					System.out.println("중복된 이름입니다");
				}else {
					System.out.print("전화번호 "+phonSetting+"없이, -없이 : ");
					phon  = scan.next();
					if(phon_Arr.contains(phon)) {
						System.out.println("중복된 전화번호입니다");
					}else {
						name_Arr.add(name);
						phon_Arr.add(phon);
						System.out.println("등록되었습니다");
					}
				}
				break;
			case 2://연락처 보기
				System.out.println("==================");//칸나누기
				if(name_Arr.size()==0) {
					System.out.println("등록되어있는 연락처가 없습니다");
				}else {
					System.out.println("연락처를 확인할 이름 : ");
					name  = scan.next();
					if(name_Arr.contains(name)) {
						System.out.println("이름 : "+name);
						System.out.println("전화번호 : "+phonSetting+phon_Arr.get(name_Arr.indexOf(name)));
					}else {
						System.out.println("등록되어 있지 않은 이름입니다");
					}
				}
				break;
			case 3://연락처 삭제
				System.out.println("==================");//칸나누기
				if(name_Arr.size()==0) {
					System.out.println("등록되어있는 연락처가 없습니다");
				}else {
					System.out.print("삭제할 연락처 이름 : ");
					name  = scan.next();
					if(name_Arr.contains(name)) {
						phon_Arr.remove(name_Arr.indexOf(name));
						name_Arr.remove(name);
						System.out.println("삭제되었습니다");
					}else {
						System.out.println("등록되어 있지 않은 이름입니다");
					}
				}
				break;
			case 4://모든 연락처 보기
				System.out.println("==================");//칸나누기
				if(name_Arr.size()==0) {
					System.out.println("등록되어있는 연락처가 없습니다");
				}else {
//					Iterator<String> name_It = name_Arr.iterator();
//					Iterator<String> phon_It = phon_Arr.iterator();
//					while(name_It.hasNext()) {
//						System.out.println("이름 : "+name_It.next()+" 전화번호 : "+phonSetting+phon_It.next());
//					}
					for(int i=0;i<name_Arr.size();i++) {
						System.out.println("이름 : "+name_Arr.get(i)+" 전화번호 : "+phon_Arr.get(i));
					}
				}
				break;
			case 5:
				System.exit(0);
				break;
			default:
				break;
			}//switch
		}//while
	}
}