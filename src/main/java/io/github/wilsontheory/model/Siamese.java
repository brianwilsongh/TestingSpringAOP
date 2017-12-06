package io.github.wilsontheory.model;

import io.github.wilsontheory.aspect.CustomAnnotation;

public class Siamese {
	private String name;

	@CustomAnnotation
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
