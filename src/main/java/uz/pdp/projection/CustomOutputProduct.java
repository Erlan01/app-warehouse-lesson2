package uz.pdp.projection;


import org.springframework.data.rest.core.config.Projection;
import uz.pdp.entity.OutputProduct;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {

    Long getId();

    Double getAmount();

    Double getPrice();

    Long getProduct();

    Long getOutput();

}
