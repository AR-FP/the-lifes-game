package theLifesGame;
/**
 * This class creates the "Threesome" object.
 * 
 * @author Alexis Nikolas Rodriguez de Aysa
 *
 */
public class Threesome {
	
	/*
	 * We create the atributes.
	 */
	private int numI;
	private int alive;
	private int newC;
	
	/**
	 * pre: The atributes are sent 
	 * 		as parameters.
	 * post: The first constructor 
	 * 		 is created.
	 */
	public Threesome(int numI, int alive, 
			int newC) {
		super();
		this.numI = numI;
		this.alive = alive;
		this.newC = newC;
	}
	
	/**
	 * pre:---
	 * post: The second constructor is created 
	 * 		 by default.
	 */
	public Threesome() {
		
	}
	
	/**
	 * pre:---
	 * post: The Getters and Setters  
	 * 		 are created.
	 */
	public int getNumI() {
		return numI;
	}
	public void setNumI(int numI) {
		this.numI = numI;
	}
	public int getAlive() {
		return alive;
	}
	public void setAlive(int alive) {
		this.alive = alive;
	}
	public int getNewC() {
		return newC;
	}
	public void setNewC(int newC) {
		this.newC = newC;
	}
	
	/**
	 * Finally, we program the toString method.
	 */
	@Override
	public String toString() {
		return "The actual generation pertains "
				+ "to the digit ==)> " + numI +
				"\n=== ====== ========== "
				+ "======== == === =====      "
				+ "=========" + 
				"\nThe remaining digit of cells"
				+ " is shown next ==)> " + 
				alive +
				"\n=== ========= ===== == ====="
				+ " == ===== ====      "
				+ "=========" +
				"\nThe quantity of cells that "
				+ "appeared matching "
				+ "the conditions is ==)> " + 
				newC + 
				"\n=== ======== == ===== ==== "
				+ "======== ======== "
				+ "=== ========== ==      "
				+ "=========";
	}
}