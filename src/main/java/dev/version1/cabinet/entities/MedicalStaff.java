package dev.version1.cabinet.entities;

import dev.version1.cabinet.enums.MedicalStaffRole;
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
public class MedicalStaff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStaff;

    private String name;
    @Enumerated(EnumType.STRING)
    private MedicalStaffRole medicalStaffRole;

    @ManyToOne
   // @JoinColumn(name = "cabinetNumber")
    private CabinetMedical cabinet;

    private String cin;
    private String address;
    private String email;
    private String phone;
}
