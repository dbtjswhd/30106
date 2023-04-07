import java.util.Scanner;

public class TestExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int sum=0;
		if(a>=500) {
			System.out.println("500 이하의 자연수를 입력해주세요");
		}else if(a<=500) {
			for(int i=a;i<=500; i++) {
				if(a%3==0 && a%7==0) {
					System.out.println(i);
					sum++;
					
			}
				
			}
		}

	}

}
