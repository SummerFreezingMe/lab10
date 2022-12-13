public class Institute {

	public Institute(String name, String address, int rating) {
		this.name = name;
		this.address = address;
		this.rating = rating;
	}

	public String name;
	public String address;

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int rating;
}