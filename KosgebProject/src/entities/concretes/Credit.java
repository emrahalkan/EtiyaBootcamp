package entities.concretes;

import java.time.LocalDate;
import java.util.List;

public class Credit {
	private int id;
	private String creditName;
	private LocalDate startedDate;
	private LocalDate finishedDate;
	private List<CreditFeature> creditFeatures;

	public Credit() {
	}

	public Credit(int id, String creditName, LocalDate startedDate, LocalDate finishedDate,List<CreditFeature> creditFeatures) {
		this.id = id;
		this.creditName = creditName;
		this.startedDate = startedDate;
		this.finishedDate = finishedDate;
		this.creditFeatures=creditFeatures;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCreditName() {
		return creditName;
	}

	public void setCreditName(String creditName) {
		this.creditName = creditName;
	}

	public LocalDate getStartedDate() {
		return startedDate;
	}

	public void setStartedDate(LocalDate startedDate) {
		this.startedDate = startedDate;
	}

	public LocalDate getFinishedDate() {
		return finishedDate;
	}

	public void setFinishedDate(LocalDate finishedDate) {
		this.finishedDate = finishedDate;
	}

	public List<CreditFeature> getCreditFeatures() {
		return creditFeatures;
	}

	public void setCreditFeatures(List<CreditFeature> creditFeatures) {
		this.creditFeatures = creditFeatures;
	}

}
