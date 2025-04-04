public class VehicleFactory {
    
    private VehicleFactory() { }

    public static IVehicleInspector getVehicleInspector(String prop) {
        if (prop != null && prop.equalsIgnoreCase("alt")) {
            return new AltVehicleInspection();
        }
        return new VehicleInspection();
    }
}
