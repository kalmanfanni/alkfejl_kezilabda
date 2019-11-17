package hu.elte.kezilabda.Kezilabda.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Stab
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String nev;

    @Column
    @NotNull
    @Enumerated(EnumType.STRING)
    private Stab.Status status;

    public enum Status {
        VEZETOEDZO, SEGEDEDZO, GYURO, ORVOS, KAPUSEDZO
    }



    @JsonIgnore
    @ManyToOne
    private Csapat csapat;
}
