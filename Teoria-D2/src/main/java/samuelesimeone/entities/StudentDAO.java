package samuelesimeone.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class StudentDAO {
    private final EntityManager em;

    public StudentDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Student x){
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();

        em.persist(x);
        transaction.commit();
        System.out.println("Nuovo studente salvato");
    };

    public Student findById(long id){
        Student foud = em.find(Student.class, id);
        return foud;
    };

    public void deleteById(long id){
        Student found = em.find(Student.class, id);

        if (found != null) {
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();
            System.out.println("Utente rimosso " + found);
            em.remove(found);
            transaction.commit();
        }else{
            System.out.println("Studente non trovato");
        }
    };
}
