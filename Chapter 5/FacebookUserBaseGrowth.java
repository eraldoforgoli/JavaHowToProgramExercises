/*

5.33 (Facebook User Base Growth) According to CNNMoney.com, Facebook hit one billion users
in October 2012. Using the compound-growth technique you learned in Fig. 5.6 and assuming
its user base grows at a rate of 4% per month, how many months will it take for Facebook to grow
its user base to 1.5 billion users? How many months will it take for Facebook to grow its user base
to two billion users?


*/

public class FacebookUserBaseGrowth {
	public static void main(String[] args) {

		double rate = 0.04;
		double principal = 1000000000; // initial amount before growth rate
		double amount = 1000000000; // //amount of users at the begining of each year
		int year = 1;

		while (amount <= 2000000000) {

			amount = principal * Math.pow(1.0 + rate, year);

			System.out.println("Year : " + year + ", Users : " + amount); // printojme rritjen vjetore
			year++; // numeroj sasise e viteve deri ne rritjen e percaktuar ne kusht

		}

		System.out.printf("%nFacebook will reach 2 billion users in %d months", year * 12); // shumezojme numrin e
																							// viteve me 12, qe jep
																							// numrin e muajve

	}

}
