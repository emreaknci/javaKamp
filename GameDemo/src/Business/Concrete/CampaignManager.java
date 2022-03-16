package Business.Concrete;

import Business.Abstract.ICampaignService;
import Entities.Concrete.Campaign;

public class CampaignManager implements ICampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyasi eklendi!");

	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyasi silindi!");

	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyasi guncellendi!");

	}

	@Override
	public double getGamePriceAfterDiscount(double price, double discount) {
		return price - (price * discount / 100);
	}

}
