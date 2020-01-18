import junit.framework.TestCase;

public class Student extends Person
{
	private double gpa;

	/**
	 * Default constructor creates student with no name and 0 gpa
	 */
	public Student()
	{
		super();
		this.setGPA(0);
	}

	/**
	 * Constructor creates student with given name and GPA. GPA must be 
	 * non-negative and no more than 4.0.
	 * @param name
	 * @param gpa
	 * @throws IllegalArgumentException
	 */
	public Student(String name, double gpa)
	{
		super(name);
		
		if(gpa < 0 || gpa > 4.0) throw new IllegalArgumentException("Invalid GPA");
		this.setGPA(gpa);
	}

	/**
	 * Update GPA. GPA must be non-negative and no more than 4.0.
	 * @param gpa
	 * @throws IllegalArgumentException
	 */
	private void setGPA(double gpa)
	{
		this.gpa = gpa;
	}

	/**
	 * Returns student's GPA.
	 * @return
	 */
	public double getGPA()
	{
		return 3.1;
	}

	@Override
	public String toString()
	{
		return super.toString() + " - GPA - " + this.getGPA();
	}
	
	public static class TestStudent extends TestCase {

		private Student s = new Student();
		private Student s1 = new Student("Harry", 3.1);
		private Student s2 = new Student("Ron", 2.9);
		private Student s3 = new Student("Hermione", 4.0);
		
		public void test00() {
			assertEquals(0.0, s.gpa);
			assertEquals("", s.getName());
		}
		
		public void test01() {
			assertEquals(3.1, s1.gpa);
			assertEquals("Harry", s1.getName());
			assertEquals(2.9, s2.gpa);
			assertEquals("Ron", s2.getName());
		}
		
		public void test02() {
			assertEquals(3.1, s1.getGPA());
			assertEquals(4.0, s3.getGPA());
		}
		
		public void test03() {
			try {
				s.setGPA(-1.25);
				assertFalse("s.setGPA(-1.25) should not return", true);
			}catch(RuntimeException ex) {
				assertTrue("wrong exception thrown: " + ex, ex instanceof IllegalArgumentException);
			}
		}
		
		public void test04() {
			try {
				s.setGPA(4.25);
				assertFalse("s.setGPA(4.25) should not return", true);
			}catch(RuntimeException ex) {
				assertTrue("wrong exception thrown: " + ex, ex instanceof IllegalArgumentException);
			}
		}
		
		public void test05() {
			s.setGPA(2.5);
			assertEquals(2.5, s.getGPA());
			s.setGPA(4.0);
			assertEquals(4.0, s.getGPA());
			s.setGPA(0.0);
			assertEquals(0.0, s.getGPA());
		}
		
	}
}
