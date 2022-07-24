package dataAccess.concretes;

import dataAccess.abstracts.GameManagementRepository;
import entities.concretes.Game;

import java.util.ArrayList;
import java.util.List;

public class GameRepository implements GameManagementRepository<Game> {
    List<Game> games = new ArrayList<>();

    public void add(Game entity) {
        games.add(entity);
        System.out.println("Game added.");
    }

    @Override
    public void update(Game entity) {
        System.out.println("Game updated");
    }

    @Override
    public void delete(Game entity) {
        games.remove(entity);
        System.out.println("Game deleted");
    }

    @Override
    public List<Game> getAll() {
        return games;
    }
}
