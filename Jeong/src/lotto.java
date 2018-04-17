
public class lotto {
	public static void main(String[] args) {

		int arr3[] = new int[6];

		System.out.println("문제 3");

		arr3[0] = (int) (Math.random() * 45) + 1;

		for (int i = 1; i < arr3.length; i++) {

			while (true) {
				int temp = (int) (Math.random() * 45) + 1;
				boolean thereissamenumber = false;
				for (int j = 0; j < i; j++) {
					if (temp == arr3[j]) {
						thereissamenumber = true;
					}
				}
				if (thereissamenumber == false) {
					arr3[i] = temp;
					break;
				}
			}

		}
		for (int i = 0; i < arr3.length; i++) {

			System.out.println(arr3[i]);

		}
	}
}
