package com.mohamed.smartphones.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mohamed.smartphones.entities.Marque;
import com.mohamed.smartphones.entities.Smartphone;

@RepositoryRestResource(path = "rest")
public interface SmartphoneRepository extends JpaRepository<Smartphone, Integer> {
	
	List<Smartphone> findBySmartphoneModel(String model);
	List<Smartphone> findBySmartphoneModelContains(String model);
	
	@Query("select p from Smartphone p where p.smartphoneModel like %?1 and p.smartphonePrice > ?2")
	List<Smartphone> findByModelPrice (String model, Double price);
	
	@Query("select p from Smartphone p where p.marque = ?1")
	List<Smartphone> findByMarque (Marque marque);
	
	List<Smartphone> findByMarqueMarqueId(int id);
	
	List<Smartphone> findByOrderBySmartphoneModelAsc();
	
	@Query("select p from Smartphone p order by p.smartphoneModel ASC, p.smartphonePrice DESC")
	List<Smartphone> trierSmartphonesModelsPrice ();
	
}
