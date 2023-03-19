package entities;

public class Room {
	private boolean occupied;
	private String studentName;
	private String studentEmail;
	
	
	public Room() {
	}
	
	public Room(String studentName, String studentEmail) {
		occupied = true;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
	}
	
	public String toString() {
		if (occupied == true) {
			return String.format("Ocupado por %s", studentName);
		} else {
			return String.format("Vago");
		}
		
	}
	
	public boolean isOccupied() {
		return occupied;
	}
	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	
	
	
}
