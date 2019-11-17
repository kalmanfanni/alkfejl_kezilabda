package hu.elte.kezilabda.Kezilabda.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
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
    private Integer nap;

    @Column
    private Integer kezdes_ido;

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
