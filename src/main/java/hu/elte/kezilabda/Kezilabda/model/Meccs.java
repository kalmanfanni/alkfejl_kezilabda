package hu.elte.kezilabda.Kezilabda.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Time;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Meccs
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Date nap;

    @Column
    private Time kezdes_ido;

    @Column
    private Integer hazai_eredmeny;

    @Column
    private Integer vendeg_eredmeny;

    @JsonIgnore
    @ManyToOne
    private Csapat hazai;

    @JsonIgnore
    @ManyToOne
    private Csapat vendeg;


    @JsonIgnore
    @ManyToOne
    private Vasarlas vasarlas;

    @JsonIgnore
    @OneToMany(mappedBy = "meccs")
    private List<Vasarlas> vasarlasok;
}
