package entity;

import model.Type;

import jakarta.persistence.*;
import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Table(name="ticket")
public class SeasonTicket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private Type type;

    @Column(name = "start_date")
    private LocalDateTime startDate;

    @Column(name = "end_date")
    private LocalDateTime endDate;

    @Column(name="class_amount")
    private Integer classAmount;

    @Column(name = "class_balance")
    Integer classBalance;

    @Column(name = "active")
    boolean active;

    @OneToOne(cascade = CascadeType.ALL)
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public SeasonTicket() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public Integer getClassAmount() {
        return classAmount;
    }

    public void setClassAmount(Integer classAmount) {
        this.classAmount = classAmount;
    }

    public Integer getClassBalance() {
        return classBalance;
    }

    public void setClassBalance(Integer classBalance) {
        this.classBalance = classBalance;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "SeasonTicket{" +
                "id=" + id +
                ", type=" + type +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", classAmount=" + classAmount +
                ", classBalance=" + classBalance +
                ", active=" + active +
                '}';
    }
}

