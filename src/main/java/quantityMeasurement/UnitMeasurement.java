package quantityMeasurement;

public class UnitMeasurement {

    public String unit;
    public UnitType unitType;
    public Double value;

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

    public UnitMeasurement(String unit, UnitType unitType, Double value) throws QuantityMeasureException {
        try {
            this.unitType = unitType;
            this.value = value;
            this.unit =unit;
        } catch (NullPointerException e) {
            throw new QuantityMeasureException(e.getMessage(), QuantityMeasureException.ExceptionType.NULL_VALUE);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnitMeasurement that = (UnitMeasurement) o;
        unitType = that.unitType;
        if(unit.equals(that.unit)){
        return unitType == that.unitType;
        }
        return false;
    }



}
