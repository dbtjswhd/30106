package test_0308;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum =0;
		int i = 0;
		int a = scan.nextInt();
			for(i=1; i<=a; i++) {
				if(i%4==0) {
					System.out.println(i);
					sum += i;
			}
		}
			System.out.println(sum);

	}

}
