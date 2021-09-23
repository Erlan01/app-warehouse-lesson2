package uz.pdp.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.entity.InputProduct;

import java.time.LocalDate;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {

    Long getId();

    Double getAmount();

    LocalDate getExpireDate();

    Long getProduct();

    Long getInput();


}
