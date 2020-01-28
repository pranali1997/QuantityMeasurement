package quantityMeasurement;

import java.util.Objects;

public class UnitMeasurement {

    private UnitType unitType;
    private Double value;

    double feet,inch;

    public enum UnitType {
        FEET, INCH
    }


    public UnitMeasurement(UnitType unitType, Double value) throws quantityMeasureException {

        try {
            this.unitType = unitType;
            this.value = value;

        } catch (NullPointerException e) {
            throw new quantityMeasureException(e.getMessage(), quantityMeasureException.ExceptionType.NULL_VALUE);
        }

    }

    public double convertedUnitMeasurement(){
        if (unitType==UnitType.FEET){
             inch=value*12;
             return inch;
        }
        if (unitType==UnitType.INCH){
            return value;
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnitMeasurement that = (UnitMeasurement) o;
        return unitType == that.unitType ||
                Objects.equals(value, that.value);

    }


}
