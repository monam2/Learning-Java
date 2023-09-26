package assignment;

import java.util.Scanner;

public class assign_04 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int[] myarray = new int[10];
		
		System.out.print("정수를 입력하세요 : ");
		int number = myScanner.nextInt();
		
		int i = 0;
		while (true) {
			if (i>=10) {
				System.out.println("가득찼습니다.");
				System.out.println(number+"는 저장되지 않습니다.");
				break;
				}
			myarray[i]= number;
			System.out.print("정수를 입력하세요 : ");
			number = myScanner.nextInt();
			i++;
		}
		System.out.println("myarray에는");
		for (int k=0;k<myarray.length;k++) {
			System.out.print(k+" 번째"+myarray[k]);
			if (k<myarray.length-1) System.out.print(", ");
		}
		System.out.println("가 저장되어 있습니다.");
	}
}
