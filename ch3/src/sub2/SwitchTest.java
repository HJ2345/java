package sub2;

import java.util.Scanner;

/*
* 날짜 : 2025/01/02
* 이름 : 홍준혁
* 내용 : scanner문 switch문
*/

public class SwitchTest {
	
 public static void main(String[] args) {
	
	 System.out.print("숫자 입력 : ");
	 //사용자 입력
	 Scanner sc = new Scanner(System.in); //키보드로 입력받는 스캐너
     int number = sc.nextInt(); //number에 입력문자 저장 (nextInt는 정수만 입력가능)
     
     System.out.println("입력 숫자: "+number);
     
     // 조건값에 따라 case별 실행 ex) case 1, case2 네임테그
     switch (number % 2) {
     
	case 0:
		
		System.out.println("number는 짝수");
		
		break;
		
	case 1:
		
		System.out.println("number는 홀수");
		
		break;
		
	default:
		
		System.out.println("number는 숫자가 아님");
		
		break;
	}
     
     
     
   }
}
