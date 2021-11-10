package tuan09;

public class Cat extends Animal{
	

	public Cat(String name, double d, String breed) {
		super(name, d, breed);
	}

	@Override
	protected void makeNoise() {
		System.out.println("Meo meo meo!!!");
	}

	@Override
	protected void play() {
		System.out.println("Chơi với bóng tròn");
	}

	@Override
	protected void eat() {
		System.out.println("Meo đang ăn");
	}	

}