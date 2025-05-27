package day18abstraction;

public class AbstractionDriver {

	public static void main(String[] args) {
//		Husband t1=new Tom();			//Ref is of Husband       Object is of Tom
//		t1.accomodation();
//		t1.clothing();
//		t1.fooding();
//		t1.travel();
//		t1.healthCare();
		
		//Harry h1=new Harry();
		NewHarry h1=new NewHarry();
		h1.accomodation();
		h1.clothing();
		h1.fooding();
		h1.travel();
		h1.healthCare();
		
		
		Harry h2=new NewHarry();
		h2.accomodation();
		h2.clothing();
		h2.fooding();
		h2.travel();
		h2.healthCare();
		
		Husband h3=new NewHarry();
		h3.accomodation();
		h3.clothing();
		h3.fooding();
		h3.travel();
		h3.healthCare();

	}

}
/*
Data : Ref
Method : Object*/