package Business.Abstract;

import Entities.Concrete.Campaign;

public interface ICampaignService {
	public void add(Campaign campaign);
	public void delete(Campaign campaign);
	public void update(Campaign campaign);
	public double getGamePriceAfterDiscount(double price,double discount);
}
