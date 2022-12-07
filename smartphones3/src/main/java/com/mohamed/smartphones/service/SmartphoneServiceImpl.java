package com.mohamed.smartphones.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mohamed.smartphones.entities.Marque;
import com.mohamed.smartphones.entities.Smartphone;
import com.mohamed.smartphones.repos.SmartphoneRepository;

@Component
public class SmartphoneServiceImpl implements SmartphoneService {

	@Autowired
	SmartphoneRepository smartphoneRepository;

	@Override
	public Smartphone saveSmartphone(Smartphone p) {
		return smartphoneRepository.save(p);
	}

	@Override
	public Smartphone updateSmartphone(Smartphone p) {
		return smartphoneRepository.save(p);
//		 Smartphone s = smartphoneRepository.findById(id).orElse(null);
//
//	        s.setSmartphoneId(p.getSmartphoneId());
//
//	        s.setSmartphonePrice(p.getSmartphonePrice());
//
//	        s.setSmartphoneModel(p.getSmartphoneModel());
//	        return s;
		
	}

	@Override
	public void deleteSmartphone(Smartphone p) {
		smartphoneRepository.delete(p);
	}

	@Override
	public void deleteSmartphoneById(int id) {
		smartphoneRepository.deleteById(id);
	}

	@Override
	public Smartphone getSmartphone(int id) {
		return smartphoneRepository.findById(id).get();
	}

	@Override
	public List<Smartphone> getAllSmartphones() {
		return smartphoneRepository.findAll();
	}

	@Override
	public List<Smartphone> findBySmartphoneModel(String model) {
		return smartphoneRepository.findBySmartphoneModel(model);
	}

	@Override
	public List<Smartphone> findBySmartphoneModelContains(String model) {
		return smartphoneRepository.findBySmartphoneModelContains(model);
	}

	@Override
	public List<Smartphone> findByModelPrice(String model, Double price) {

		return smartphoneRepository.findByModelPrice(model, price);
	}

	@Override
	public List<Smartphone> findByMarque(Marque categorie) {
		return smartphoneRepository.findByMarque(categorie);
	}

	@Override
	public List<Smartphone> findByMarqueMarqueId(int id) {
		return smartphoneRepository.findByMarqueMarqueId(id);
	}

	@Override
	public List<Smartphone> findByOrderBySmartphoneModelAsc() {
		return smartphoneRepository.findByOrderBySmartphoneModelAsc();
	}

	@Override
	public List<Smartphone> trierSmartphonesModelsPrice() {
		return smartphoneRepository.trierSmartphonesModelsPrice();
	}

}
