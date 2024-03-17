package dev.version1.cabinet.controllers;

import dev.version1.cabinet.entities.CabinetMedical;
import dev.version1.cabinet.services.CabinetMedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cabinet-medicals")
public class CabinetMedicalController {

    private final CabinetMedicalService cabinetMedicalService;

    @Autowired
    public CabinetMedicalController(CabinetMedicalService cabinetMedicalService) {
        this.cabinetMedicalService = cabinetMedicalService;
    }

    @GetMapping
    public ResponseEntity<List<CabinetMedical>> getAllCabinetMedicals() {
        List<CabinetMedical> cabinetMedicals = cabinetMedicalService.getAllCabinetMedicals();
        return new ResponseEntity<>(cabinetMedicals, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CabinetMedical> getCabinetMedicalById(@PathVariable Long id) {
        Optional<CabinetMedical> optionalCabinetMedical = cabinetMedicalService.getCabinetMedicalById(id);
        if (optionalCabinetMedical.isPresent()) {
            return new ResponseEntity<>(optionalCabinetMedical.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<CabinetMedical> createCabinetMedical(@RequestBody CabinetMedical cabinetMedical) {
        CabinetMedical createdCabinetMedical = cabinetMedicalService.save(cabinetMedical);
        return new ResponseEntity<>(createdCabinetMedical, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCabinetMedical(@PathVariable Long id) {
        cabinetMedicalService.deleteCabinetMedicalById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
