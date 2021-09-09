package Khan1;

public interface Sale {
	public void addDealSubcriber(Purchaser purchaser);
	public void removeDealSubcriber(Purchaser purchaser);
	public void notifyDealSubscribers(String message);
}