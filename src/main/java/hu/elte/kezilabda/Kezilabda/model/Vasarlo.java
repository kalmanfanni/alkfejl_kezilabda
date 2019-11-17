package hu.elte.kezilabda.Kezilabda.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Vasarlo
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String nev;

    @Column
    private String email;

    @Column
    private String telefon;

    @JsonIgnore
    @OneToMany(mappedBy = "vasarlo")
    private List<Vasarlas> vasarlasok;
}
