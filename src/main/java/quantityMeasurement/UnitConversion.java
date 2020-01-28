package quantityMeasurement;

public class UnitConversion {
    private  UnitMeasurement.UnitType unitType;
    double feet,inch,yard;


public double getUnitConversion(UnitMeasurement obj ,UnitMeasurement.UnitConv unitConv) {
     if (unitConv == unitConv.FeetToInch) {
        if (obj.unitType == UnitMeasurement.UnitType.FEET) {
            inch = obj.value * 12;
            return inch;
        }
        return obj.value;
    }
    else if (unitConv==unitConv.YardToInch){
        if (obj.unitType== UnitMeasurement.UnitType.YARD){
            inch=obj.value*36;
            return inch;
        }
        return obj.value;
    }
    return 0;
}
}
