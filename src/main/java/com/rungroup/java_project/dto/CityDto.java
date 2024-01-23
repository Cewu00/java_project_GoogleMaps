package com.rungroup.java_project.dto;


import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

// DTO - Data Transfer Object se koristi kako bi odvojili podatke koje saljemo applikaciji od modela
// Time ako imamo bilo sta sto je bitno sto se cuva na bazi, mozemo lako da to ne saljemo na front end


@Data
@Builder
public class CityDto {
    private Long id;
    private String name;
    private String description;
    private String pinGeoLocation;

    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;
}
