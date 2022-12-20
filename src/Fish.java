
public class Fish extends SeaAnimal implements Swimable {

	private Integer fins;
	
	public Fish(String name, String gender, Integer age, Integer fins) {
		super(name, gender, age);
		this.setFins(fins);
	}

	public Integer getFins() {
		return fins;
	}

	public void setFins(Integer fins) {
		this.fins = fins;
	}
	
	@Override
	public void printDetails() {
		System.out.println("---------------------------------------------------------------------------");
		System.out.printf("%-10s|%-10s|%-5d|%-10d|%-35s|\n", getName(), getGender(), getAge(), getFins(), printSkill());
	}

	@Override
	public String printSkill() {
		return doSwim();
	}

	@Override
	public String doSwim() {
		return "Swim Swim Swim...";
	}
	
}
