package ssii.entity;

import java.time.LocalDate;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor // lombok, pour générer un constructeur avec les champs @NonNull
@ToString
public class Projet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer code;

    @NotBlank
    @NonNull // lombok
    @Column(unique=true)
    private String nom;
    
    @NotBlank
    @NonNull
    private LocalDate debut;

    private LocalDate fin;
}
