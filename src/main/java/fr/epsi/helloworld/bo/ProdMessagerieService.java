package fr.epsi.helloworld.bo;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProdMessagerieService implements MessageService {

    @Override
    public String getMessage() {
        return "This is a message from the production environment";
    }
}
