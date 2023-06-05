package Classes;

import java.util.List;
import java.util.ArrayList;

import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;
import Interfaces.iReturnOrder;

public class Market implements iMarketBehaviour, iQueueBehaviour, iReturnOrder {

    private List<iActorBehaviour> queue;

    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
    }

    /**
     * Добавление клиента в магазин
     *
     * @param actor клиент
     */
    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.getActor().getName() + " клиент пришел в магазин ");
        takeInQueue(actor);
    }

    /**
     * Добавление клиента в очередь / приход в магазин
     *
     * @param actor клиент
     */
    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName() + " клиент добавлен в очередь ");
    }

    /**
     * Логика выхода из магазина
     *
     * @param actors клиент
     */
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " клиент ушел из магазина ");
            queue.remove(actor);
        }

    }

    /**
     * Работа магазина
     * обновление статуса
     */
    @Override
    public void update() {
        takeOrder();
        giveOrder();
        initiateReturn();
        releaseFromQueue();
    }

    /**
     * Выдача заказа
     */
    @Override
    public void giveOrder() {
        for (iActorBehaviour actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент получил свой заказ ");
            }
        }

    }

    /**
     * логика ухода из очереди
     */
    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehaviour actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName() + " клиент ушел из очереди ");
            }

        }
        releaseFromMarket(releaseActors);
    }


    /**
     * логика создание заказа для клиента
     */
    @Override
    public void takeOrder() {
        for (iActorBehaviour actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент сделал заказ ");

            }
        }

    }

    /**
     * логика оформление возврата товара
     */
    @Override
    public void initiateReturn() {
        for (iActorBehaviour actor : queue) {
            if (!actor.getActor().getIsReturn()) {
                actor.getActor().setIsReturn(true);
                System.out.println(actor.getActor().getName() + " клиент оформил возврат");
                isReturnOrder(actor);
            }
        }
    }

    /**
     * логика возврата
     * @param actor клиент
     */
    @Override
    public void isReturnOrder(iActorBehaviour actor) {
        if (actor.getActor().getIsReturn()) {
            System.out.println(actor.getActor().getName() + " товар возвращен");
        } else {
            System.out.println(actor.getActor().getName() + " товар не может быть возвращен");
        }
    }


}
