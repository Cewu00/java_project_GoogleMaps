package com.rungroup.java_project.dto;


import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

// DTO - Data Transfer Object se koristi kako bi odvojili podatke koje saljemo applikaciji od modela
// Time ako imamo bilo sta sto je bitno sto se cuva na bazi, mozemo lako da to ne saljemo na front end


@Data
@Builder
public class CityDto {
    private Long id;
    @NotEmpty(message = "City Name should not be empty")
    private String name;
    @NotEmpty(message = "City Description should not be empty")
    private String description;
    @NotEmpty(message = "City latitude location should not be empty")
    private String latitude_x;
    @NotEmpty(message = "City longitude location should not be empty")
    private String longitude_y;

    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;
}
