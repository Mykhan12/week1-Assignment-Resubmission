package Khan1;
public class Purchaser implements Raise{

	private String purchaserName;
	

	public Purchaser(String purchaserName) {
		super();
		this.purchaserName = purchaserName;
	}

	public String getPurchaserName() {
		return purchaserName;
	}

	public void setPurchaserName(String purchaserName) {
		this.purchaserName = purchaserName;
	}

	
	public void notification(String purchaserName, String owner, String deal, String message) {
		System.out.println("Purchaser Name:: "+purchaserName);
		System.out.println("Owner Name:: "+owner);
		System.out.println("Course:: "+deal);
		System.out.println("Message:: "+message+"\n");
    }}
