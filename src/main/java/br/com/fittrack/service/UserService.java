package br.com.fittrack.service;

import br.com.fittrack.entity.UserEntity;
import br.com.fittrack.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public  UserEntity save(UserEntity userEntity){
        return userRepository.saveAndFlush(userEntity);
    }

    public UserEntity update(String id,UserEntity userEntity){
        return userRepository.save(userEntity);
    }

    public void deleteById(String id) {

        if (!userRepository.existsById(id)) {
            throw new RuntimeException("User not found");
        }
        userRepository.deleteById(id);
    }

    public Optional<UserEntity>  findByEmail(String email) {

        return userRepository.findById(email);
    }

    public Optional<UserEntity> findById(String id) {
        return userRepository.findById(id);
    }

    public List<UserEntity>findAllUsers(){return userRepository.findAll();}
}
