package Interfaces;

import Classes.Actor;

public interface iQueueBehaviour {
    /**
     * добавление в очередь
     *
     * @param actor клиент
     */
    void takeInQueue(iActorBehaviour actor);

    /**
     * уход из магазина
     */
    void releaseFromQueue();

    /**
     * создание заказа
     */
    void takeOrder();

    /**
     * выдача заказа
     */
    void giveOrder();
}
