package edu.mx.utvt.web.controllers;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import edu.mx.utvt.mode.dtos.BeerDto;
import edu.mx.utvt.mode.services.BeerService;

@RestController
@RequestMapping("api/v1/beer")
public class BeerController {
	
	@Autowired
	private BeerService beerService; 
	
	@GetMapping("/{id}")
	public ResponseEntity<BeerDto> getById(@PathVariable("id") UUID beerId ) {
		return ResponseEntity.ok(this.beerService.getBeerById(beerId));
	}
	
	@PostMapping
	public ResponseEntity<BeerDto> handlePost(@RequestBody BeerDto beerDto) {
		return ResponseEntity.created(null).body(this.beerService.save(beerDto));
	}
	
	@PutMapping
	public ResponseEntity<Void> hableUpdate(@PathVariable("id") UUID beerId, @RequestBody BeerDto beerDto) {
		this.beerService.update(beerId, beerDto);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	@DeleteMapping("/{id}")
	public void hanldeDelete(@PathVariable("id") UUID beerdId) {
		this.beerService.delete(beerdId);
	}

}
