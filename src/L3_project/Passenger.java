package L3_project;
import java.time.LocalDate;

enum Berth{
    UPPER,
    MIDDLE,
    LOWER
}
public class Passenger {

    private int id;

    private String name;

    private Berth prefBerth;

    private Berth allocatedBerth;

    private LocalDate bkdDate = LocalDate.now();

    public Passenger(int id,String name,Berth prefBerth){
        this.id = id;
        this.name=name;
        this.prefBerth=prefBerth;
    }
    @Override
    public String toString() {
        return "Passenger{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", prefBerth=" + prefBerth +
                ", allocatedBerth=" + allocatedBerth +
                ", bkdDate=" + bkdDate +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
