import java.util.Vector;

public class Store {

	private static Store store;
	private Vector<SeaAnimal> itemList = new Vector<SeaAnimal>();
	
	public static Store getInstance() {
		if(store == null)
			store = new Store();
		return store;
	}
	
	public void addItem(SeaAnimal animal) {
		itemList.add(animal);
	}
	
	public void viewAll() {
		if(itemList.isEmpty()) {
			System.out.println("No Data !");	
		} else {
			System.out.printf("%-10s|%-10s|%-5s|%-10s|%-35s|\n", "Name", "Gender", "Age", "Fins/Legs", "Skill");
			for(SeaAnimal animal : itemList) {
				animal.printDetails();
			}
		}
	}

}
