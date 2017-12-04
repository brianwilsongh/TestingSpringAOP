package io.github.wilsontheory.service;

import io.github.wilsontheory.model.Calico;
import io.github.wilsontheory.model.RussianBlue;
import io.github.wilsontheory.model.Siamese;

public class CatService {
	
	private Siamese siamese;
	private RussianBlue russianBlue;
	private Calico calico;
	
	public Siamese getSiamese() {
		return siamese;
	}
	
	public void setSiamese(Siamese siamese) {
		this.siamese = siamese;
	}
	
	public RussianBlue getRussianBlue() {
		return russianBlue;
	}
	
	public void setRussianBlue(RussianBlue russianBlue) {
		this.russianBlue = russianBlue;
	}

	public Calico getCalico() {
		return calico;
	}

	public void setCalico(Calico calico) {
		this.calico = calico;
	}

}
