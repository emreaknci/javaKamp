package Business.Concrete;

import Business.Abstract.IGamerCheckService;
import Business.Abstract.IGamerService;
import Entities.Concrete.Gamer;

public class GamerManager implements IGamerService {
	private IGamerCheckService gamerCheckService;

	public GamerManager(IGamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		if (gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getUserName()+" kullanicisi eklendi!");
		}
		else
			System.out.println("Kullanici bilgileri dogrulanamadi!");
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getUserName()+" kullanicisi siilindi!");

	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getUserName()+" kullanicisi guncellendi!");

	}

}
