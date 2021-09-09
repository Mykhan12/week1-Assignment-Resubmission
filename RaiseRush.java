package Khan1;

public class RaiseRush{
	public static void main(String[] args) {
		Boss boss = new Boss("Yahiya", "New Deal");
		
		Purchaser purchaser1 =new Purchaser("Ashani");
		Purchaser purchaser2 =new Purchaser("Haseeb");
		Purchaser purchaser3 =new Purchaser("Sohu");
		Purchaser purchaser4 =new Purchaser("Moid");
		boss.addDealSubcriber(purchaser1);
		boss.addDealSubcriber(purchaser2);
		boss.addDealSubcriber(purchaser3);
		boss.addDealSubcriber(purchaser4);
		
		boss.notifyDealSubscribers("heyy!! you now have a new may day deal. here you goo...");
	}
}