class aaa {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	int getTotal() {
		int asdf = kor+eng+math;
		return asdf;
	}
	float getAverage() {
		float fdsa = (getTotal())/3;
		return fdsa; 
	}
}

class Student {
	public static void main(String args[]) {
		aaa s = new aaa();

		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		System.out.println("이름:" + s.name);
		System.out.println("총점:" + s.getTotal());
		System.out.println("평균:" + s.getAverage());
	}
}
