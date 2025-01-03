package sub1;
/*
 * 날짜 : 2024/12/31
 * 이름 : 홍준혁
 * 내용 : ch02.변수와 연산자
 *  
 */

public class VariableTset {

	public static void main(String[] args) {
		// 변수
		int a = 3; // 초기화(최초로 변수에 값을 저장)
		int b = 7;
		
		System.out.println("a 값 : " +a);
		System.out.println("b 값 : " +b);
		
		a = 5; // 재할당(변수에 값을 다시 저장)
		b = 9;
		
		System.out.println("a 값 : " +a);
		System.out.println("b 값 : " +b);
		
		
		// 상수
		final int NUM = 5; // final int X 는 상수로 X 값을 재할당 해도 값이 변하지 않음(오류 발생) (상수는 대문자를 쓰는것이 관례)
		
		System.out.println("NUM 값 : " +NUM);

		
	}
}
