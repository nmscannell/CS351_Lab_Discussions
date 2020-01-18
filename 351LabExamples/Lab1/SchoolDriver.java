
public class SchoolDriver 
{
	public static void main(String[] args)
	{
		School gd = new School("Global Dynamics", "Allison Blake", 95000); 
		//Global Dynamics is a research facility that is home to the greatest minds in science in SyFy's Eureka
		Student jack = new Student("Jack Carter", 2.5); //town sheriff and "average joe"
		Student nathan = new Student("Nathan Stark", 4.0); //super genius
		Student henry = new Student("Henry Deacon", 4.0); //very cool
		Student fargo = new Student("Douglas Fargo", 3.7);
		
		gd.addStudent(jack);
		gd.addStudent(nathan);
		gd.addStudent(henry);
		gd.addStudent(fargo);
		gd.schoolAudit();
		System.out.println();
		System.out.println();
		
		School warehouse = new School("Warehouse 13", "Artie Nielsen", 70000);
		//Warehouse 13 is a super secret government facility that houses strange artifacts imbued with special "powers"
		//also a SyFy show
		Student claudia = new Student("Claudia Donovan", 6.0);
		Student pete = new Student("Pete Lattimer", 3.3);
		Student myka = new Student("Myka Bering", 4.0);
		
		warehouse.addStudent(claudia);
		warehouse.addStudent(pete);
		warehouse.addStudent(myka);
		warehouse.addStudent(fargo); //there are crossover episodes of Warehouse 13 that Fargo from Eureka makes an appearance in
		warehouse.schoolAudit();
		System.out.print("\nInvalid GPA! Donovan!!!");
	}
}
