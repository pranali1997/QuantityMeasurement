package quantityMeasurement;

public class UnitAddition {
    public double getAddition(UnitMeasurement first, UnitMeasurement second) {
        UnitConversion unit = new UnitConversion();
        double value1 = unit.getUnitConversion(first,UnitMeasurement.UnitConv.FeetToInch);
        double value2=unit.getUnitConversion(second,UnitMeasurement.UnitConv.FeetToInch);
        double totalAddition=value1+value2;
        return totalAddition;
    }
}
