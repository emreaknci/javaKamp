package Business.Abstract;

import Entities.Concrete.Game;

public interface IGameService {
	void add(Game game);
	void delete(Game game);
	void update(Game game);
}
