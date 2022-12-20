
public abstract class SeaAnimal {

	private String name, gender;
	private Integer age;
	
	public SeaAnimal(String name, String gender, Integer age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public abstract void printDetails();
	
	public abstract String printSkill();
	
}
