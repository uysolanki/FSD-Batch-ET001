package day14constructor;

public class ShallowCopyDemo {

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=s1;		//shallow copy  2/multiple refs pointing to the same object
						    //if any 1 ref changes the values it will reflect for all the other refs also
							// LED boards,  daily 20 mins  100 LCD
		System.out.println(s1.getSname());  //UK
		s2.setSname("Tom");
		System.out.println(s1.getSname());  //Tom

	}

}
