package Cars.PassengerCarBody.Manufacturers.Volvo.VolvoCapacity;

import Cars.PassengerCarBody.EngineCapacity.HighCapacity;
import Cars.PassengerCarBody.EngineCapacity.MediumCapacity;
import Cars.PassengerCarBody.Manufacturers.Volvo.VolvoSedan;

public class VolvoSedanMediumCapacity extends VolvoSedan {
    public VolvoSedanMediumCapacity() {
        super();
        capacity = new MediumCapacity();
        this.maxCapacity = capacity.maxCapacity;
        this.minCapacity = capacity.minCapacity;
    }
}