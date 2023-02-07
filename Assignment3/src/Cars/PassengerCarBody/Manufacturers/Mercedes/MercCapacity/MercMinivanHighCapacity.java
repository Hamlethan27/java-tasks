package Cars.PassengerCarBody.Manufacturers.Mercedes.MercCapacity;

import Cars.PassengerCarBody.EngineCapacity.HighCapacity;
import Cars.PassengerCarBody.Manufacturers.Mercedes.MercCrossover;
import Cars.PassengerCarBody.Manufacturers.Mercedes.MercMiniVan;

public class MercMinivanHighCapacity extends MercMiniVan {
    public MercMinivanHighCapacity() {
        super();
        capacity = new HighCapacity();
        this.maxCapacity = capacity.maxCapacity;
        this.minCapacity = capacity.minCapacity;
    }
}