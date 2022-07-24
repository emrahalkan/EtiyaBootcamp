package business.abstracts;

import entities.concretes.Player;

import java.rmi.RemoteException;

public interface UserCheckService {
    boolean checkIfRealPerson(Player player) throws Exception;
}
