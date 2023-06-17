package edu.mx.utvt.mode.services;

import java.util.UUID;

import edu.mx.utvt.mode.dtos.BeerDto;

public interface BeerService {
	
	BeerDto getBeerById(UUID beerId);

	BeerDto save(BeerDto beerDto);

	void update(UUID beerId, BeerDto beerDto);

	void delete(UUID beerdId);
		

}
