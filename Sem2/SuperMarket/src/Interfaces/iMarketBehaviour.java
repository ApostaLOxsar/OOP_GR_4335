package Interfaces;

import java.util.List;
import Classes.Actor;

public interface iMarketBehaviour {
    /**
     * логика прихода в магазин
     *
     * @param actor клиент
     */
    void acceptToMarket(iActorBehaviour actor);

    /**
     * логика ухода из магазина
     *
     * @param actors клиент
     */
    void releaseFromMarket(List<Actor> actors);

    /**
     * логика работы магазина
     */
    void update();
}
