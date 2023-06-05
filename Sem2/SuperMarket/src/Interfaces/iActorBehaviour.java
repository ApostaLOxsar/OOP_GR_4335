package Interfaces;

import Classes.Actor;

public interface iActorBehaviour {
    /**
     * @param makeOrder состояние заказа
     */
    void setMakeOrder(boolean makeOrder);

    /**
     * @param pickUpOrder состояние выполнение заказа
     */
    void setTakeOrder(boolean pickUpOrder);

    /**
     * @return состояние заказа
     */
    boolean isMakeOrder();

    /**
     * @return состояние выполнение заказа
     */
    boolean isTakeOrder();

    /**
     * @return клиент
     */
    Actor getActor();
}
