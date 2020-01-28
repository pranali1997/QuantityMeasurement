package quantityMeasurement;

public class FeetMeasurement {

    public double feet;

    public FeetMeasurement( Double feet) throws quantityMeasureException {
        try {
            this.feet = feet;
        }catch (NullPointerException q){
            throw new quantityMeasureException(q.getMessage(), quantityMeasureException.ExceptionType.NULL_VALUE);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FeetMeasurement that = (FeetMeasurement) o;
        return Double.compare(that.feet, feet) == 0;
    }
}
