public class OneEmissionsStrategy implements IEmissionsStrategy {
    @Override
    public int computeEmissionsFee(IVehicle vehicle) {
        float emissions = vehicle.co2Emissions();
        
        return (int) Math.max(emissions - 1000, 0);
    }
}
