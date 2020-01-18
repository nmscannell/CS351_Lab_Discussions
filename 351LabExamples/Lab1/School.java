import java.util.ArrayList;

import junit.framework.TestCase;

public class School
{
	private String name;
	private Principle principle;
	private ArrayList<Student> students;

	/**
	 * Default constructor sets school name, principle name to empty string and principle's salary to 0.
	 */
	public School()
	{
		this("", "", 0.0);
	}

	/**
	 * Constructor sets school name, principle name, and principle salary.
	 * Salary must be non-negative. Creates list of students.
	 * @param sName School's name
	 * @param pName Principle's name
	 * @param salary Principle's salary
	 * @throws IllegalArgumentException if salary is negative.
	 */
	public School(String sName, String pName, double salary)
	{
		if(salary < 0) throw new IllegalArgumentException("Salary cannot be negative");
		this.setName(sName);
		this.principle = new Principle(null, salary);
	}

	/**
	 * Sets school's name
	 * @param name school's name
	 */
	private void setName(String name)
	{
		this.name = name;
	}

	/**
	 * Returns school's name
	 * @return name
	 */
	public String getName()
	{
		return this.name;
	}

	/**
	 * Adds a student to the school
	 * @param student to be added to school. Must not be null.
	 */
	public void addStudent(Student student)
	{
		if(student == null) throw new IllegalArgumentException("Cannot add a null student");
		this.students.add(student);
	}

	/**
	 * Displays school's information and list of students.
	 */
	public void schoolAudit()
	{
		System.out.println("School\'s Name: " + this.getName());
		System.out.println("\tPrinciple\'s Name: " + this.principle.toString());
		for ( Student student : students )
			System.out.println("\t\t" + student.toString());
	}
	
	public static class TestSchool extends TestCase {

		private School s;
		private School hogwarts;
		
		public void test00() {
			s = new School();
			assertEquals("", s.name);
			assertEquals("", s.principle.getName());
			assertEquals(0.0, s.principle.getSalary());
			assertEquals(0, s.students.size());
		}
		
		public void test01() {
			hogwarts = new School("Hogwarts", "Dumbledore", 200000);
			assertEquals("Hogwarts", hogwarts.name);
			assertEquals("Dumbledore", hogwarts.principle.getName());
			assertEquals(200000.0, hogwarts.principle.getSalary());
		}
		
		public void test02() {
			hogwarts = new School("Hogwarts", "Dumbledore", 200000);
			hogwarts.students.add(new Student("Hermione", 4.0));
			assertEquals(1, hogwarts.students.size());
		}
	}
}
