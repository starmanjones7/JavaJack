package corm.kenny.jack.dao;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Component;

import corm.kenny.jack.types.Board;

@Component
public class InMemoryGameDao implements GameDao {
	private Map<String, Board> boards = new ConcurrentHashMap<>();
	@Override
	public Board getBoard(String boardId) {
		return boards.get(boardId);
	}

	@Override
	public void saveBoard(Board board) {
		if(board.getId() == null) {
			throw new InvalidBoardException();
		}
		boards.put(board.getId(), board);
	}

}
