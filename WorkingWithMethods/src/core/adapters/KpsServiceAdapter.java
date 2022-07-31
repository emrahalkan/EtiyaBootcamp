package core.adapters;

import business.abstracts.PersonService;
import entities.concretes.Person;
import kpsMernisService.KpsService;

public class KpsServiceAdapter implements PersonService {

	@Override
	public boolean checkPerson(Person person) {
		KpsService kpsService = new KpsService();

		return kpsService.checkPerson(Long.parseLong(person.getIdentityNumber()), person.getFirstName(),
				person.getLastName(), person.getDateOfBirth());
	}
}
