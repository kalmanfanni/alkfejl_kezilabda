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
public class Vasarlas
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column
    private Integer darab;

    @JsonIgnore
    @ManyToOne
    private Vasarlo vasarlo;

    @JsonIgnore
    @ManyToOne
    private Meccs meccs;
}
