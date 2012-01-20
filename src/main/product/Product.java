package main.product;

/**
 * Created by IntelliJ IDEA.
 *
 * @author Osaide Ogbeifun
 *         date: 1/19/12
 *         time: 3:06 PM
 */

public abstract class Product {
	private String name = "";
	private String id = "";
	private String dirName;
	private String rating;

	public Product(String id, String name) {
		this.name = name;
		this.id = id;
	}

	public Product(String id, String name, String dirName, String rating) {
		this.name = name;
		this.id = id;
		this.dirName = dirName;
		this.rating = rating;
	}

	public String getName() {
		if (dirName != null) {
			return name + " " + dirName + " " + rating;
		}
		return name;
	}

	public String getId() {
		return id;
	}
}
