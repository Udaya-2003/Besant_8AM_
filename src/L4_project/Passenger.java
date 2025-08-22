package L4_project;

import java.time.LocalDate;

enum Berth {
    UPPER,
    MIDDLE,
    LOWER
}

public class Passenger {
    private int id;
    private String name;
    private Berth prefBerth;
    private Berth allocatedBerth;
    private LocalDate bkdDate;

    public Passenger(int id, String name, Berth prefBerth, Berth allocatedBerth, LocalDate bkdDate) {
        this.id = id;
        this.name = name;
        this.prefBerth = prefBerth;
        this.allocatedBerth = allocatedBerth;
        this.bkdDate = bkdDate;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public Berth getPrefBerth() { return prefBerth; }
    public Berth getAllocatedBerth() { return allocatedBerth; }
    public LocalDate getBkdDate() { return bkdDate; }
}

