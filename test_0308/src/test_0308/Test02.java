package test_0308;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		int arr[] = new int[5];
		int max =0;
		Scanner sc = new Scanner(System.in);
		for(int i=1; i<=5; i++) {
			int a = sc.nextInt();
			if(a>max) {
				max=a;
			
			}
		}
		System.out.println(max);
	}

}
