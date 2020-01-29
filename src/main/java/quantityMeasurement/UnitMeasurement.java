package quantityMeasurement;

import java.util.Objects;

public class UnitMeasurement {

    public UnitType unitType;
    public Double value;

    double feet,inch;
    public UnitConv unitConv;

    public enum UnitType {
        FEET, INCH ,YARD , CENTIMETER
    }

    public enum UnitConv
    {
        FeetToInch, YardToFeet, InchToCentiemter, YardToInch, FeetToCentimeter, YardToCentimeter
    }

    public UnitMeasurement(UnitType unitType, Double value) throws quantityMeasureException {
        try {
            this.unitType = unitType;
            this.value = value;
            } catch (NullPointerException e) {
            throw new quantityMeasureException(e.getMessage(), quantityMeasureException.ExceptionType.NULL_VALUE);
        }
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
