package samuelesimeone.eventi;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "events")
public class Evento {
    @Id
    @GeneratedValue
    private long id;
    private String titolo;
    private LocalDate data_evento;
    private String descrizione;

    @Enumerated(EnumType.STRING)
    private tipoEvento tipoEvento;
    private long numero_massimo_partecipanti;

    public Evento() {
    }

    public Evento(String titolo, LocalDate data_evento, String descrizione, long numero_massimo_partecipanti) {
        this.titolo = titolo;
        this.data_evento = data_evento;
        this.descrizione = descrizione;
        this.tipoEvento = samuelesimeone.eventi.tipoEvento.pubblico;
        this.numero_massimo_partecipanti = numero_massimo_partecipanti;
    }

    public long getId() {
        return id;
    }

    public String getTitolo() {
        return titolo;
    }

    public LocalDate getData_evento() {
        return data_evento;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public samuelesimeone.eventi.tipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public long getNumero_massimo_partecipanti() {
        return numero_massimo_partecipanti;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setData_evento(LocalDate data_evento) {
        this.data_evento = data_evento;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setTipoEvento(samuelesimeone.eventi.tipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public void setNumero_massimo_partecipanti(long numero_massimo_partecipanti) {
        this.numero_massimo_partecipanti = numero_massimo_partecipanti;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", data_evento=" + data_evento +
                ", descrizione='" + descrizione + '\'' +
                ", tipoEvento=" + tipoEvento +
                ", numero_massimo_partecipanti=" + numero_massimo_partecipanti +
                '}';
    }
}
