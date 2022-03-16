package Business.Abstract;

import Entities.Concrete.Campaign;
import Entities.Concrete.Game;
import Entities.Concrete.Gamer;

public interface ISalesPlatformService {
	void sale(Gamer gamer,Game game,Campaign campaign);

}
