package corm.kenny.jack.dao;

import corm.kenny.jack.types.Board;

public interface GameDao {
	public Board getBoard(String boardId);
	public void saveBoard(Board board);
}
