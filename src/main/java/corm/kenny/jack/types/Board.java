package corm.kenny.jack.types;

import java.util.ArrayList;
import java.util.List;

import corm.kenny.jack.dao.InvalidMoveException;

public class Board {
	// ID of the board
	private String id;
	// the name of the board 
	private String name;
	
	// The size of the board (squared)
	private int boardSize;
	// Player ID of the player that won this game (null if game is in progress)
	private String winner;
	// Player ID of the player whose turn it is
	private String currentTurn;

	private List<String> playerIds = new ArrayList<>();
	private List<List<Cell>> gameCells;

	
	public void takeTurn(int row, int col, String playerId) {
		if(!currentTurn.equals(playerId)) {
			throw new InvalidMoveException("It is not " + playerId + "'s turn!");
		}
		if(row < 0 || col < 0 || row >= boardSize || col >= boardSize) {
			throw new InvalidMoveException("Move outside of board bounds");
		}
		Cell cell = gameCells.get(row).get(col);
		if(cell.getOwner() != null) {
			throw new InvalidMoveException("Cell is already occupied");
		}
		cell.setOwner(playerId);
		currentTurn = playerIds.stream().filter(s -> !s.equals(playerId)).findFirst().get();
		checkForWin();
	}
	
	/**
	 * Checks to see if the game is now in a 'win' state, and populates the winner field if it is.
	 */
	private void checkForWin() {
		
	}

	
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

	public List<List<Cell>> getGameCells() {
		return gameCells;
	}

	public void setGameCells(List<List<Cell>> gameCells) {
		this.gameCells = gameCells;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCurrentTurn() {
		return currentTurn;
	}

	public void setCurrentTurn(String currentTurn) {
		this.currentTurn = currentTurn;
	}
}
