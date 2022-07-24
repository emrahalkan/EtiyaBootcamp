import business.concretes.PlayerManager;
import core.adapters.MernisAdapter;
import dataAccess.abstracts.GameManagementRepository;
import entities.concretes.Player;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player(1,"ea@mail","123456","Emrah","Alkan","123456789",2000);

        PlayerManager playerManager = new PlayerManager();
        playerManager.add(player1);

        PlayerManager playerManager2 = new PlayerManager(new UserFakeCheckManager());
        playerManager2.add(player1);

        Game game1 = new Game(1, "Game 1", 400);

        GameManager gameManager = new GameManager();
        gameManager.add(game1);


        CampaignManager campaignManager = new CampaignManager();
        campaignManager.add(campaign1);

        SaleManager saleManager = new SaleManager();

        Sale sale1 = new Sale(1, player1, game1, campaign1);

        saleManager.sale(sale1);

    }
}
