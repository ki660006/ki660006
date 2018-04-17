
public class lottodang {
	public static void main(String[] args) {
		int lotto[] = new int[6];

		lotto[0] = (int) (Math.random() * 45) + 1;
		
		for(int i=1; i<lotto.length; i++) {
			while(true) {
				int temp = (int)(Math.random()*45)+1;
				boolean samnumber = false;
				for(int j=0; j<i; j++) {
					if(temp == lotto[j]) {
						samnumber = true;
					}
					
				}
				if(samnumber == false) {
					lotto[i] = temp;
					break;
				}
			}
		}
		
		System.out.print("로또 번호 : {  ");
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i]);
			System.out.print("  ");
		}
		System.out.print("}");

	}
}
