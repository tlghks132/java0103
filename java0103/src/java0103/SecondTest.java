package java0103;

public class SecondTest {

	public static void main(String[] args) {
		int second = 309209;

		int day = second / 86400; // 일
		int hour = (day * 86400) / 3600;
		int minute = (second - (day * 86400) - (hour * 3600)) / 60;
		// 초는 분까지 가져간 것을 모두 빼면 되는데 일, 시간, 분은 전부 60의 배수이기 때문에
		// 60으로 나눈 나머지가 모두 뺀 값이 된다.
		int sec = second % 60;

		System.out.println(day + "일" + hour + "시간" + minute + "분" + sec + "초");
	}

}
