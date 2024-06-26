package com.zooclinic.dto;

import com.zooclinic.entity.Appointment;
import java.time.LocalDateTime;

/**
 * The type Appointment creation dto.
 */
public record AppointmentCreationDto(
    String date,
    String time,
    String reason
) {

  /**
   * To entity appointment.
   *
   * @return the appointment
   */
  public Appointment toEntity() {
    return new Appointment(date, time, reason);
  }
}
