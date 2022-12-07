package com.mohamed.smartphones.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mohamed.smartphones.entities.Smartphone;
import com.mohamed.smartphones.service.SmartphoneService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class SmartphoneRESTController {
	@Autowired
	SmartphoneService smartphoneService;

	@RequestMapping(method = RequestMethod.GET)
	public List<Smartphone> getAllSmartphones() {
		return smartphoneService.getAllSmartphones();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Smartphone getSmartphoneById(@PathVariable("id") int id) {
		return smartphoneService.getSmartphone(id);
	}

	@RequestMapping(method = RequestMethod.POST)
	public Smartphone saveSmartphone(@RequestBody Smartphone smartphone) {
		return smartphoneService.saveSmartphone(smartphone);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public Smartphone updateSmartphone(@RequestBody Smartphone smartphone) {
		return smartphoneService.updateSmartphone(smartphone);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteSmartphone(@PathVariable("id") int id) {
		smartphoneService.deleteSmartphoneById(id);
	}

	@RequestMapping(value = "/prodscat/{idBrand}", method = RequestMethod.GET)
	public List<Smartphone> getSmartphonesByBrandId(@PathVariable("idBrand") int idBrand) {
		return smartphoneService.findByMarqueMarqueId(idBrand);
	}
	
	@RequestMapping(value="/phonesByModel/{smartphoneModel}",method = RequestMethod.GET)
	public List<Smartphone> findBySmartphoneModelContains(@PathVariable("smartphoneModel") String smartphoneModel) {
	return smartphoneService.findBySmartphoneModelContains(smartphoneModel);
	}

	
}
