package ni.edu.uam.orden.model;

import lombok.Getter;
import lombok.Setter;
import ni.edu.uam.orden.calculators.CalculatorNumero;
import org.openxava.annotations.DefaultValueCalculator;
import org.openxava.annotations.PropertyValue;
import org.openxava.annotations.ReadOnly;
import org.openxava.calculators.CurrentLocalDateCalculator;
import org.openxava.calculators.CurrentMonthCalculator;
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

    @DefaultValueCalculator(value= CalculatorNumero.class,
           properties = @PropertyValue(name="anioFiscal"))
    private Integer numero;

    @DefaultValueCalculator(CurrentLocalDateCalculator.class)
    @ReadOnly
    private LocalDate fecha;

    private String descripcion;

}
