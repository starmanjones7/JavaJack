package corm.kenny.jack.main;

import java.util.List;

public class CreateGameCommand {

	int boardSize; //number of rows & columns
	int thingsInARow;

	List<String> playerIds;
	
	public int getBoardSize() {
		return boardSize;
	}
	public void setBoardSize(int boardSize) {
		this.boardSize = boardSize;
	}
	public List<String> getPlayerIds() {
		return playerIds;
	}
	public void setPlayerIds(List<String> playerIds) {
		this.playerIds = playerIds;
	}
	
	public int getThingsInARow() {
		return thingsInARow;
	}
	public void setThingsInARow(int thingsInARow) {
		this.thingsInARow = thingsInARow;
	}
}
