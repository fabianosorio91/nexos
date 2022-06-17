package com.auto.nexos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auto.nexos.repository.cargoRepository;

@Service
public class cargoService {
	
	@Autowired	
	private cargoRepository cargoRepository;

}
