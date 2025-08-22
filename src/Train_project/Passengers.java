package Train_project;
import java.time.LocalDate;
enum Berth{
	UPPER,
	MIDDLE,
	LOWER
}

public class Passengers{
	private int pId;
	
	private String name;
	
	private Berth prefBerth;
	
	private Berth allocatedBerth;
	
	private LocalDate bkdDate = LocalDate.now();
    
	public Passengers(int pId, String name, Berth prefBerth){
		this.pId = pId;
		this.name = name;
		this.prefBerth = prefBerth;
	}
	@Override
	public String toString() {
		return "Passenger [pId=" + pId + ", name=" + name + ", prefBerth=" + prefBerth + ", allocatedBerth="
				+ allocatedBerth + ", bkdDate=" + bkdDate + "]";
	}

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

	public Berth getAllocatedBerth() {
		return allocatedBerth;
	}

	public void setAllocatedBerth(Berth allocatedBerth) {
		this.allocatedBerth = allocatedBerth;
	}

	public LocalDate getBkdDate() {
		return bkdDate;
	}

	public void setBkdDate(LocalDate bkdDate) {
		this.bkdDate = bkdDate;
	}
}