package by.jonline.modul05.exercise02;

public class TestDrivePayment {

	public static void main(String[] args) {
		Product one = new Product("Chair",115.25);
		Product two = new Product("Chair",115.25);
		Product three = new Product("Chair",115.25);
		Product four = new Product("Chair",115.25);
		Product five = new Product("Chair",115.25);
		
		Payment myPayment = new Payment(one,four,two,three,five);
		System.out.println(myPayment);
	}

}
