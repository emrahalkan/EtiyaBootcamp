package business.concretes;

import business.abstracts.GameService;
import dataAccess.abstracts.GameManagementRepository;
import entities.concretes.Game;

import java.util.List;

public class GameManager implements GameService {
    private GameManagementRepository gameManagementRepository;

    public GameManager(GameManagementRepository gameManagementRepository) {
        this.gameManagementRepository = gameManagementRepository;
    }
    @Override
    public void add(Game game) {
        gameManagementRepository.add(game);
    }

    @Override
    public void delete(Game game) {
        gameManagementRepository.delete(game);
    }

    @Override
    public void update(Game game) {
        gameManagementRepository.update(game);
    }

    @Override
    public List<Game> getAllGames() {
        return gameManagementRepository.getAll();
    }
}
