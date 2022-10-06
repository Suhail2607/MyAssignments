package week.ass1;

public class Mobile {
	
	public void makecall(String model,float weight)
	{
		System.out.println("the mobile model is=" +model);
		System.out.println("this mobile weight is+=" +weight);
	}
     public void sendmesg(int cost, boolean fullycharged)
     {
      System.out.println("the mobile cost is=" +cost);
      System.out.println("the mobile charge is=" +fullycharged);
    	 
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile v = new Mobile();
		v.makecall("samsung", 1250);
		System.out.println("this my new mobile");
	}

}
