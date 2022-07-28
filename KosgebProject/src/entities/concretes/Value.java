package entities.concretes;

public class Value {
	private int id;
	private String value;
	private Feature feature;

	public Value() {
		super();
	}

	public Value(int id, String value, Feature feature) {
		super();
		this.id = id;
		this.value = value;
		this.feature = feature;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Feature getFeature() {
		return feature;
	}

	public void setFeature(Feature feature) {
		this.feature = feature;
	}

}
