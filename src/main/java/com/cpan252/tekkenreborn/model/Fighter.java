package com.cpan252.tekkenreborn.model;

import java.math.BigDecimal;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Fighter {
    @NotBlank
    private String name;
    @Max(99)
    private int damagePerHit;
    @Min(1001)
    private int health;
    @DecimalMax(value = "10.0", inclusive = true)
    @DecimalMin(value = "0.000000001", inclusive = true)
    private BigDecimal resistance;
    private Anime animeFrom;

    public enum Anime {
        NARUTO("My Hero Academia"), BLEACH("Chainsaw Man"), ONE_PIECE("Fairy Tail"), TEKKEN("Tekken");

        private String title;

        private Anime(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }
    }
}
