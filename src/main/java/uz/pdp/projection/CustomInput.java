package uz.pdp.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.entity.Input;

import java.time.LocalDateTime;

@Projection(types = Input.class)
public interface CustomInput {

    Long getId();

    LocalDateTime getDate();

    String getFactureNumber();

    String getCode();

    Long getWarehouse();

    Long getSupplier();

    Long getCurrency();

}
