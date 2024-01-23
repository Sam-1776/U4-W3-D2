package samuelesimeone;

import samuelesimeone.eventi.EventoDAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;

public class Application {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestione_eventi");

    public static void main(String[] args) {

        EntityManager em = emf.createEntityManager();

        try{
            EventoDAO sd = new EventoDAO(em);
            System.out.println("Esercizio-D2");
            LocalDate data = LocalDate.parse("2024-01-24");
            LocalDate data1 = LocalDate.parse("2024-08-23");
//            Evento festa = new Evento("festa natale", data,"festa evento beneficenza", 200);
//            Evento festa1 = new Evento("festa compleanno", data1,"festa evento compleanno estivo", 20);
//            sd.save(festa);
//            sd.save(festa1);
//            System.out.println(sd.getById(4));
//            sd.delete(4);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            em.close();
            emf.close();
        }

    }
}
