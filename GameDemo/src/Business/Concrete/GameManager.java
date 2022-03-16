package Business.Concrete;

import Business.Abstract.IGameService;
import Entities.Concrete.Game;

public class GameManager implements IGameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + " oyunu eklendi!");

	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() + " oyunu silindi!");

	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() + " oyunu guncellendi!");

	}

}
