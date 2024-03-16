package dev.version1.cabinet.servicesImpl;

import dev.version1.cabinet.entities.Appointment;
import dev.version1.cabinet.repositories.AppointmentRepository;
import dev.version1.cabinet.services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class AppointmentServiceImpl implements AppointmentService {

    private final AppointmentRepository appointmentRepository;

    @Autowired
    public AppointmentServiceImpl(AppointmentRepository appointmentRepository){
        this.appointmentRepository = appointmentRepository;
    }
    @Override
    public Appointment saveAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @Override
    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    @Override
    public Optional<Appointment> getAppointmentById(Long id) {
        return  appointmentRepository.findById(id);
    }

    @Override
    public void deleteAppointment(Long id) {
    appointmentRepository.deleteById(id);
    }
}
