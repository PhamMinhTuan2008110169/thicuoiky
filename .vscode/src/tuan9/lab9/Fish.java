package tuan09;
public class Fish extends Animal{

	public Fish(String name, double d, String breed) {
		super(name, d, breed);
	}
	
	@Override
	protected void makeNoise() {
		System.out.println("ooO ooO ooO!");
	}

	@Override
	protected void play() {
		System.out.println("Cá đang chơi với bong bóng nước");
	}

	@Override
	protected void eat() {
		System.out.println("Cá đang ăn thức ăn mồi");
	}
}