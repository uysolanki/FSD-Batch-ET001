package day15inheritance;

public class InheritanceReturnDemo2 {

	public static void main(String[] args) 
	{
			
		PersianCat result=getPersianCat();   //new return type  i.e new Cat()
		result.eat();
		result.sleep();
		result.run();
	}
	
	static PersianCat getPersianCat()
	{
		return new PersianCat();
	}
}



//Cat result=new Cat();                P p =new P();

//Cat result=new PersianCat();		   P p=new C();    this is known as UPCASTING

//PersianCat result=new PersianCat();  C c=new C();

//PersianCat result= new Cat();        C c = new P();


//C c=new C();  possible   		can son drive his car
//P p=new P();  possible   		can father drive his car
//P p= new C(); possible   		can father drive sons car
//C c=new P();  not possible 	can son drive fathers car