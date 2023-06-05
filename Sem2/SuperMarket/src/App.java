import Classes.*;
import Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) throws Exception {
        Market market = new Market();
        iActorBehaviour client1 = new OrdinaryClient("Boris");
        iActorBehaviour client2 = new OrdinaryClient("Dasha");
        iActorBehaviour client3 = new SpecialClient("Prezident", 1);
        iActorBehaviour client4 = new PromotionClient("Vasya", "2 + 1", 1);


        market.acceptToMarket(client1);
        //client2.getActor().setIsReturn(true);
        //market.acceptToMarket(client2);
        //market.acceptToMarket(client3);
        market.acceptToMarket(client4);
        //market.acceptToMarket(new TaxService());

        market.update();
    }
}
