package quantityMeasurement;

import java.util.Objects;

public class InchMeasurement {

    public double inch;

    public InchMeasurement( Double inch) throws quantityMeasureException {
        try {
            this.inch = inch;
        }catch (NullPointerException q){
            throw new quantityMeasureException(q.getMessage(), quantityMeasureException.ExceptionType.NULL_VALUE);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InchMeasurement that = (InchMeasurement) o;
        return Double.compare(that.inch, inch) == 0;
    }

}
