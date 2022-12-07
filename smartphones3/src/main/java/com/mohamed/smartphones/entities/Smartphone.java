package com.mohamed.smartphones.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Smartphone {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int smartphoneId;
	private String smartphoneModel;
	private double smartphonePrice;
	
	@ManyToOne
	private Marque marque;
	
	public Smartphone() {
		super();
		}

	
	public Smartphone(int smartphoneId, String smartphoneModel, double smartphonePrice, List<Marque> marques) {
		super();
		this.smartphoneId = smartphoneId;
		this.smartphoneModel = smartphoneModel;
		this.smartphonePrice = smartphonePrice;
	}
	
	

	public Marque getMarque() {
		return marque;
	}


	public void setMarque(Marque marque) {
		this.marque = marque;
	}


	public int getSmartphoneId() {
		return smartphoneId;
	}

	public void setSmartphoneId(int smartphoneId) {
		this.smartphoneId = smartphoneId;
	}

	public String getSmartphoneModel() {
		return smartphoneModel;
	}

	public void setSmartphoneModel(String smartphoneModel) {
		this.smartphoneModel = smartphoneModel;
	}

	public double getSmartphonePrice() {
		return smartphonePrice;
	}

	public void setSmartphonePrice(double smartphonePrice) {
		this.smartphonePrice = smartphonePrice;
	}

	@Override
	public String toString() {
		return "Smartphone [smartphoneId=" + smartphoneId + ", smartphoneModel=" + smartphoneModel
				+ ", smartphonePrice=" + smartphonePrice + "]";
	}
	
	
}
