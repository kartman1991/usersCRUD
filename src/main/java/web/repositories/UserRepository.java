package web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import web.model.User;

@Repository
@EnableJpaRepositories
public interface UserRepository extends JpaRepository<User, Long> {
}
