package com.tx.HospitalBooking.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
@Builder
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long appointmentNo;
    private LocalDate date;
    private long doctorNo;
    private long patientNo;
}
