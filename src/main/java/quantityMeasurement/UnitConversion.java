package quantityMeasurement;

public class UnitConversion {
    private  UnitMeasurement.UnitType unitType;
    double feet,inch,yard, centimeter;


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
    else if (unitConv==unitConv.FeetToCentimeter){
        if (obj.unitType== UnitMeasurement.UnitType.FEET){
            centimeter=obj.value*60;
        }
     }
    else if (unitConv==unitConv.YardToCentimeter){
        if (obj.unitType == UnitMeasurement.UnitType.YARD){
            centimeter=obj.value*180;
        }
     }
    else if (unitConv==unitConv.InchToCentiemter){
        if (obj.unitType== UnitMeasurement.UnitType.INCH){
            centimeter=obj.value*2.5;
            return centimeter;
        }
        return obj.value;
     }
    return 0;
}

}
