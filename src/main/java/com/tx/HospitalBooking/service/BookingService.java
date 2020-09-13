package com.tx.HospitalBooking.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tx.HospitalBooking.dto.BookingDto;
import com.tx.HospitalBooking.entity.Appointment;
import com.tx.HospitalBooking.entity.Patient;
import com.tx.HospitalBooking.repo.AppointmentRepo;
import com.tx.HospitalBooking.repo.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

@Service
@Transactional
public class BookingService {
    @Autowired
    AppointmentRepo appointmentRepo;
    @Autowired
    PatientRepo patientRepo;

    public String booking(BookingDto dto) {
        Patient patient = new ObjectMapper().convertValue(dto, Patient.class);
        long patientNo = patientRepo.save(patient).getPatientNo();
        System.out.println("patientNo : " + patientNo);
        Appointment appointment = Appointment.builder().doctorNo(101).date(LocalDate.now()).patientNo(patientNo).build();
        Appointment saveAppointment = appointmentRepo.save(appointment);
        return "Appointment saved successfully you appointment booking id is " + saveAppointment.getAppointmentNo();
    }
}
