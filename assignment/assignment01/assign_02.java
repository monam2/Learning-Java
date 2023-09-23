package assignment;

import java.util.Scanner;

public class assign_02 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.print("날짜를 입력하세요 : ");
		int number = myScanner.nextInt();
		
		if (number>=3 && number<6)
			System.out.println("봄입니다.");
		
		else if (number>=6 && number<9)
			System.out.println("여름입니다.");
		
		else if (number>=9 && number<12)
			System.out.println("가을입니다.");
		
		else if (number==12 || (number>0 && number<3))
			System.out.println("겨울입니다.");
		
		else
			System.out.println("잘못된 숫자를 입력했습니다.");
	}
}
