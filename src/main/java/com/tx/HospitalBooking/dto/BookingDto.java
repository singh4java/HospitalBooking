package com.tx.HospitalBooking.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class BookingDto {
    private String name;
    private String gender;
    private String mobile;
    private int age;
}
