package methodreference;

public class Client {

	public static void main(String a[]) {

		Employee employee = new Employee();
		employee.setName("Kumar");
		employee.setExperienceInCompany(4);
		employee.setSkillSet("Java, Spring, AWS");
		employee.setTotalExperience(11);
		employee.setRating(4);

		Manager manager = new Manager();

		manager.processPromotion(employee, e -> e.isExperiencedJavaProgrammer());

		CheckPromotionCriteria checkCriteria = new CheckPromotionCrteriaImpl();

		// the regular way using a seperate class for valiation.
		manager.processPromotion(employee, checkCriteria);

		// using lamda
		manager.processPromotion(employee, e -> e.getSkillSet().contains("Java") && e.getTotalExperience() > 10);

		// using method reference - static method + class reference
		manager.processPromotion(employee, Client::checkEmployeeEligibility);

		
		//using method reference - non static method + object reference
		manager.processPromotion(employee, manager::isExperiencedJavaProgrammer);

		//using method reference - non static method + class reference 
		manager.processPromotion(employee, Employee::isExperiencedJavaProgrammer);
		
		
		//constructor reference
		Employee employeeNew = manager.createEmployee("Roy","Java, Angular", 8, Employee::new);
		
		System.out.println(employeeNew);

	}

	public static boolean checkEmployeeEligibility(Employee e) {

		return e.getSkillSet().contains("Java") && e.getTotalExperience() > 10;
	}

}
