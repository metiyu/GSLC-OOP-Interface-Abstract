import java.util.Scanner;

public class Main {

	//Gabriel Matthew Mintana
	//2502006253
	//Fish Store
	
	private Scanner scan = new Scanner(System.in);
	private Store store = Store.getInstance();
	
	public Main() {
		int inp;
		do {
			System.out.println("Aquarium Store");
			System.out.println("==========");
			System.out.println("1. View All Item");
			System.out.println("2. Add Item");
			System.out.println("3. Exit");
			System.out.print(">> ");
			inp = scan.nextInt(); scan.nextLine();
			switch (inp) {
			case 1:
				viewAll();
				break;
			case 2:
				addItem();
				break;
			default:
				break;
			}
		}while(inp != 3);
	}

	private void addItem() {
		String name, gender, type;
		String age;
		do {
			System.out.print("Input type [Fish | Shrimp]: ");
			type = scan.nextLine();
		}while(!(type.equals("Fish") || type.equals("Shrimp")));
		do {
			System.out.print("Input name [more than 3 character]: ");
			name = scan.nextLine();
		}while(name.length()<3);
		do {
			System.out.print("Input gender [Male | Female]: ");
			gender = scan.nextLine();
		}while(!(gender.equals("Male") || gender.equals("Female")));
		do {
			System.out.print("Input age [cannot empty]: ");
			age = scan.nextLine();
			try {
				Integer.valueOf(age);
			} catch (Exception e) {
				age = "";
			}
		}while(age.isBlank() || age.isEmpty());
		if(type.equals("Fish")) {
			String fins;
			do {
				System.out.print("Input fins [cannot empty]: ");
				fins = scan.nextLine();
				try {
					Integer.valueOf(age);
				} catch (Exception e) {
					fins = "";
				}
			}while(fins.isBlank() || fins.isEmpty());
			Fish fish = new Fish(name, gender, Integer.valueOf(age), Integer.valueOf(fins));
			store.addItem(fish);
		} else if(type.equals("Shrimp")) {
			String legs;
			do {
				System.out.print("Input legs [cannot empty]: ");
				legs = scan.nextLine();
				try {
					Integer.valueOf(age);
				} catch (Exception e) {
					legs = "";
				}
			}while(legs.isBlank() || legs.isEmpty());
			Shrimp shrimp = new Shrimp(name, gender, Integer.valueOf(age), Integer.valueOf(legs));
			store.addItem(shrimp);
		}
	}

	private void viewAll() {
		store.viewAll();
	}

	public static void main(String[] args) {
		new Main();
	}

}
