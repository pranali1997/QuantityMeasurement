package quantityMeasurement;

public class UnitAddition {
    public double getAddition(UnitMeasurement first, UnitMeasurement second) {
        UnitConversion unit = new UnitConversion(first);
        double value1 = unit. getConvertedValue(first.unitType);
        UnitConversion unit1 = new UnitConversion(second);
        double value2=unit1. getConvertedValue(second.unitType);
        double totalAddition=value1+value2;
        return totalAddition;
    }
}
