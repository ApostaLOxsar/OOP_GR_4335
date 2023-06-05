package Interfaces;

public interface iReturnOrder {
    /**
     * начало возврата товара
     */
    void initiateReturn();

    /**
     * логика возможности возврата
     *
     * @param actor клиент
     */
    public void isReturnOrder(iActorBehaviour actor);
}
