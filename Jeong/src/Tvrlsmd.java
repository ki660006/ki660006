
class Tvrlsmd {
	String color;
	boolean power;
	int channel;
	
	
	void power() {
		power = !power;
	}
	void channelup() {
		++channel;
	}
	void channeldown() {
		--channel;
	}
	
	public static void main(String[] args) {
		
		Tvrlsmd Tv1 = new Tvrlsmd();
		Tvrlsmd Tv2 = new Tvrlsmd();
		
		
		System.out.println("TV 전원 : "+Tv1.power);
		
		Tv1.power();
		
		System.out.println("TV 전원 : "+Tv1.power);
		
		Tv1.channel = 7;
		System.out.println("TV1 채널 : "+Tv1.channel);
		
		Tv1.channelup();
		
		System.out.println("TV1 채널 : "+Tv1.channel);
		
		Tv1.channeldown();
		Tv1.channeldown();
		
		System.out.println("TV1 채널 : "+Tv1.channel);
		
	}
	
	
}

