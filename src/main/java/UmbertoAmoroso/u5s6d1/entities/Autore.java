package UmbertoAmoroso.u5s6d1.entities;
import lombok.*;
import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Autore {
    private int id;
    private String nome;
    private String cognome;
    private String email;
    private LocalDate data_di_nascita;

}
