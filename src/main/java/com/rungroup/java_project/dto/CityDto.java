package com.rungroup.java_project.dto;


import jakarta.validation.constraints.NotEmpty;

import java.time.LocalDateTime;

// DTO - Data Transfer Object se koristi kako bi odvojili podatke koje saljemo applikaciji od modela
// Time ako imamo bilo sta sto je bitno sto se cuva na bazi, mozemo lako da to ne saljemo na front end


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

    CityDto(Long id, @NotEmpty(message = "City Name should not be empty") String name, @NotEmpty(message = "City Description should not be empty") String description, @NotEmpty(message = "City latitude location should not be empty") String latitude_x, @NotEmpty(message = "City longitude location should not be empty") String longitude_y, LocalDateTime createdOn, LocalDateTime updatedOn) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.latitude_x = latitude_x;
        this.longitude_y = longitude_y;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public static CityDtoBuilder builder() {
        return new CityDtoBuilder();
    }

    public Long getId() {
        return this.id;
    }

    public @NotEmpty(message = "City Name should not be empty") String getName() {
        return this.name;
    }

    public @NotEmpty(message = "City Description should not be empty") String getDescription() {
        return this.description;
    }

    public @NotEmpty(message = "City latitude location should not be empty") String getLatitude_x() {
        return this.latitude_x;
    }

    public @NotEmpty(message = "City longitude location should not be empty") String getLongitude_y() {
        return this.longitude_y;
    }

    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    public LocalDateTime getUpdatedOn() {
        return this.updatedOn;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(@NotEmpty(message = "City Name should not be empty") String name) {
        this.name = name;
    }

    public void setDescription(@NotEmpty(message = "City Description should not be empty") String description) {
        this.description = description;
    }

    public void setLatitude_x(@NotEmpty(message = "City latitude location should not be empty") String latitude_x) {
        this.latitude_x = latitude_x;
    }

    public void setLongitude_y(@NotEmpty(message = "City longitude location should not be empty") String longitude_y) {
        this.longitude_y = longitude_y;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public void setUpdatedOn(LocalDateTime updatedOn) {
        this.updatedOn = updatedOn;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CityDto)) return false;
        final CityDto other = (CityDto) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$description = this.getDescription();
        final Object other$description = other.getDescription();
        if (this$description == null ? other$description != null : !this$description.equals(other$description))
            return false;
        final Object this$latitude_x = this.getLatitude_x();
        final Object other$latitude_x = other.getLatitude_x();
        if (this$latitude_x == null ? other$latitude_x != null : !this$latitude_x.equals(other$latitude_x))
            return false;
        final Object this$longitude_y = this.getLongitude_y();
        final Object other$longitude_y = other.getLongitude_y();
        if (this$longitude_y == null ? other$longitude_y != null : !this$longitude_y.equals(other$longitude_y))
            return false;
        final Object this$createdOn = this.getCreatedOn();
        final Object other$createdOn = other.getCreatedOn();
        if (this$createdOn == null ? other$createdOn != null : !this$createdOn.equals(other$createdOn)) return false;
        final Object this$updatedOn = this.getUpdatedOn();
        final Object other$updatedOn = other.getUpdatedOn();
        if (this$updatedOn == null ? other$updatedOn != null : !this$updatedOn.equals(other$updatedOn)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CityDto;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $description = this.getDescription();
        result = result * PRIME + ($description == null ? 43 : $description.hashCode());
        final Object $latitude_x = this.getLatitude_x();
        result = result * PRIME + ($latitude_x == null ? 43 : $latitude_x.hashCode());
        final Object $longitude_y = this.getLongitude_y();
        result = result * PRIME + ($longitude_y == null ? 43 : $longitude_y.hashCode());
        final Object $createdOn = this.getCreatedOn();
        result = result * PRIME + ($createdOn == null ? 43 : $createdOn.hashCode());
        final Object $updatedOn = this.getUpdatedOn();
        result = result * PRIME + ($updatedOn == null ? 43 : $updatedOn.hashCode());
        return result;
    }

    public String toString() {
        return "CityDto(id=" + this.getId() + ", name=" + this.getName() + ", description=" + this.getDescription() + ", latitude_x=" + this.getLatitude_x() + ", longitude_y=" + this.getLongitude_y() + ", createdOn=" + this.getCreatedOn() + ", updatedOn=" + this.getUpdatedOn() + ")";
    }

    public static class CityDtoBuilder {
        private Long id;
        private @NotEmpty(message = "City Name should not be empty") String name;
        private @NotEmpty(message = "City Description should not be empty") String description;
        private @NotEmpty(message = "City latitude location should not be empty") String latitude_x;
        private @NotEmpty(message = "City longitude location should not be empty") String longitude_y;
        private LocalDateTime createdOn;
        private LocalDateTime updatedOn;

        CityDtoBuilder() {
        }

        public CityDtoBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public CityDtoBuilder name(@NotEmpty(message = "City Name should not be empty") String name) {
            this.name = name;
            return this;
        }

        public CityDtoBuilder description(@NotEmpty(message = "City Description should not be empty") String description) {
            this.description = description;
            return this;
        }

        public CityDtoBuilder latitude_x(@NotEmpty(message = "City latitude location should not be empty") String latitude_x) {
            this.latitude_x = latitude_x;
            return this;
        }

        public CityDtoBuilder longitude_y(@NotEmpty(message = "City longitude location should not be empty") String longitude_y) {
            this.longitude_y = longitude_y;
            return this;
        }

        public CityDtoBuilder createdOn(LocalDateTime createdOn) {
            this.createdOn = createdOn;
            return this;
        }

        public CityDtoBuilder updatedOn(LocalDateTime updatedOn) {
            this.updatedOn = updatedOn;
            return this;
        }

        public CityDto build() {
            return new CityDto(this.id, this.name, this.description, this.latitude_x, this.longitude_y, this.createdOn, this.updatedOn);
        }

        public String toString() {
            return "CityDto.CityDtoBuilder(id=" + this.id + ", name=" + this.name + ", description=" + this.description + ", latitude_x=" + this.latitude_x + ", longitude_y=" + this.longitude_y + ", createdOn=" + this.createdOn + ", updatedOn=" + this.updatedOn + ")";
        }
    }
}
