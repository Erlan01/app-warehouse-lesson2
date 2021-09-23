package uz.pdp.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.entity.Supplier;

@Projection(types = Supplier.class)
public interface CustomSupplier {

    Long getId();

    String getName();

    String getPhoneNumber();

    boolean getActive();


}
