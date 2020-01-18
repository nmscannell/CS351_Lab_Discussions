
public class Principle extends Person
{
	private double salary;
	
	public Principle()
	{
		super();
		this.setSalary(0);
	}
	public Principle(String name, double salary)
	{
		super(name);
		this.setSalary(salary);
	}
	public double getSalary()
	{
		return this.salary;
	}
	private void setSalary(double salary)
	{
		this.salary = salary;
	}
	public String toString()
	{
		return super.toString() + " - $" + this.getSalary();
	}
}
