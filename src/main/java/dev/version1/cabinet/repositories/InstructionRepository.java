package dev.version1.cabinet.repositories;

import dev.version1.cabinet.entities.Instruction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface InstructionRepository extends JpaRepository<Instruction,Long> {
}
