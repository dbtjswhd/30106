package test_0315;

import java.util.Scanner;
import java.util.*;

public class RandomDice {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("주사위 던질 횟수 입력 : ");
        int num = sc.nextInt();
        int sum=0;
        int rand =0;
        for(int i=1; i<=num; i++) {
            rand = rd.nextInt(6)+1;
            System.out.println(i+"첫번째 숫자는 "+rand+"입니다.");
            sum+=rand;
        }
        System.out.println("주사위를 "+num+"번 던진 결과, 총 합은 "+sum+"입니다.");
    }

}
