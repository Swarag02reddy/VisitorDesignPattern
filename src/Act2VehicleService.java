public class Act2VehicleService {
    private static final Act2VehicleService instance;
    private IVehicleInspector inspector;

    
    private Act2VehicleService(IVehicleInspector inspector) {
        this.inspector = inspector;
    }

    
    static {
        String viProp = System.getProperty("vi");
        IVehicleInspector inspector = VehicleFactory.getVehicleInspector(viProp);
        instance = new Act2VehicleService(inspector);
    }

    public static Act2VehicleService getInstance() {
        return instance;
    }

    public int calculateTotal(IVehicle[] vehicles) {
        int total = 0;
        for (IVehicle vehicle : vehicles) {
            total += vehicle.accept(inspector);
        }
        return total;
    }
}
