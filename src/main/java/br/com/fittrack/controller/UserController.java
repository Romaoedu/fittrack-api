package br.com.fittrack.controller;

import br.com.fittrack.entity.UserEntity;
import br.com.fittrack.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping()
   public ResponseEntity<UserEntity> createUser(@RequestBody UserEntity userEntity) {

        return ResponseEntity.ok(service.save(userEntity));

   }

    @PutMapping("/{id}")
   public ResponseEntity <UserEntity> updateUser(@PathVariable String id, @RequestBody UserEntity userEntity){
        return ResponseEntity.ok(service.update(id, userEntity));
   }

   @GetMapping()
   public List<UserEntity>findAllUser(){

        return service.findAllUsers();
   }

    @GetMapping("/{id}")
   public ResponseEntity<UserEntity> findById (@PathVariable String id){

        return ResponseEntity.ok(service.findById(id).orElseThrow());
   }

    @DeleteMapping("/{id}")
   public void deleteUser (@PathVariable String id){
        service.deleteById(id);
   }
}
