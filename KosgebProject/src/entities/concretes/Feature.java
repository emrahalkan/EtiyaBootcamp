package entities.concretes;

import java.util.List;

public class Feature {
	private int featureId;
	private String name;


	public Feature() {
		super();
	}

	public Feature(int featureId, String name) {
		super();
		this.featureId = featureId;
		this.name = name;
		
	}

	public int getFeatureId() {
		return featureId;
	}

	public void setFeatureId(int featureId) {
		this.featureId = featureId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
