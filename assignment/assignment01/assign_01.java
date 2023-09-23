package assignment;

import java.util.Scanner;

public class assgin_01 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.print("날짜를 입력하세요 : ");
		int number = myScanner.nextInt();
		
		switch (number) {
		case 12:
		case 1:
		case 2:
			System.out.println("겨울입니다.");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("봄입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을입니다.");
			break;
		default:
			System.out.println("잘못된 숫자를 입력했습니다.");
			break;
		}
	}
}
