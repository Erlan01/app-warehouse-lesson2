package uz.pdp.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.entity.User;
import uz.pdp.entity.Warehouse;
import java.util.Set;


@Projection(types = User.class)
public interface CustomUsers {

    Long getId();

    String getFirstName();

    String getLastName();

    String getPhoneNumber();

    String getCode();

    String getPassword();

    boolean getActive();

    Set<Warehouse> getWarehouses();
}
