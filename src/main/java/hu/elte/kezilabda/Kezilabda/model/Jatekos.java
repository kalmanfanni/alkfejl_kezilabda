package hu.elte.kezilabda.Kezilabda.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Jatekos
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    @NotNull
    private String nev;

    @Column
    private Integer mezszam;

    @Column
    private LocalDate szuletesi_ido;

    @Column
    @NotNull
    @Enumerated(EnumType.STRING)
    private Jatekos.Poszt poszt;

    public enum Poszt
    {
        BALSZELSO, BALATLOVO,IRANYITO, JOBBATLOVO, JOBBSZELSO, BEALLO, KAPUS

    }

    @JsonIgnore
    @ManyToOne
    private Csapat csapat;
}
