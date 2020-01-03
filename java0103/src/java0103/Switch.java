package java0103;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {

		// 키보드로부터 입력받기 위한 객체를 생성
		Scanner sc = new Scanner(System.in);
		// 메뉴 입력 받기
		System.out.print("메뉴 입력(1-한식 2-중식 3-분식 기타-일식");
		int menu = sc.nextInt();

		// final을 앞에 붙이면 읽기 전용
		final int KOREA = 1;
		final int CHINA = 2;
		final int SNACKBAR = 3;

		switch (menu) {
		case 1:
			System.out.println("한식");
			break;
		case 2:
			System.out.println("중식");
			break;
		case 3:
			System.out.println("분식");
			break;
		default:
			System.out.println("일식");
			break;

		}

	}

}
