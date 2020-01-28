package quantityMeasurement;

public class UnitConversion {
    private  UnitMeasurement.UnitType unitType;
    double feet,inch;


public double getUnitConversion(UnitMeasurement obj ,UnitMeasurement.UnitConv unitConv) {
    if (unitConv == unitConv.InchToFeet) {
        if (obj.unitType == UnitMeasurement.UnitType.INCH) {
            feet = obj.value/ 12;
            return feet;
        }
        return obj.value;
    }
    else if (unitConv == unitConv.FeetToInch) {
        if (obj.unitType == UnitMeasurement.UnitType.FEET) {
            inch = obj.value * 12;
            return inch;
        }
        return obj.value;
    }
    return 0;
}
}
