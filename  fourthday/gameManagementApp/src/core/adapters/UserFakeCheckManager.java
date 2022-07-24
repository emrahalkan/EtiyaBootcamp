package core.adapters;

import business.abstracts.UserCheckService;
import entities.concretes.Player;

public class UserFakeCheckManager implements UserCheckService {
    @Override
    public boolean checkIfRealPerson(Player player) throws Exception {
        return true;
    }
}
