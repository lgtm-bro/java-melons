public class Melon {

	public static void main(String[] args) {
		System.out.println("melon defined");
	}

    MelonType melonType;
    int shapeRating;
    int colorRating;
    int field;
    String harvester;

	public Melon (
		MelonType melonType,
		int shapeRating,
		int colorRating,
		int field,
		String harvester) {
		this.melonType = melonType;
		this.shapeRating = shapeRating;
		this.colorRating = colorRating;
		this.field = field;
		this.harvester = harvester;
	}

	public boolean isSellable() {
		if (this.shapeRating < 6 || this.colorRating < 6 || this.field == 3) {
			return false;
		} else {
			return true;
		}
	}

}

