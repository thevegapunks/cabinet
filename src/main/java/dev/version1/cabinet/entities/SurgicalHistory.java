package dev.version1.cabinet.entities;
import dev.version1.cabinet.enums.SurgeryType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SurgicalHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSurgical;
    private String specialNote;
    private Date surgeryDate;
    @Enumerated(EnumType.STRING)
    private SurgeryType surgeryType;

}
