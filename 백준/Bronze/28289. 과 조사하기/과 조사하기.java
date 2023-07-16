import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int p = sc.nextInt();
		int[] clubNum = {0,0,0,0};
		for (int i = 0; i < p; i++) { 
			int grade = sc.nextInt();
			int classNum = sc.nextInt();
			int num = sc.nextInt();
			
			if(grade == 1) {
				clubNum[3]++;
				continue;
			}
			switch (classNum) {
			case 1: case 2:
				clubNum[0]++;
				break;
			case 3:
				clubNum[1]++;
				break;
			case 4:
				clubNum[2]++;
			default:
				break;
			}
		}
		for (int i = 0; i < clubNum.length; i++) {
			System.out.println(clubNum[i]);
		}
	}
}
