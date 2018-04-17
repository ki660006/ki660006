
public class zzz {
	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;
		//char 1 -> 49
		char temp[] = str.toCharArray();
		Character temp1 = temp[0];
		System.out.println(temp1.getNumericValue(temp[0]) +temp1.getNumericValue(temp[1]));
		
//		for (int i = 0; i < temp.length; i++) {
//			System.out.println(temp[i]);
			
//			sum += (int)temp[i]-48;
//			System.out.println("sum "+sum);
//		}
//
//		System.out.println("sum "+sum);
		// for(int i=0;i<str.length();i++) {
		// int num = str.charAt(i);
		//
		// System.out.println("str.charAt("+i+"):"+num);
		//
		// System.out.println((int)str.charAt(i));
		// sum += num-'0';
		// }
		//
		// System.out.println("sum = "+sum);
	}
}
