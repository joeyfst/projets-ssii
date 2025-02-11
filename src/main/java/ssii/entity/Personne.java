package ssii.entity;

import java.util.ArrayList;

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
public class Personne {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer matricule;

    @NotBlank
    @NonNull // lombok
    private String nom;
    
    @NotBlank
    @NonNull
    private String prenom;

    @NotBlank
    @NonNull
    private String poste;

    @JoinColumn(name = "superieur")
    @ManyToOne
    private Personne superieur;
    
    @OneToMany(mappedBy="superieur")
    private ArrayList<Personne> subordonnes = new ArrayList<>();
}
