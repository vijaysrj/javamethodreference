package methodreference;

public class Manager {

	String name;

	static boolean promotionToAll;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void processPromotion(Employee employee, CheckPromotionCriteria promotionCriteria) {

		if (promotionCriteria.check(employee)) {

			System.out.println("Promotion granted to :" + employee.getName());

		} else {

			System.out.println("Promotion not granted to :" + employee.getName());
		}

	}

	public boolean isExperiencedJavaProgrammer(Employee e) {

		return e.getSkillSet().contains("Java") && e.getTotalExperience() > 10;
	}

	public Employee createEmployee(String name, String skillSet, int totalExperience, CreateEmployee createEmployee) {

		return createEmployee.create(name, skillSet, totalExperience);
	}

}
