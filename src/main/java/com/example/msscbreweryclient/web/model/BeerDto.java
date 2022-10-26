package com.example.msscbreweryclient.web.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;
import java.util.UUID;

/**
 * @created : by GBu on 26. 10. 2022, streda
 * @mailto : grigorii.busakhin@software-foundation.sk
 **/
@NoArgsConstructor
@Getter
@Setter
public class BeerDto {

    private UUID id;
    private String beerName;
    private String beerStyle;
    private Long upc;

    @Builder
    public BeerDto(UUID id, String beerName, String beerStyle, Long upc) {
        this.id = id;
        this.beerName = beerName;
        this.beerStyle = beerStyle;
        this.upc = upc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BeerDto beerDto = (BeerDto) o;
        return Objects.equals(id, beerDto.id) && Objects.equals(beerName, beerDto.beerName) && Objects.equals(beerStyle, beerDto.beerStyle) && Objects.equals(upc, beerDto.upc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, beerName, beerStyle, upc);
    }

    @Override
    public String toString() {
        return "BeerDto{" +
                "id=" + id +
                ", beerName='" + beerName + '\'' +
                ", beerStyle='" + beerStyle + '\'' +
                ", upc=" + upc +
                '}';
    }
}
