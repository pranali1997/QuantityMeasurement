package quantityMeasurement;

public class UnitConversion {

    double feet,inch,yard, centimeter,litre;
    private double kilogram;
    private double celcius;

    public double getUnitConversion(UnitMeasurement obj ,UnitMeasurement.UnitConv unitConv) {

        if (unitConv==unitConv.LengthToInch){
            if (obj.unitType == UnitMeasurement.UnitType.FEET) {
                inch = obj.value * 12;
                return inch;
            }
            if (obj.unitType== UnitMeasurement.UnitType.YARD){
                inch=obj.value*36;
                return inch;
            }
            if (obj.unitType== UnitMeasurement.UnitType.CENTIMETER){
                inch=obj.value/2.5;
                return inch;
            }
        }

    else if (unitConv==unitConv.GallonToLitre){
        if(obj.unitType==UnitMeasurement.UnitType.GALLON){
            litre =obj.value*3.785;
            return litre;
        }
        if(obj.unitType==UnitMeasurement.UnitType.MILILITER){
            litre =obj.value/1000.0;
            return litre;
        }

        }

     else if (unitConv==unitConv.TonneAndGmToKilogram){
         if (obj.unitType== UnitMeasurement.UnitType.Tonne ){
             kilogram=obj.value*1000.0;
             return kilogram;
         }
         else  if (obj.unitType== UnitMeasurement.UnitType.GRAM ){
             kilogram = obj.value / 1000.0;
             return kilogram;
         }
     }

     else if (unitConv==unitConv.FahrenheitToCelcius){
         if (obj.unitType== UnitMeasurement.UnitType.FAHRENHEIT){
             celcius=(obj.value-32)/1.8;
             return celcius;
         }
        }
     return obj.value;
}

}
