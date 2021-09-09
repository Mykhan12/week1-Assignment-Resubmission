package Khan1;

import java.util.ArrayList;
import java.util.List;

public class Boss implements Sale {
	private String bossName;
	private String deal;
	List<Purchaser> purchasers = new ArrayList<>();
	
	
	public Boss(String bossName, String deal) {
		super();
		this.bossName = bossName;
		this.deal = deal;
	}
	
	public String getbossName() {
		return bossName;
	}
	public void setbossName(String bossName) {
		this.bossName = bossName;
	}
	public String getDeal() {
		return deal;
	}
	public void setDeal(String deal) {
		this.deal = deal;
	}
	
	public synchronized void addDealSubcriber(Purchaser purchaser) {
		purchasers.add(purchaser);
	}
	
	public synchronized void removeDealSubcriber(Purchaser purchaser) {
		purchasers.remove(purchaser);
	}
	
	
	public void notifyDealSubscribers(String message) {
		System.out.println("Professor Posted Message:: "+message+"\n");
		purchasers.forEach(customer->customer.notification(customer.getPurchaserName(), this.bossName, this.deal, message));
	}
	
}