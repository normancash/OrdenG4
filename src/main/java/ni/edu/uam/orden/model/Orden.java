package ni.edu.uam.orden.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.DefaultValueCalculator;
import org.openxava.annotations.ReadOnly;
import org.openxava.calculators.CurrentLocalDateCalculator;
import org.openxava.calculators.CurrentYearCalculator;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Orden extends BaseEntity {
    @DefaultValueCalculator(CurrentYearCalculator.class)
    @ReadOnly
    private int anioFiscal;

    private Long numero;

    @DefaultValueCalculator(CurrentLocalDateCalculator.class)
    @ReadOnly
    private LocalDate fecha;

    private String descripcion;

}
