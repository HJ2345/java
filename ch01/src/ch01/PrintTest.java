package ch01;
/*
 * 날짜 : 2024/12/31
 * 이름 : 홍준혁
 * 내용 : 출력 테스트
 */
public class PrintTest {

	
	
	public static void main(String[] args) {
		
		// 기본출력
		System.out.println("Hello Java!");
		System.out.println("Hello Korea!");
		System.out.println("Hello Busan!");
		
		// 한줄출력
		System.out.print("Welcome");// ln : 줄바꿈(개행) 처리X 따라서 출력 문자열 이어져서 출력
		System.out.print("Java");
		System.out.print("Spring");
		
		// 개행출력
		System.out.println(); //줄바꿈(개행)_
		System.out.print("Greeting\n");// \n 이스케이프 문자로 줄바꿈(개행) 처리
		System.out.print("Java");
		
	}
	
	
}