package app;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 20;
		int numberOfFriends = 120;
		double amountInWallet = 13.41;
		String firstName = "Lisa";
		String middleName = " Nicole";
		String lastName = " Moore";
		double itemPrice = 6.50;
		
		double newAmountOfMoney = amountInWallet - itemPrice;
		int friendsEachYear = numberOfFriends / age;
		String fullname = firstName + middleName + lastName;
		
		
		System.out.println("There is " +newAmountOfMoney + " left in my wallet");
		System.out.println("I make an average of " +  friendsEachYear + " friends every year");
		System.out.println("My name is "+ fullname);
	}

}
