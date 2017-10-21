package corm.kenny.jack.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class InMemoryGameDAO implements GameDAO {

	private Map<String, Game> gameMap = new HashMap<>();
	@Override
	public void save(Game game) {
		gameMap.put(game.id, game);
	}

	@Override
	public Game fetchGame(String id) {
		return gameMap.get(id);
	}

	@Override
	public List<Game> listGames() {
		return new ArrayList<>(gameMap.values());
	}

}
