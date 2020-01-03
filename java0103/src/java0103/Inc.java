package java0103;

public class Inc {

	public static void main(String[] args) {
		int a = 10;
		// a의 값 1 증가
		a++;
		System.out.printf("a:" + a); // 11출력

		// a가 11인 ㄴ상태에서 명령에 먼저 사용하고 1 증가
		// 11이 출력되고 a는 12가 된다.
		System.out.println("a:" + (a++));

		// a를 먼저 증가시켜서 13을 만들고 명령에 사용
		System.out.println("a:" + (++a));

	}

}
