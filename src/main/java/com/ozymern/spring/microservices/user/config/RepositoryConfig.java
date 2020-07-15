package com.ozymern.spring.microservices.user.config;



import com.ozymern.spring.microservices.commons.models.entity.Role;
import com.ozymern.spring.microservices.commons.models.entity.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {

//configurar para que la entidad muestre el id
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {

        config.exposeIdsFor(User.class, Role.class);
    }
}
