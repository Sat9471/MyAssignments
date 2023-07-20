package week1.day1;

public class Mobile {
	public void makeCall() {
		String mobileModel="Apple iPhone S7";
		float mobileWeight=75.87f;
		System.out.println("Mobile model: "+ mobileModel+"\n"+"Mobile Weight: "+mobileWeight);
	}
 public void sendMsg() {
	 boolean isFullyCharged=true;
	 int mobileCost=149999;
	 System.out.println("Is mobile full charged: "+isFullyCharged+"\n"+"Mobile phone weight: "+mobileCost);
	 
 }
 
 public static void main(String[] args) {
	
Mobile myMob=new Mobile();
 
 myMob.makeCall();
 myMob.sendMsg();
 System.out.println("This is my mobile");
}
}