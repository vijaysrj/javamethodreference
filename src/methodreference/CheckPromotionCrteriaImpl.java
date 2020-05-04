package methodreference;

public class CheckPromotionCrteriaImpl implements CheckPromotionCriteria {

	@Override
	public boolean check(Employee e) {

		return e.getSkillSet().contains("Java") && e.getTotalExperience() > 10;
	}

}
