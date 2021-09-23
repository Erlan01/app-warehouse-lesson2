package uz.pdp.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.entity.Client;

@Projection(types = Client.class)
public interface CustomClient {

    Long getId();

    String getName();

    String getPhoneNumber();

    boolean getActive();
}
