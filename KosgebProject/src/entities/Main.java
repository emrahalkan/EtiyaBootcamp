package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entities.concretes.Applicant;
import entities.concretes.Application;
import entities.concretes.Authority;
import entities.concretes.Bank;
import entities.concretes.BankUser;
import entities.concretes.Credit;
import entities.concretes.CreditFeature;
import entities.concretes.Employee;
import entities.concretes.Feature;
import entities.concretes.SmallMediumEnterprise;
import entities.concretes.User;
import entities.concretes.UserAuthority;
import entities.concretes.Value;

public class Main {

	public static void main(String[] args) {
		Applicant corporate = new SmallMediumEnterprise(1,"Ahmet","123456","ahmet.1",
				"Istanbul", "Etiya", "1111111", "123123", "Küçük Ölçek");
		Bank bank = new Bank(1, "Abc Bankası");
		BankUser bankUser = new BankUser(1, "Ali", "123456", 
				"ali.abc.bank", "Istanbul", bank, "10");
		Employee employee = new Employee(1, "mahmut", "1100", "mahmut123", 
				"Istanbul", "Mahmut", "Kaya", "Bank Manager", "101");
		Authority authority1 = new Authority(1, "Kredi Başvuru");
		Authority authority2 = new Authority(2, "Kredi Onaylama");
		Authority authority3 = new Authority(3, "Kredi Sorgulama");
		
		UserAuthority userAuthority1 = new UserAuthority(1, corporate,
				authority1);
		
		UserAuthority userAuthority2 = new UserAuthority(2, bankUser,
				authority2);
		
		UserAuthority userAuthority3 = new UserAuthority(3, bankUser,
				authority3);
		UserAuthority userAuthority4 = new UserAuthority(4, employee,
				authority2);
		UserAuthority userAuthority5 = new UserAuthority(5, employee,
				authority3);
		
		System.out.println(userAuthority5.getUser().getUserName());
		
		System.out.println();
		
		List<CreditFeature> creditFeatures = new ArrayList<>();
		
		Credit credit = new Credit(1, "Kobi Destek", LocalDate.parse("2022-02-02"), LocalDate.parse("2023-02-02"),creditFeatures);
		
		Feature feature1 = new Feature(1, "Min Limit");
		
		Feature feature2 = new Feature(2, "Max Limit");
		
		Feature feature3 = new Feature(3, "Geçerlilik Bölgesi");
		
		Value value1 = new Value(1, "1000", feature1);
		
		Value value2 = new Value(2, "500000", feature2);
		
		Value value3 = new Value(3, "Ankara", feature3);
		
		CreditFeature creditFeature1 = new CreditFeature(1, credit, feature1);
		
		creditFeatures.add(creditFeature1);
		
		CreditFeature creditFeature2 = new CreditFeature(2, credit, feature2);

		creditFeatures.add(creditFeature2);
		
		CreditFeature creditFeature3 = new CreditFeature(3, credit, feature3);
		
		creditFeatures.add(creditFeature3);
		
		Application application = new Application(1,corporate , credit);
		
		
		
		System.out.println(application.getCredit().getCreditFeatures().get(0).getFeature().getName());
		
		
		
		
		
		
	}

}
