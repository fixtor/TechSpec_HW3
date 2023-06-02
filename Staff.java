public abstract class Staff implements Comparable<Staff>{

	protected int id;
	protected String name;
	protected int age;
	protected double salaryPerHour;
	protected double salaryPerMonth;

	public Staff(int id, String name, int age, double salaryPerMonth, double salaryPerHour) {
		this.id = id;
		this.name = name;
		this.age = age;
		if (salaryPerHour > 0) {
            this.salaryPerHour = salaryPerHour;
            this.salaryPerMonth = 0;
        }
		else {
            this.salaryPerHour = 0;
            this.salaryPerMonth = salaryPerMonth;
        }
	}

	public abstract int getId();
	public abstract double getSalaryPerMonth();


}
