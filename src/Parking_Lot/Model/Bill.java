package Parking_Lot.Model;

import java.util.Date;
import java.util.List;

public class Bill {
    private int id;
    private Ticket ticket;
    private Gate gate;
    private double amount;
    private Date exitTime;
    private Operator operator;
    private List<Payment> payments;
}
