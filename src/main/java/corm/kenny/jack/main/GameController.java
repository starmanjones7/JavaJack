package corm.kenny.jack.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/games")
@Controller
public class GameController {
	
	@Autowired
	private GameDAO gameDao;
	
	@Autowired
	private UserDAO userDAO;
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	@ResponseBody
	public Game createGame(@RequestBody CreateGameCommand createGame) {
		Game g = new Game(createGame);
		for(String userId : createGame.playerIds) {
			// load the user
			User user = userDAO.getUser(userId);
			if(null == user) {
				throw new RuntimeException("No user exists with ID " + userId);
			}
		}
		gameDao.save(g);
		return g;
	}
	
	@RequestMapping(value = "/{gameId}", method = RequestMethod.GET)
	@ResponseBody
	public Game fetchGame(@PathVariable("gameId") String id) {
		return gameDao.fetchGame(id);
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	@ResponseBody
	public List<Game> listGames() {
		return gameDao.listGames();
	}
	
	@RequestMapping(value = "/{gameId}/takeTurn/row/{row}/col/{col}/player/{userId}", method = RequestMethod.GET)
	@ResponseBody
	public Game takeTurn(@PathVariable("userId") String userId,
			@PathVariable("gameId") String gameId, 
			@PathVariable("row") int row, 
			@PathVariable("col") int col) {
		// load the game
		Game g = gameDao.fetchGame(gameId);
		
		// do some logic
		// save the game
		gameDao.save(g);
		return g;
	}
}
