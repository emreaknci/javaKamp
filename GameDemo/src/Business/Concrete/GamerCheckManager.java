package Business.Concrete;

import Business.Abstract.IGamerCheckService;
import Entities.Concrete.Gamer;

public class GamerCheckManager implements IGamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		return true;
	}

}
