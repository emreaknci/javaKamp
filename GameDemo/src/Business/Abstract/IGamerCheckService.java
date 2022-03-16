package Business.Abstract;

import Entities.Concrete.Gamer;

public interface IGamerCheckService {
	boolean checkIfRealPerson(Gamer gamer);
}
