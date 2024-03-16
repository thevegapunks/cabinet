package dev.version1.cabinet.entities;
import dev.version1.cabinet.enums.DurationInstruction;
import dev.version1.cabinet.enums.FrequencyInstruction;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Instruction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "instruction")
    private Prescription prescription;

    private String details;

    private String dosage;
    @Enumerated(EnumType.STRING)
    private FrequencyInstruction frequencyInstruction;
    @Enumerated(EnumType.STRING)
    private DurationInstruction durationInstruction;
    private String additionalNotes;
}
