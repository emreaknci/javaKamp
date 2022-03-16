import Business.Abstract.IGamerCheckService;
import Business.Concrete.CampaignManager;
import Business.Concrete.GameManager;
import Business.Concrete.GamerManager;
import Business.Concrete.SalesPlatformManager;
import Entities.Concrete.Game;
import Entities.Concrete.Gamer;
import Entities.Concrete.Campaign;

public class Main {

	public static void main(String[] args) {
		Game game1 = new Game(1, "GTA V", 99);
		Game game2 = new Game(2, "FIFA 22", 449);
		GameManager gameManager=new  GameManager();
		gameManager.add(game1);
		gameManager.add(game2);
		
		Campaign campaign=new Campaign(1, "Sepette Ekstra %10 ", 10);
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.add(campaign);
			
		
		Gamer gamer=new Gamer(1, "emreaknci", "12345678910", "Emre", "Akinci", 2002);
		GamerManager gamerManager=new GamerManager(new IGamerCheckService() {
			@Override
			public boolean checkIfRealPerson(Gamer gamer) {
				return true;
			}
		});
		gamerManager.add(gamer);
		
		SalesPlatformManager saleManager=new SalesPlatformManager();
		saleManager.sale(gamer, game2, campaign);
		
	}

}
