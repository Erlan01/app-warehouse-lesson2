package uz.pdp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.entity.User;
import uz.pdp.projection.CustomUsers;

@RepositoryRestResource(path = "user", excerptProjection = CustomUsers.class)
public interface UserRepo extends JpaRepository<User, Long> {
}
