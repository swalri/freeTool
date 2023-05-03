package 문자열_;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
public class test01_0421 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<String, Integer> menu = new HashMap<>();
		String menu_Name;
		int ch_Menu, ch_Menu_Option, menu_Pr;
		boolean tf = true;
		
		//프로그램 실행
		while(true) {
			System.out.println("==================");//칸나누기
			System.out.println("1. 메뉴 등록");
			System.out.println("2. 메뉴별 가격 보기");
			System.out.println("3. 종료");
			System.out.print(">>> ");
			ch_Menu = scan.nextInt();
			switch(ch_Menu) {
			case 1://메뉴 등록
				System.out.print("이름 : ");
				menu_Name = scan.next();
				if(menu.containsKey(menu_Name)) {
					System.out.println("존재하는 메뉴입니다");
				}else {
					System.out.print("가격 : ");
					menu_Pr = scan.nextInt();
					menu.put(menu_Name, menu_Pr);
				}//if
				break;
			case 2://메뉴보기 및 수정,삭제
				if(0==menu.size()) {
					System.out.println("등록되어있는 메뉴가 없습니다");
				}else {
					tf = true;
					while(tf) {
						Iterator<String> it_Name = menu.keySet().iterator();
						Iterator<Integer> it_Pr = menu.values().iterator();
						int i = 1;
						while(it_Name.hasNext()) {
							String name = it_Name.next();
							int price = it_Pr.next();
							System.out.println(i+". "+name+" : "+price+"원");
//							System.out.println(it_Name.next()+" : "+it_Pr.next());
							i++;
						}//while while
						
						System.out.println("1. 수정, 2. 삭제, 3. 나가기");
						System.out.print(">>> ");
						ch_Menu_Option = scan.nextInt();
						switch(ch_Menu_Option) {
						case 1://수정
							System.out.print("이름 : ");
							menu_Name = scan.next();
							if(menu.containsKey(menu_Name)) {
								System.out.println("현재 가격은 "+menu.get(menu_Name)+"원입니다");
								System.out.print("얼마로 수정하시 겠습니까? >>> ");
								menu_Pr = scan.nextInt();
								menu.put(menu_Name,menu_Pr);
								System.out.println("수정되었습니다");
							}else {
								System.out.println("없는 메뉴입니다");
							}
							break;
						case 2://삭제
							System.out.print("이름 : ");
							menu_Name = scan.next();
							if(menu.containsKey(menu_Name)) {
								System.out.println(menu_Name+" : "+menu.get(menu_Name));
								menu.remove(menu_Name);
								System.out.println("삭제되었습니다");
							}else {
								System.out.println("없는 메뉴입니다");
							}
							break;
						case 3://나가기
							tf = false;
							break;
						default:
							System.out.println("잘못입력했습니다");
							break;
						}//case 2 switch
					}//case 2 while
				}//case 2
				break;
			case 3://종료
				System.out.println("종료합니다");
				System.exit(0);
				break;
			default://오류
				System.out.println("잘못입력했습니다");
				break;
			}//switch
		}//while
	}
}