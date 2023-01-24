import javax.sound.sampled.SourceDataLine;

public class Main {

	public static void main(String[] args) {
		System.out.println("Instantiate objects here!");

		MelonType muskmelon = new MelonType("musk","Muskmelon", 1998, "green", true, true);
		MelonType casaba = new MelonType("cas","Casaba", 2003, "orange", false, false);
		MelonType crenshaw = new MelonType("cren","Crenshaw", 1996, "green", true, false);
		MelonType yellowMelon = new MelonType("yw","Yellow Watermelon", 2013, "yellow", false, true);

		MelonType[] melon_type_array = {muskmelon, casaba, crenshaw, yellowMelon};

		Melon melon1 = new Melon(yellowMelon, 8, 7, 2, "Sheila");
		Melon melon2 = new Melon(yellowMelon, 3, 4, 2, "Sheila");
		Melon melon3 = new Melon(casaba, 10, 6, 35, "Sheila");
		Melon melon4 = new Melon(crenshaw, 8, 9, 35,"Michael");
		Melon melon5 = new Melon(crenshaw, 8, 2, 35,"Michael");
		Melon melon6 = new Melon(muskmelon, 6 ,7, 4,"Michael");
		Melon melon7 = new Melon(yellowMelon, 7, 10, 3,"Sheila");

		Melon[] melon_harvest_array = {melon1, melon2, melon3, melon4, melon5, melon6, melon7};

		Main.getSellabilityReport(melon_harvest_array);
	}

	public static void getSellabilityReport(Melon[] melons) {
	for(Melon melon: melons) {
		String sellable;

		if (melon.isSellable()) {
			sellable = "(CAN BE SOLD)";
		} else {
			sellable = "(NOT SELLABLE)";
		}
		System.out.printf("Harvested by %s from Field %d %s \n", melon.harvester, melon.field, sellable);
		// System.out.println();
		}
	}
}
