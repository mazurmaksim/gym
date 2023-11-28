package entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import model.Type;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("gym");
        EntityManager em = emf.createEntityManager();
        Customer customer = generateTestCustomer();
        em.getTransaction().begin();
        em.persist(customer);
        em.getTransaction().commit();
        System.out.println("Persisted ");
        System.out.println(em.find(Customer.class, customer.getId()).getEmail());
        em.close();
    }

    public static Customer generateTestCustomer() {
        Customer customer = new Customer();
        SeasonTicket ticket = new SeasonTicket();

        ticket.setActive(true);
        ticket.setClassAmount(23);
        ticket.setType(Type.YEARLY);
        ticket.setClassBalance(50);
        ticket.setStartDate(LocalDateTime.now());
        ticket.setEndDate(LocalDateTime.now().plusDays(365));

        customer.setTicket(ticket);
        customer.setAddress("Beverly hills 90210");
        customer.setEmail("hollywood@gmail.com");
        customer.setName("Stiven");
        customer.setPhoneNumber("+12563255");
        customer.setLastName("Hocking");

        return customer;
    }
}
