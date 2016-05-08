package part2.day2;

public class Gun extends Weapon {
	private int maxAmmo;
	private int capacityOfMagazine;
	boolean isBoltAction;

	private int reloadingSeconds;
	private int accuracy;
	private int weight;

	public void takeAShot() {
		System.out.println("bang!!");

	}
	public void reload() {
		;
	}

	public Gun() {
		System.out.println("Gun object is initilized.");
	}

	/**
	 * return the max ammo of gun...
	 * @return
     */
	public int getMaxAmmo() {
		return this.maxAmmo;
	}
}
