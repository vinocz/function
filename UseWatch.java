package function;

public class UseWatch {
	public static void main(String[]args) {
	Watch watch1=new Watch();
	watch1.price=500;
	watch1.colour="black";
	watch1.brand="casio";
	watch1.taxAmount=50;
	
	Watch watch2=new Watch();
	watch2.price=600;
	watch2.colour="blue";
	watch2.brand="g shock";
	watch2.taxAmount=60;
	
	Watch watch3= new Watch();
	watch3.price=700;
	watch3.colour="green";
	watch3.brand="titan";
	watch2.taxAmount=90;
	
	if(watch1.price>watch2.price) {
		System.out.println(watch1.brand);
	}
	else {
		System.out.println(watch2.brand);
	}
	if(watch1.price>watch2.price&&watch1.price>watch3.price) {
		System.out.println(watch1.brand+watch1.price+watch1.taxAmount);
	}
	else if (watch2.price>watch3.price&&watch2.price>watch1.price) {
		System.out.println(watch2.brand);
	}
	else {
		System.out.println(watch3.price);
		
	}
		
	}
	
	
	

}
