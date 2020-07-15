package com.ozymern.spring.microservices.user.repository;


import com.ozymern.spring.microservices.commons.models.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(path = "users")
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

    //sobreescribir ruta por defecto localhost:8096/api/v1/user/users/search/findByUsername?username=ozymern
    @RestResource(path = "user-username")
    User findByUsername(String username);

    //personalizar consulta
    @Query("select u from User  u where  u.username=?1 ")
    User getUserByUsername(String username);
}
