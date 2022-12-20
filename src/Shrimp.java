
public class Shrimp extends SeaAnimal implements Swimable, Walkable{
	
	private Integer legs;

	public Shrimp(String name, String gender, Integer age, Integer legs) {
		super(name, gender, age);
		this.setLegs(legs);
	}

	public Integer getLegs() {
		return legs;
	}

	public void setLegs(Integer legs) {
		this.legs = legs;
	}
	
	@Override
	public String doWalk() {
		return "Walk Walk Walk...";
	}

	@Override
	public String doSwim() {
		return "Swim Swim Swim...";
	}

	@Override
	public void printDetails() {
		System.out.println("---------------------------------------------------------------------------");
		System.out.printf("%-10s|%-10s|%-5d|%-10d|%-35s|\n", getName(), getGender(), getAge(), getLegs(), printSkill());
	}

	@Override
	public String printSkill() {
		return doWalk() + " " + doSwim();
	}

}
