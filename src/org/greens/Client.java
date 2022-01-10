package org.greens;

public class Client {


private void empDetails(String name , int id, long phoneno) {
	System.out.println("count method"+name+"\n"+id);
	System.out.println(phoneno);
}
private void empdetails(float empsalary) {
	System.out.println("float method"+empsalary);
}
private void empDetails(String city,int pincode) {
	System.out.println("order method"+city+"\t"+pincode);
}
private void empDetails(int pincode,String city) {
	System.out.println("order method"+pincode+"\t"+city);
}
public static void main(String[] args) {
	Client c = new Client();
	
	c.empDetails("ganesh", 456745, 9761255869l);
	c.empdetails(32.12455f);
	c.empDetails("chenni", 607803);
	c.empDetails(456789, "covai");
}
}

