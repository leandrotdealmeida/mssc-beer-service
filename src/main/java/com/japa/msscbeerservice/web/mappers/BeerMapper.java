package com.japa.msscbeerservice.web.mappers;

import com.japa.msscbeerservice.domain.Beer;
import com.japa.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);

}
