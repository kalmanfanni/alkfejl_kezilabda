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
public class Csapat
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    @NotNull
    private String nev;

    @Column
    private String palya_nev;

    @Column
    private String cim;

    @Column
    private Integer ferohely;

    @JsonIgnore
    @OneToMany(mappedBy = "csapat")
    private List<Stab> stab;

    @JsonIgnore
    @OneToMany(mappedBy = "csapat")
    private List<Jatekos> jatekos;

    @JsonIgnore
    @OneToMany(mappedBy = "hazai")
    private List<Meccs> hazaiMeccs;

    @JsonIgnore
    @OneToMany(mappedBy = "vendeg")
    private List<Meccs> vendegMeccs;


}
