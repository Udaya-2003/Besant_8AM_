package L3_project;

import java.time.LocalDateTime;

enum Berth{
	UPPER,
	MIDDLE,
	LOWER
}

public class Passenger {
	int pId;
	String name;
	Berth prefBerth;
	Berth allocateBerth;
	LocalDateTime bookedTime;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Berth getPrefBerth() {
		return prefBerth;
	}
	public void setPrefBerth(Berth prefBerth) {
		this.prefBerth = prefBerth;
	}
	public Berth getAllocateBerth() {
		return allocateBerth;
	}
	public void setAllocateBerth(Berth allocateBerth) {
		this.allocateBerth = allocateBerth;
	}
	public LocalDateTime getBookedTime() {
		return bookedTime;
	}
	public void setBookedTime(LocalDateTime bookedTime) {
		this.bookedTime = bookedTime;
	}

}
