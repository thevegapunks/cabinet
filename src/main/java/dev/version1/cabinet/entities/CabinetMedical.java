package dev.version1.cabinet.entities;

import dev.version1.cabinet.enums.CabinetMedicalSpeciality;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CabinetMedical  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCabinet;

    private String cabinetNumber;
    private String name;
    @Enumerated(EnumType.STRING)
    private CabinetMedicalSpeciality cabinetMedicalSpeciality;
    private String address;
    private String email;
    private String phone;
}
