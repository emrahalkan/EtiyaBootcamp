package dataAccess.concretes;

import dataAccess.abstracts.GameManagementRepository;
import entities.concretes.Campaign;

import java.util.ArrayList;
import java.util.List;

public class CampaignRepository implements GameManagementRepository<Campaign> {
    List<Campaign> campaigns = new ArrayList<>();

    @Override
    public void add(Campaign entity) {
        campaigns.add(entity);
        System.out.println("Campaign added");
    }

    @Override
    public void update(Campaign entity) {
        System.out.println("Campaign updated");
    }

    @Override
    public void delete(Campaign entity) {
        campaigns.remove(entity);
        System.out.println("Campaign deleted");
    }

    @Override
    public List<Campaign> getAll() {
        return campaigns;
    }
}
