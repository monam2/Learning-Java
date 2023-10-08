package assignment;

public class Television {
	String company;
	int inch;
	int year;
	
	public Television() {} //기본생성자
	public Television(String s) {//생성자1
		company = s;
	}
	public Television(String s, int n) {//생성자2
		company = s; inch = n;
	}
	public Television(String s, int n, int y) {//생성자3
		company = s; inch = n; year = y;
	}
	
	public String print_info() {
		String result = "제조회사는 " + company + ", 크기는 " + inch + "인치, 제조연도는 " + year + "입니다.";
		System.out.println(result);
		return null;
	}
	
	
	
	public static void main(String[] args) {
		Television tv0 = new Television();
		tv0.company = "samsung";
		tv0.inch = 100;
		tv0.year = 2021;
		
		Television tv1 = new Television("LG");
		tv1.inch = 60;
		tv1.year = 2022;
		
		Television tv2 = new Television("LG", 50);
		tv2.year = 2022;
		
		Television tv3 = new Television("LG", 50, 2023);
		
		
		tv0.print_info();
		tv1.print_info();
		tv2.print_info();
		tv3.print_info();
	}
	
}
