import java.util.*;

public class llll {
	public static void main(String[] args) {
		String answp[] = { "의자", "컴퓨터", "정수" };


		
		System.out.println("Q1. chair의 뜻은 ? ");
		Scanner scan1 = new Scanner(System.in);
		String input1 = scan1.nextLine();

		if (input1.equals(answp[0])) {
				System.out.println("정답입니다.");
			} else {
				System.out.println("틀렸습니다. 정답은 의자입니다.");
			}
		

		System.out.println("Q2. computer의 뜻은? ");
		Scanner scan2 = new Scanner(System.in);
		String input2 = scan2.nextLine();

		
		if (input2.equals(answp[1])) {
			System.out.println("정답입니다.");
		} else {
			System.out.println("틀렸습니다. 정답은 컴퓨터입니다.");
		}
		
		System.out.println("Q3. integer의 뜻은? ");
		Scanner scan3 = new Scanner(System.in);
		String input3 = scan3.nextLine();

		
		if (input3.equals(answp[2])) {
			System.out.println("정답입니다.");
		} else {
			System.out.println("틀렸습니다. 정답은 정수입니다.");
		}
		
		
		
		
		
	}
}
