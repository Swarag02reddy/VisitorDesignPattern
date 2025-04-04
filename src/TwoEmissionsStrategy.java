public class TwoEmissionsStrategy implements IEmissionsStrategy {
    @Override
    public int computeEmissionsFee(IVehicle vehicle) {
        float emissions = vehicle.co2Emissions();
        
        return (int) Math.max(Math.min(emissions - 1100, 10), 0);
    }
}
