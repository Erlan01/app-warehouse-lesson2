package uz.pdp.repository;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.entity.Measurement;

@Projection(types = Measurement.class)
public interface CustomMeasurement {

    Long getId();

    String hetName();

    boolean getActive();
}
