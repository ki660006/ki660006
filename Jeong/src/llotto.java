
public class llotto {
	public static void main(String[] args) {

		int lotto1[] = new int[6];

		lotto1[0] = (int) (Math.random() * 45) + 1;

		for (int i = 1; i < lotto1.length; i++) {
			while(true) {
				int temp=(int) (Math.random() * 45) + 1;
				boolean a = false;
				for(int j=0;j<i;j++) {
					if(temp == lotto1[j]) {
						a = true;
					}
				}
				if(a == false) {
					lotto1[i]=temp;
					break;
				}
			}
		}
		for(int i = 0 ; i<lotto1.length; i++) {
			System.out.println(lotto1[i]);
		}
	}
}
