package day14constructor;

public class Student {

	private int rno;
	private String sname;
	private double per;
	
	public void displayPerson()
	{
		System.out.println("Student roll number is "+this.rno);
		System.out.println("Student Student Name is "+this.sname);
		System.out.println("Student Percentage is "+this.per);
	}

	public Student()   //NoArgsConstructor
	{
		this.rno=1;
		this.sname="Unknown";
		this.per=40.0;
	}
	
	public Student(int a, String b)   
	{
		this.rno=a;
		this.sname=b;
	}
	
	public Student(int a, String b, double c)   //AllArgsConstructor
	{
		this.rno=a;
		this.sname=b;
		this.per=c;
	}
	
	public Student(String b, int a, double c)   //AllArgsConstructor
	{
		this.rno=a;
		this.sname=b;
		this.per=c;
	}
	
	public Student(Student stud)   //AllArgsConstructor
	{
		this.rno=stud.rno;
		this.sname=stud.sname;
		this.per=stud.per;
	}
	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public double getPer() {
		return per;
	}

	public void setPer(double per) {
		this.per = per;
	}
	
	
}
