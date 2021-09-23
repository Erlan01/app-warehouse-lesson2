package uz.pdp.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.entity.Currency;

@Projection(types = Currency.class)
public interface CustomCurrency {

    Long getId();

    String getName();

    boolean getActive();
}
