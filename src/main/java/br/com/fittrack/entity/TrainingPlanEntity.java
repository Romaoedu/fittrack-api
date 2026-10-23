package br.com.fittrack.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class TrainingPlanEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "user_cpf")
    private UserEntity userEntity;
    @OneToMany(mappedBy = "trainingPlanEntity")
    private List<ItemTrainingEntity> items = new ArrayList<>();
    private LocalDateTime creationDate;

}
