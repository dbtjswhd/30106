import java.util.Scanner;

public class StarExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 int num = scan.nextInt();
		 int num2 = scan.nextInt();
		 int i=0;
		 int j=0;
		 if(num2==1) {
		  for(i=1; i<=num; i++) {
			  for(j=1; j<=i; j++) {
				 System.out.print("*");
			  }
			  System.out.println();
		  	}
		 
		 }
		  else if(num2==2) {
			  for(i=1; i<=num; i++) {
				  for(j=1; j<=num-i+1; j++) {
					  System.out.print("*"); 
				  }
				  System.out.println();
			  }
			    
			 }
	}
}