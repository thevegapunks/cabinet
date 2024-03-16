package dev.version1.cabinet.services;

import dev.version1.cabinet.entities.Appointment;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface AppointmentService {
     Appointment saveAppointment(Appointment appointment);
     List<Appointment> getAllAppointments();
     Optional<Appointment> getAppointmentById(Long id);
     void deleteAppointment(Long id);
}
