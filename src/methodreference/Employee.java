package methodreference;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Employee {

	String name;

	private int experienceInCompany;

	private String skillSet;

	private int totalExperience;

	private int rating;

	

	public Employee(String name, int experienceInCompany, String skillSet, int totalExperience, int rating) {

		this.name = name;
		this.experienceInCompany = experienceInCompany;
		this.skillSet = skillSet;
		this.totalExperience = totalExperience;
		this.rating = rating;
	}

	public Employee(String name, String skillSet, int totalExperience) {

		this.name = name;
		this.skillSet = skillSet;
		this.totalExperience = totalExperience;
	}

	public Employee() {
	}

	public boolean isExperiencedJavaProgrammer() {

		return this.skillSet.contains("Java") && this.totalExperience > 10;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}

	public int getExperienceInCompany() {
		return experienceInCompany;
	}

	public void setExperienceInCompany(int experienceInCompany) {
		this.experienceInCompany = experienceInCompany;
	}

	public int getTotalExperience() {
		return totalExperience;
	}

	public void setTotalExperience(int totalExperience) {
		this.totalExperience = totalExperience;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", experienceInCompany=" + experienceInCompany + ", skillSet=" + skillSet
				+ ", totalExperience=" + totalExperience + ", rating=" + rating + "]";
	}
	
	

}
