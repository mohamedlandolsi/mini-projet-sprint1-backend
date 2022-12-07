package com.mohamed.smartphones.service;

import java.util.List;

import com.mohamed.smartphones.entities.Marque;
import com.mohamed.smartphones.entities.Smartphone;

public interface SmartphoneService {
	
	Smartphone saveSmartphone(Smartphone p);
	Smartphone updateSmartphone(Smartphone p);
	void deleteSmartphone(Smartphone p);
	 void deleteSmartphoneById(int id);
	Smartphone getSmartphone(int id);
	List<Smartphone> getAllSmartphones();
	List<Smartphone> findBySmartphoneModel(String model);
	List<Smartphone> findBySmartphoneModelContains(String model);
	List<Smartphone> findByModelPrice (String model, Double price);
	List<Smartphone> findByMarque (Marque marque);
	List<Smartphone> findByMarqueMarqueId(int id);
	List<Smartphone> findByOrderBySmartphoneModelAsc();
	List<Smartphone> trierSmartphonesModelsPrice();

}