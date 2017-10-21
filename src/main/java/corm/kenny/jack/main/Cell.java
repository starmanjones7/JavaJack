package corm.kenny.jack.main;

public class Cell {
	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public boolean isOccupied() {
		return userId != null;
	}
	
}
