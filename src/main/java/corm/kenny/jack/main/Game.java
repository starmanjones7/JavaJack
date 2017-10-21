package corm.kenny.jack.main;

import java.util.List;
import java.util.UUID;

public class Game {
	String id;
	Cell[][] board;
	int boardSize; //number of rows & columns
	int thingsInARow;
	String winner; // user ID of the winner. Null if game is in progress
	
	List<String> playerIds;
	
	public Game(CreateGameCommand cmd) {
		id = UUID.randomUUID().toString();
		boardSize = cmd.boardSize;
		playerIds = cmd.playerIds;
		thingsInARow = cmd.thingsInARow;
		board = new Cell[boardSize][boardSize];
		
		for(int i = 0;i<boardSize;i++) {
			for(int k = 0;k<boardSize;k++) {
				board[i][k] = new Cell();
			}
		}
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Cell[][] getBoard() {
		return board;
	}

	public void setBoard(Cell[][] board) {
		this.board = board;
	}

	public int getBoardSize() {
		return boardSize;
	}

	public void setBoardSize(int boardSize) {
		this.boardSize = boardSize;
	}

	public int getThingsInARow() {
		return thingsInARow;
	}

	public void setThingsInARow(int thingsInARow) {
		this.thingsInARow = thingsInARow;
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}

	public List<String> getPlayerIds() {
		return playerIds;
	}

	public void setPlayerIds(List<String> playerIds) {
		this.playerIds = playerIds;
	}
}
