package corm.kenny.jack.types;

import java.util.List;

public class CreateBoard {
	List<String> players;
	int boardSize;

	public int getBoardSize() {
		return boardSize;
	}

	public void setBoardSize(int boardSize) {
		this.boardSize = boardSize;
	}

	public List<String> getPlayers() {
		return players;
	}

	public void setPlayers(List<String> players) {
		this.players = players;
	}
	
}
