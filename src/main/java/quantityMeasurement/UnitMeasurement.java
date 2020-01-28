package quantityMeasurement;

import java.util.Objects;

public class UnitMeasurement {

    private UnitType unitType;
    private Double value;

    double feet,inch;
    private UnitConv unitConv;

    public enum UnitType {
        FEET, INCH
    }

    public enum UnitConv
    {
        InchToFeet,FeetToInch
    }

    public UnitMeasurement(UnitType unitType, Double value) throws quantityMeasureException {

        try {
            this.unitType = unitType;
            this.value = value;

        } catch (NullPointerException e) {
            throw new quantityMeasureException(e.getMessage(), quantityMeasureException.ExceptionType.NULL_VALUE);
        }

    }

    public double convertUnitMeasureInchToFeet(UnitConv unitConv) {
        if (unitConv == unitConv.InchToFeet) {
            if (unitType == UnitType.INCH) {
                feet = value / 12;
                return feet;
            }
            return value;
        }
        else if (unitConv == unitConv.FeetToInch) {
            if (unitType == UnitType.FEET) {
                inch = value * 12;
                return inch;
            }
            return value;
        }
        return 0;
        }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnitMeasurement that = (UnitMeasurement) o;
        return Double.compare(that.feet, feet) == 0 &&
                Double.compare(that.inch, inch) == 0 &&
                unitType == that.unitType &&
                Objects.equals(value, that.value) &&
                unitConv == that.unitConv;
    }


}
