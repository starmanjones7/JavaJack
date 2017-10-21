package corm.kenny.jack.main;

import java.util.List;

public interface GameDAO {

	void save(Game game);

	Game fetchGame(String id);

	List<Game> listGames();

}
