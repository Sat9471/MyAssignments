package MethodOverload;

public class students {
	
//Methods: getStudentInfo() by passing id argument alone
   public void getStudentInfo(int id) {
	System.out.println("Student ID: "+id);
}
   
 //Methods: getStudentInfo() method by passing id argument alone
   public void getStudentInfo(int id, String name) {
	   System.out.println("Student ID is '"+id+"' and name of the student is '"+name+"'");
   }
   
 //Methods: getStudentInfo() method by passing arguments for id & name
   //public void getStudentInfo(String email, long phoneNumber) {
	  // System.out.println("Email address '"+email+"' and the phone number of the student '"+phoneNumber+"'.");
   //}
   
 //create object(instance) for the above class method by passing arguments for email & phoneNumber
   public static void main(String[] args) {
	students stu=new students();
	stu.getStudentInfo(17);
	stu.getStudentInfo(17, "Tom");
	//stu.getStudentInfo("gmail.com", 98765432109);
}
}
