package core.adapters;

import MernisReferance.GQCKPSPublicSoap;
import business.abstracts.UserCheckService;
import entities.concretes.Player;

import java.rmi.RemoteException;

public class MernisAdapter implements UserCheckService {
    @Override
    public boolean checkIfRealPerson(Player player) throws Exception {
        GQCKPSPublicSoap kpsPublicSoap = new GQCKPSPublicSoap();
        boolean result = kpsPublicSoap.TCKimlikNoDogrula(Long.parseLong(player.getIdentityNumber()),
                player.getFirstName().toUpperCase(),
                player.getLastName().toUpperCase(),
                player.getBirtDate().getYear());
        return false;
    }
}
