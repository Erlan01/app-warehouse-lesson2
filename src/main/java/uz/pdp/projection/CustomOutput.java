package uz.pdp.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.entity.Output;
import java.time.LocalDateTime;


@Projection(types = Output.class)
public interface CustomOutput {

    Long getId();

    LocalDateTime getDate();

    String getFactureNumber();

    String getCode();

    Long getWarehouse();

    Long getCurrency();

    Long getClient();

}
