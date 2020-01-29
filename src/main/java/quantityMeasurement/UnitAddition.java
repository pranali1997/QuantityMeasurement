package quantityMeasurement;

public class UnitAddition {
    public double getAddition(UnitMeasurement first, UnitMeasurement second,UnitMeasurement.UnitConv unitConv) {
        UnitConversion unit = new UnitConversion();
        double value1 = unit.getUnitConversion(first,unitConv);
        double value2=unit.getUnitConversion(second,unitConv);
        double totalAddition=value1+value2;
        return totalAddition;
    }
}
