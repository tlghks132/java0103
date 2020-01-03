package java0103;

public class Java0103 {

	// JAVA Application의 시작 메소드.
	public static void main(String[] args) {
		// short에 32767 보다 큰 숫자는 그냥 저장 안됨.
		// 강제 형 변환을 통해서만 저장됨
		// 16비트 앞쪽의 비트는 잘리게 됨 - Overflow
		// 가장 작은 숫자부터 다시 시작 - 음수가 저장됨
		// 반대되는 현상을 Underflow 라고 한다.
		short s = (short) 32768;

		// 저장된 데이터 출력
		System.out.println("s:" + s);

	}

}
