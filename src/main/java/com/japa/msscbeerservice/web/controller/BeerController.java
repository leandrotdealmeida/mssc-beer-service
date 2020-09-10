package com.japa.msscbeerservice.web.controller;

import com.japa.msscbeerservice.web.model.BeerDto;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId) {

        //todo impl
        return new ResponseEntity<BeerDto>( HttpStatus.OK );
    }

    @PostMapping
    public ResponseEntity saveNewBeer(@RequestBody @Validated BeerDto beerDto) {

        //todo impl
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeerByid(@PathVariable("beerId") UUID beerId, @RequestBody @Validated BeerDto beerDto) {

        //todo impl
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

}
