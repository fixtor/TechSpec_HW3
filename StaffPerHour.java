public class StaffPerHour extends Staff implements Comparable<Staff>{

	private final double countSalaryPerMonth = 20.8 * 8;
	public StaffPerHour(int id, String name, int age, double salaryPerMonth, double salaryPerHour) {
		super(id, name, age, salaryPerMonth, salaryPerHour);
	}

	@Override
	public int getId() {
		return this.id;
	}

	@Override
	public double getSalaryPerMonth() {
		return countSalaryPerMonth * salaryPerHour;
	}



	@Override
	public String toString() {
		return  "id " + id +
				", name '" + name + '\'' +
				", age " + age +
				", salary Per Month " + getSalaryPerMonth();
	}

	@Override
	public int compareTo(Staff otherStaff) {
		return Integer.compare(this.getId(), otherStaff.getId());
	}

}

