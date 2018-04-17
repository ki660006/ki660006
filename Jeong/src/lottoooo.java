
public class lottoooo {
	public static void main(String[] args) {
		
		int lot[] = new int[6];
		lot[0] = (int)(Math.random()*45)+1;
		
		for(int i = 1; i<lot.length; i++) {
			while(true) {
				int temp = (int)(Math.random()*45)+1;
				boolean sn = false;
				for(int j=0; j<i ; j++) {
					if(temp == lot[j]) {
						sn = true;
					}
				}
				if(sn == false) {
					lot[i]=temp;
					break;
				}
			}
		}
		for(int i=0 ; i<lot.length;i++) {
			System.out.println(lot[i]);
		}
		
		
		
		
	}
}
