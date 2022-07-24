package business.concretes;

import business.abstracts.CampaignService;
import dataAccess.abstracts.GameManagementRepository;
import entities.concretes.Campaign;

import java.util.List;

public class CampaignManager implements CampaignService {
    private GameManagementRepository gameManagementRepository;

    public CampaignManager(GameManagementRepository gameManagementRepository) {
        this.gameManagementRepository = gameManagementRepository;
    }

    @Override
    public void add(Campaign campaign) {
        gameManagementRepository.add(campaign);
    }

    @Override
    public void delete(Campaign campaign) {
        gameManagementRepository.delete(campaign);
    }

    @Override
    public void update(Campaign campaign) {
        gameManagementRepository.update(campaign);
    }

    @Override
    public List<Campaign> getAllCampaigns() {
        return gameManagementRepository.getAll();
    }
}
