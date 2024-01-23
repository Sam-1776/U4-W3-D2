package samuelesimeone.entities;


import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue
    private long id;
    // UUID genera come id una stringa univoca (consigliato il suo uso)
    private String name;
    private String surname;

    @Enumerated(EnumType.STRING)
    private Status status;

    public Student(){
    }

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.status = Status.active;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
