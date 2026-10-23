package br.com.fittrack.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class UserEntity {


    @Id
    private String cpf;
    @Column(updatable = true, nullable = false)
    private String name;
    private String email;
    private String password;
    private String birthday;


}
