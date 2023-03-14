import java.util.Scanner;

public class GradeExam {

	public static void main(String[] args) {
		System.out.println("수학, 과학, 영어 순으로 3과목의 점수 입력>>");
		Scanner scan = new Scanner(System.in);
		int math = scan.nextInt();
		int sin = scan.nextInt();
		int eng = scan.nextInt();
		Grade me = new Grade(math,sin,eng);
		System.out.println(me.Average());
		}
}

	class Grade{
		int math=0;
		int sin=0;
		int eng=0;	
		
		public Grade(int math , int sin ,  int eng) {
			this.math = math;
			this.sin = sin;
			this.eng = eng;
		}
		
		public int Average() {
			int avg = (math+sin+eng)/3;
			 return avg;
		}
	}
