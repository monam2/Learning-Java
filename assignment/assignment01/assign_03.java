package assignment;

public class assign_03 {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] newArr = new int[3][3];
		
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				newArr[j][i] = arr[i][j];
			}
		}
		
		System.out.println("변환전");
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("변환전");
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				System.out.print(newArr[i][j]);
			}
			System.out.println();
		}
	}
}
