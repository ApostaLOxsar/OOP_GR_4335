package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

public abstract class Actor implements iActorBehaviour {
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    protected boolean isReturn = false;

    public Actor(String name) {
        this.name = name;
    }
    abstract public String getName();

    public void setIsReturn(boolean isReturn){
        this.isReturn = isReturn;
    }

    public boolean getIsReturn(){
        return isReturn;
    }
}

