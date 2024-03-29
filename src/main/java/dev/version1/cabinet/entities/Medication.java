package dev.version1.cabinet.entities;
import dev.version1.cabinet.enums.MedicationType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Medication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMedication;

    private String name;
    @Enumerated(EnumType.STRING)
    private MedicationType medicationType;
}
