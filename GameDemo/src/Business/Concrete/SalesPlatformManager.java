package Business.Concrete;

import Entities.Concrete.Campaign;
import Entities.Concrete.Game;
import Business.Abstract.ISalesPlatformService;
import Entities.Concrete.Gamer;

public class SalesPlatformManager implements ISalesPlatformService {

	@Override
	public void sale(Gamer gamer, Game game, Campaign campaign) {
		System.out.println("\n\n-----FATURA BILGILERI-----\n\nKullanici Adi: " + gamer.getUserName() + "\nOyun Adi: "
				+ game.getGameName() + "\nNormal Fiyat: " + game.getGamePrice() + "\nIndirimli Fiyat: "
				+ campaign.getGamePriceAfterDiscount(game.getGamePrice(), campaign.getDiscount()));
	}

}
