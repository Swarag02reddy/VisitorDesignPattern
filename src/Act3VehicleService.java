public class Act3VehicleService {
    private static final Act3VehicleService instance;
    private IVehicleInspector inspector;
    private IEmissionsStrategy emissionsStrategy;

    
    private Act3VehicleService(IVehicleInspector inspector, IEmissionsStrategy emissionsStrategy) {
        this.inspector = inspector;
        this.emissionsStrategy = emissionsStrategy;
    }

    
    static {
        String viProp = System.getProperty("vi");
        IVehicleInspector inspector = VehicleFactory.getVehicleInspector(viProp);

        String esProp = System.getProperty("es");
        IEmissionsStrategy emissionsStrategy;
        if (esProp != null) {
            if (esProp.equalsIgnoreCase("one")) {
                emissionsStrategy = new OneEmissionsStrategy();
            } else if (esProp.equalsIgnoreCase("two")) {
                emissionsStrategy = new TwoEmissionsStrategy();
            } else {
                emissionsStrategy = new NullEmissionsStrategy();
            }
        } else {
            emissionsStrategy = new NullEmissionsStrategy();
        }
        instance = new Act3VehicleService(inspector, emissionsStrategy);
    }

    public static Act3VehicleService getInstance() {
        return instance;
    }

    public int calculateTotal(IVehicle[] vehicles) {
        int total = 0;
        for (IVehicle vehicle : vehicles) {
            total += vehicle.accept(inspector) + emissionsStrategy.computeEmissionsFee(vehicle);
        }
        return total;
    }
}
