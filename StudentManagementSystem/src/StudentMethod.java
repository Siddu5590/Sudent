import java.util.LinkedList;

public class StudentMethod implements Student {
	int id;
	String name;
	int age;
	static int genid=1;
	
	static LinkedList<Student> stu= new LinkedList<>();
	public StudentMethod(int id, String name, int age) {

		this.id = genid++;
		this.name = name;
		this.age = age;
	}


	public StudentMethod() {

	}


	@Override
	public String name() {
		
		return this.name;
	}

	@Override
	public int id() {
		
		return this.id;
	}

	@Override
	public int age() {
		
		return this.age;
	}

	@Override
	public void addStudent(String name, int age) {
		
			Student s1=new StudentMethod(id, name, age);
			stu.add(s1);
			System.out.println("Student Added Successfully..\n");
		
	}

	@Override
	public void removeStudent(int id) {
		for(Student s:stu)
		{
			if(s.id()==id)
			{
				stu.remove(s);
				System.out.println("Student  has been deleted....");
				
			}
			else
			{
				System.out.println("Invalid Student I'd");
			}
				
		}
	}

	@Override
	public void displayAllStudent() {
		if(stu.isEmpty())
		{
			System.out.println("No student is added");
			return;
		}
		
		for(Student s:stu)
		{
			System.out.println("======================");
			System.out.println("Student id is : "+s.id());
			System.out.println("Student Name is : "+s.name());
			System.out.println("Student Age is : "+s.age());
			System.out.println("======================");
		}
		
	}

}