public class StaffPerMonth extends Staff{ //Единица с зарплатой в месяц
	public StaffPerMonth(int id, String name, int age, double salaryPerMonth, double salaryPerHour) {
		super(id, name, age, salaryPerMonth, salaryPerHour); //При условии, что почасовая оплата
	}

	@Override
	public int getId() {
		return this.id;
	}

	@Override
	public double getSalaryPerMonth() {
		return salaryPerMonth;
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
