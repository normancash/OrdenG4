package ni.edu.uam.orden.model;

import com.fasterxml.jackson.databind.ser.Serializers;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Embeddable
@Getter
@Setter
public class DetalleOrden {

    @ManyToOne(fetch = FetchType.LAZY)
    private Producto producto;

    private int cantidad;

    private BigDecimal precioPorUnidad;
}
