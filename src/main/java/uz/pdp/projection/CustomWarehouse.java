package uz.pdp.projection;


import org.springframework.data.rest.core.config.Projection;
import uz.pdp.entity.Warehouse;

@Projection(types = Warehouse.class)
public interface CustomWarehouse {

    Long getId();

    String getName();

    boolean getActive();
}
