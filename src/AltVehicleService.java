public class AltVehicleService {
    IVehicleInspector inspector;

    public AltVehicleService(String vi) {
        
        inspector = VehicleFactory.getVehicleInspector(vi);
    }

    public int calculateTotal(IVehicle[] vehicles) {
        int total = 0;
        for (IVehicle vehicle : vehicles) {
            total += vehicle.accept(inspector);
        }
        return total;
    }
}
