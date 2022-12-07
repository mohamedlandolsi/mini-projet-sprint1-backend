package com.mohamed.smartphones.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "smartphoneModel", types = { Smartphone.class })
public interface SmartphoneProjection {
	public String getSmartphoneModel();
}
