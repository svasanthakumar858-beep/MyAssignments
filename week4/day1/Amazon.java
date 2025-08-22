package week4.day1;

public class Amazon extends CanaraBank {
	
	@Override
	public void internetBanking() {
		// TODO Auto-generated method stub
		super.internetBanking();
		System.out.println("Amazon-Internet Banking");
	}
	@Override
	public void recordPaymentDetails() {
		System.out.println("Amazon -Record Payment Details implemented");

	}

	public static void main(String[] args) {
		Amazon amazon = new Amazon();
		amazon.cashOnDelivery();
		amazon.upiPayments();
		amazon.cardPayments();
		amazon.internetBanking();
		amazon.recordPaymentDetails();
		System.out.println("-------------");
	}
	@Override
	public void CashOnDelivery() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void upipayments() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void cardpayment() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void internetbanking() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void recordpaymentDetails() {
		// TODO Auto-generated method stub
		
	}

}