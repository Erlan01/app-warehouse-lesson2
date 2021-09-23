package uz.pdp.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.entity.Product;


@Projection(types = Product.class)
public interface CustomProduct {

    Long getId();

    String getName();

    Long getCategory();

    Long getAttachment();

    Long getMeasurement();

}
