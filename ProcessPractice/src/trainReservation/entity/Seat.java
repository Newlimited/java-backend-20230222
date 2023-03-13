package trainReservation.entity;

public class Seat {
	private int roomNumber;
	private String seatNumber;
	private boolean seatstatus;
	
	public Seat() {}

	public Seat(int roomNumber, String seatNumber, boolean seatstatus) {
		this.roomNumber = roomNumber;
		this.seatNumber = seatNumber;
		this.seatstatus = seatstatus;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public boolean isSeatstatus() {
		return seatstatus;
	}

	@Override
	public String toString() {
		return "Seat [roomNumber=" + roomNumber + 
				", seatNumber=" + seatNumber + 
				", seatstatus=" + seatstatus + "]";
	}
	

}
