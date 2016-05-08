package part2.day2;

public class SniperRifle extends Gun {
	private int range;

	@Override
	public void takeAShot() {
		int someValue = this.getMaxAmmo();
		super.takeAShot();
		System.out.println("...........bang~~~!");

	}

	public SniperRifle() {
		super();
		System.out.println("SniperRifle is init...");

	}
}
