package dataAccess.concretes;

import dataAccess.abstracts.GameManagementRepository;
import entities.concretes.Player;

import java.util.ArrayList;
import java.util.List;

public class PlayerRepository implements GameManagementRepository<Player> {
    List<Player> players = new ArrayList<>();

    @Override
    public void add(Player entity) {
        players.add(entity);
        System.out.println("Player added");
    }

    @Override
    public void update(Player entity) {
        System.out.println("Player updated");
    }

    @Override
    public void delete(Player entity) {
        players.remove(entity);
        System.out.println("Player deleted");
    }

    @Override
    public List<Player> getAll() {
        return null;
    }
}
