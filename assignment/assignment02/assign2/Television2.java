package assignment;

import java.util.Scanner;

public class Television2 {
	String company;
	String inch;
	String year;
	

	public Television2(String s, String n, String y) { //생성자
		this.company = s; this.inch = n; this.year = y;
	}
	
	public Television2 print_info() { //메소드
		String result = "제조회사는 " + company + ", 크기는 " + inch + "인치, 제조연도는 " + year + "입니다.";
		System.out.println(result);
		return null;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("제품 수를 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		Television2 [] arr = new Television2[num];  //객체 배열 생성
		
		for (int i=0;i<num;i++) {
			System.out.print("제품명, 사이즈, 제조년도를 순서대로 입력하세요 : ");
			String s= sc.nextLine();
			String sArr[] = s.split(" ");
			String company_ = sArr[0];
			String inch_ = sArr[1];
			String year_ = sArr[2];
			
			arr[i] = new Television2(company_, inch_, year_);
		}
		for (Television2 value : arr) {
			value.print_info();
		}
		sc.close();
	}
}
