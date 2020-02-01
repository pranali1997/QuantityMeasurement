package quantityMeasurement;

import java.util.Objects;

public class UnitMeasurement {

    public String unit;
    public UnitType unitType;
    public Double value;

    double feet, inch;


    public enum UnitType {
        FEET("LENGTH"),
        INCH("LENGTH"),
        YARD("LENGTH"),
        CENTIMETER("LENGTH"),
        LITRE("VOLUMN"),
        GALLON("VOLUMN"),
        MILILITER("VOLUMN"),
        KILOGRAM("MASS"),
        Tonne("MASS"),
        GRAM("MASS"),
        FAHRENHEIT("TEMP"),
        CELCIUS("TEMP");

        public String unit;

        UnitType(String unitParameter) {
            this.unit=unitParameter;
        }
    }

    public UnitMeasurement(String unit, UnitType unitType, Double value) throws quantityMeasureException {
        try {
            this.unitType = unitType;
            this.value = value;
            this.unit =unit;
        } catch (NullPointerException e) {
            throw new quantityMeasureException(e.getMessage(), quantityMeasureException.ExceptionType.NULL_VALUE);
        }
    }

    public boolean compare(UnitMeasurement that) {
        if (this.unitType.equals(UnitType.FEET) && that.unitType.equals(UnitType.FEET))
            return Double.compare(this.value, that.value) == 0;
        if (this.unitType.equals(UnitType.FEET) && that.unitType.equals(UnitType.INCH))
            return Double.compare(this.value, that.value) == 0;
        return false;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnitMeasurement that = (UnitMeasurement) o;
        unitType = that.unitType;
        if(unit.equals(that.unit)){
        return  Double.compare(that.feet, feet) == 0 &&
                Double.compare(that.inch, inch) == 0 &&
                unitType == that.unitType;
        }
        return false;
    }



}
