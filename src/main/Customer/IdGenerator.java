package main.Customer;

/**
 * Created by IntelliJ IDEA.
 *
 * @author Osaide Ogbeifun
 *         date: 1/19/12
 *         time: 11:12 PM
 */

public final class IdGenerator {
	private static IdGenerator instance = null;
	private long maxId = 1111110;

	protected IdGenerator() {
	}

	public static IdGenerator getInstance() {
		if (instance == null) {
			instance = new IdGenerator();
		}
		return instance;
	}


	public String getNextId() {
		String sMaxId = String.valueOf(++maxId);
		return sMaxId.substring(0, 3) + "-" + sMaxId.substring(3, 7);
	}

}
