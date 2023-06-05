package Classes;

public class PromotionClient extends Actor {


    private static int actionCount = 5;
    private String namePromt;
    private int IdClient;

    /**
     * @param name Имя клиента
     * @param namePromt название акции
     * @param IdClient Номер клиента
     */
    public PromotionClient(String name, String namePromt, int IdClient) {
        super(name);
        this.namePromt = namePromt;
        if (IdClient <= actionCount) {
            this.IdClient = IdClient;
        } else {
            throw new IllegalStateException(String.format("Количество людей учавствующих в акции ограничено: %s", actionCount));
        }
    }

    /**
     * @return общее количество мест в акции
     */
    public static int getActionCount() {
        return actionCount;
    }

    /**
     * @param actionCount Новое кол-во мест в акции
     */
    public static void setActionCount(int actionCount) {
        PromotionClient.actionCount = actionCount;
    }

    /**
     * @return имя клиента
     */
    @Override
    public String getName() {
        return super.name;
    }

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public void setTakeOrder(boolean makeOder) {
        super.isMakeOrder = makeOder;
    }

    public void setMakeOrder(boolean pikUpOrder) {
        super.isTakeOrder = pikUpOrder;
    }

    public Actor getActor() {
        return this;
    }

    public String getNamePromt() {
        return namePromt;
    }

    public void setNamePromt(String namePromt) {
        this.namePromt = namePromt;
    }

    public int getIdClient() {
        return IdClient;
    }

    public void setIdClient(int idClient) {
        IdClient = idClient;
    }
}
