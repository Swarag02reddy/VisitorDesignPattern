public class VehicleService {
    IVehicleInspector inspector;

    VehicleService() {
	
	inspector = new VehicleInspection();
    }
    
    
    public int calculateTotal(IVehicle[] vehicles) {
        int total = 0;
        for(IVehicle vehicle : vehicles){
            total = total + vehicle.accept(inspector);
        }
        return total;
    }
}
