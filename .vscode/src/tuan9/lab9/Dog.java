package tuan09;

public class Dog extends Animal{

	public Dog(String name, double d, String breed) {
		super(name, d, breed);
	}
	
	@Override
	protected void makeNoise() {
		System.out.println("Gâu gâu gâu!!!");
	}

	@Override
	protected void play() {
		System.out.println("Chó đang nghịch cục xương ");
	}

	@Override
	protected void eat() {
		System.out.println("Chó đang ăn xương");
	}
}