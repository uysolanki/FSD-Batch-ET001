package day12arrayofobjects;

import day11oops.Mobile;

public class DriverApp {

	public static void main(String[] args) {
		Mobile m1=new Mobile(103,"Apple","Ipone16 Pro Max",135000.0);  //1000
		
		Mobile m2=new Mobile(101, "Samsung", "S24 Ultra", 175000.0);    //2000
		
		Mobile m3=new Mobile(102, "One Plus", "12 pro", 55000.0);      //3000
		
		Mobile m100=new Mobile(104, "Oppo", "Abc", 5500.0);
		
		System.out.println("Top 4 Mobile Manufcaturers in India");
		System.out.println(m1.mfgName);
		System.out.println(m2.mfgName);
		System.out.println(m3.mfgName);
		System.out.println(m100.mfgName);
		
		if(m1.price>m2.price  && m1.price>m3.price && m1.price>m100.price)
		{
			System.out.println(m1.price);
		}
		else if(m2.price>m1.price  && m2.price>m3.price && m2.price>m100.price)
		{
			System.out.println(m2.price);
		}
		else if(m3.price>m1.price  && m3.price>m2.price && m3.price>m100.price)
		{
			System.out.println(m3.price);
		}
		else
		{
			System.out.println(m100.price);
		}
		
		Mobile mobiles[]=new Mobile[4];
		mobiles[0]=new Mobile(103,"Apple","Ipone16 Pro Max",135000.0);  //1000
		mobiles[1]=new Mobile(101, "Samsung", "S24 Ultra", 175000.0);    //1034
		mobiles[2]=new Mobile(102, "One Plus", "12 pro", 55000.0);		//1068
		mobiles[3]=new Mobile(104, "Oppo", "Abc", 5000.0);		     //1068

		
		System.out.println("Top 4 Mobile Manufcaturers in India");
		for (int i = 0; i < mobiles.length; i++) 
			System.out.println(mobiles[i].mfgName);
		
		//display the price of the costliest phone
		double max=0;
		for (int i = 0; i < mobiles.length; i++) 
		{
			if(mobiles[i].price>max)
			{
				max=mobiles[i].price;
				
			}
		}
		System.out.println("The costliest phone in store is " +max);
		
		//display the model name of the costliest phone
		double max1=0;
		String modelName="";
		for (int i = 0; i < mobiles.length; i++) 
		{
			if(mobiles[i].price>max1)
			{
				max1=mobiles[i].price;
				modelName=mobiles[i].modelName;
			}
		}
		System.out.println("The costliest model in store is " +modelName);
		
		
		//display the company name of the costliest phone
				double max2=0;
				String companyName="";
				for (int i = 0; i < mobiles.length; i++) 
				{
					if(mobiles[i].price>max2)
					{
						max2=mobiles[i].price;
						companyName=mobiles[i].mfgName;
					}
				}
				System.out.println("The Company name of the costliest mobile in store is " +companyName);
	
	
				//display the company name,nodel name, price of the costliest phone
				double max3=0;
				Mobile maxMobile=null;
				for (int i = 0; i < mobiles.length; i++) 
				{
					if(mobiles[i].price>max3)
					{
						max3=mobiles[i].price;
						maxMobile=mobiles[i];
					}
				}
				System.out.println("The Company name of the costliest mobile in store is " +maxMobile.mfgName);
				System.out.println("The costliest model in store is " +maxMobile.modelName);
				System.out.println("The price of the costliest Mobile in store is " +maxMobile.price);
	
	}

}
