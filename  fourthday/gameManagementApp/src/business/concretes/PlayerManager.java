package business.concretes;

import business.abstracts.PlayerService;
import dataAccess.abstracts.GameManagementRepository;
import entities.concretes.Player;

import java.util.List;

public class PlayerManager implements PlayerService {
    private GameManagementRepository gameManagementRepository;

    public PlayerManager(GameManagementRepository gameManagementRepository) {
        this.gameManagementRepository = gameManagementRepository;
    }
    @Override
    public void add(Player player) {
        gameManagementRepository.add(player);
    }

    @Override
    public void update(Player player) {
        gameManagementRepository.update(player);
    }

    @Override
    public void delete(Player player) {
        gameManagementRepository.delete(player);
    }

    @Override
    public List<Player> getAllPlayers() {
        return gameManagementRepository.getAll();
    }
}
