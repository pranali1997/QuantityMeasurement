package quantityMeasurement;

import java.util.HashMap;
import java.util.Map;

public class UnitConversion {

    private final Double length;
    Map<UnitMeasurement.UnitType, Double> conversion=new HashMap<>();

    public UnitConversion(UnitMeasurement first) {
        length=first.value;
        conversion.put(UnitMeasurement.UnitType.FEET, 1*12.0);
        conversion.put(UnitMeasurement.UnitType.INCH,1.0);
        conversion.put(UnitMeasurement.UnitType.YARD,36.0);
        conversion.put(UnitMeasurement.UnitType.CENTIMETER,1/2.5);
        conversion.put(UnitMeasurement.UnitType.GALLON,3.785);
        conversion.put(UnitMeasurement.UnitType.LITRE,1.0);
        conversion.put(UnitMeasurement.UnitType.MILILITER,1/1000.0);
        conversion.put(UnitMeasurement.UnitType.Tonne,1000.0);
        conversion.put(UnitMeasurement.UnitType.GRAM,1/1000.0);
        conversion.put(UnitMeasurement.UnitType.KILOGRAM,1.0);
        conversion.put(UnitMeasurement.UnitType.FAHRENHEIT,1.0);
        conversion.put(UnitMeasurement.UnitType.CELCIUS,1.0*2.12);

    }
    public double getConvertedValue(UnitMeasurement.UnitType unitType) {
        double v = this.length*this.conversion.get(unitType);
        return v;
    }



}
