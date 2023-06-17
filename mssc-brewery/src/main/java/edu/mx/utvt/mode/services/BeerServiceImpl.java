package edu.mx.utvt.mode.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import edu.mx.utvt.mode.dtos.BeerDto;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
	

	@Override
	public BeerDto getBeerById(UUID beerId) {
		return BeerDto.builder().id(UUID.randomUUID())
                .name("Corona")
                .style("Wera")
//                .upc(45L)
                .build();
	}

	@Override
	public BeerDto save(BeerDto beerDto) {
		return BeerDto.builder()
				.id(UUID.randomUUID())
				.name(beerDto.getName())
				.style(beerDto.getStyle())
				.upc(beerDto.getUpc())
				.build();
	}

	@Override
	public void update(UUID beerId, BeerDto beerDto) {
		// TODO Auto-generated method stub
		log.debug("Update Beed");
		
	}

	@Override
	public void delete(UUID beerdId) {
		// TODO Auto-generated method stub
		
	}

}
