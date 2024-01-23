package samuelesimeone;

import samuelesimeone.entities.Student;
import samuelesimeone.entities.StudentDAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application {
    //creazione del ENTITY MANAGER FACTORY (il nome deriva dal file persistence.xml)

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("teoria_d1");

    public static void main(String[] args) {
        // creazione ENTITY MANAGER
        EntityManager em = emf.createEntityManager();

        try{
            StudentDAO sd = new StudentDAO(em);
            System.out.println("Hello World!");
//            Student aldo = new Student("Aldo", "Baglio");
//            sd.save(aldo);
//            Student takeFromDB = sd.findById(2);
//            System.out.println(takeFromDB);
//            sd.deleteById(2);
            Student piero = new Student("Piero","Fanelli");
            sd.save(piero);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            em.close();
            emf.close();
        }



    }
}
