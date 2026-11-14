package oops;

public class Student_management {
    String name;
    int rollNo;
    int mark;
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Mark: " + mark);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student_management s1 = new Student_management();
        s1.name = "Arun";
        s1.rollNo = 101;
        s1.mark = 85;
        Student_management s2 = new Student_management();
        s2.name = "Priya";
        s2.rollNo = 102;
        s2.mark = 90;
        System.out.println("Student 1 Details:");
        s1.display();
        System.out.println("\nStudent 2 Details:");
        s2.display();
	}

}
