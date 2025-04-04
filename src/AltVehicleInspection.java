public class AltVehicleInspection implements IVehicleInspector {
    @Override
    public int visit(Car car) {
        int serviceCharge = 0;
        
        if (car.getColor().equals("White")) {
            serviceCharge += 80;
        } else {
            serviceCharge += 60;
        }
        System.out.println("Alt Service Charge for Car: " + serviceCharge);
        return serviceCharge;
    }

    @Override
    public int visit(Van van) {
        int serviceCharge = 0;
        if (van.getNumberOfDoors() > 3) {
            serviceCharge += 150;
        } else {
            serviceCharge += 80;
        }
        System.out.println("Alt Service Charge for Van: " + serviceCharge);
        return serviceCharge;
    }

    @Override
    public int visit(Motorbike motorbike) {
        int serviceCharge = 0;
        if (motorbike.getEngineCapacity() > 500) {
            serviceCharge += 120;
        } else {
            serviceCharge += 40;
        }
        System.out.println("Alt Service Charge for Motorbike: " + serviceCharge);
        return serviceCharge;
    }
}
