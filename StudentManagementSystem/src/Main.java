import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 LinkedList<Student> student = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		Student s1 = new StudentMethod();
		
		System.out.println("=========WELCOME TO STUDENT MANAGAMENT SYSTEM==============");
		while(true)
		{
			System.out.println("Press 1:to Add Student");
			System.out.println("Press 2:to Delete Student");
			System.out.println("Press 3:to View All Student");
			System.out.println("Press 4:to Exit\n");
			
			System.out.println("Enter Your Choice");
			int n=sc.nextInt();
			
			switch(n)
			{
			case 1:
			{
				
				System.out.println("Enter Student Name ");
				String name=sc.next();
				System.out.println("Enter Student age ");
				int age=sc.nextInt();
				s1.addStudent(name, age);
				break;
			}
			case 2:
			{
				if(StudentMethod.stu.isEmpty())
				{
					System.out.println("No student present in the database");
					break;
					
				}
				System.out.println("Enter Student id");
				int id=sc.nextInt();
				s1.removeStudent(id);
				break;
				
			}
			case 3:
			{
				s1.displayAllStudent();
				break;
			}
			case 4:
				System.out.println("Thank you visit again....");
				System.exit(0);
				break;
				
				default :
					System.out.println("invalid input");
			}
		}
	}
}
