package br.com.fittrack.repository;

import br.com.fittrack.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity, String> {

    <optional>UserEntity findByEmail(String email);

    List<UserEntity> findAll();
}
