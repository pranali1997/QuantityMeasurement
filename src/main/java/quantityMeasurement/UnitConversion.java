package quantityMeasurement;

public class UnitConversion {

    double feet,inch,yard, centimeter,litre;
    private double kilogram;

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
    else if (unitConv==unitConv.CentimeterToInch){
        if (obj.unitType== UnitMeasurement.UnitType.CENTIMETER){
            inch=obj.value/2.5;
            return inch;
        }
        return obj.value;
     }
    else if (unitConv==unitConv.GallonToLitre){
        if(obj.unitType==UnitMeasurement.UnitType.GALLON){
            litre =obj.value*3.785;
            return litre;
        }
        return obj.value;
     }
     else if (unitConv==unitConv.MililitreToLitre){
         if(obj.unitType==UnitMeasurement.UnitType.MILILITER){
             litre =obj.value/1000.0;
             return litre;
         }
         return obj.value;
     }
     else if (unitConv==unitConv.GramToKilogram){
         if (obj.unitType== UnitMeasurement.UnitType.GRAM){
             kilogram=obj.value/1000.0;
             return kilogram;
         }
         return obj.value;
     }
     else if (unitConv==unitConv.TonneToKilogram){
         if (obj.unitType== UnitMeasurement.UnitType.Tonne){
             kilogram=obj.value*1000.0;
             return kilogram;
         }
         return obj.value;
     }
     else if (unitConv==unitConv.TonneAndGmToKilogram){
         if (obj.unitType== UnitMeasurement.UnitType.Tonne){
             kilogram=obj.value*1000.0;
             return kilogram;
         }
         else
             kilogram=obj.value/1000.0;
             return kilogram;


     }


    return 0;
}

}
