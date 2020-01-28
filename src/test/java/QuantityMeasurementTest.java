import org.junit.Assert;
import org.junit.Test;
import quantityMeasurement.FeetMeasurement;
import quantityMeasurement.InchMeasurement;
import quantityMeasurement.quantityMeasureException;

public class QuantityMeasurementTest {

    @Test
    public void whenGivenZeroFeet_ShouldReturnTrue() throws quantityMeasureException {
        FeetMeasurement first = new FeetMeasurement(0.0);
        FeetMeasurement second = new FeetMeasurement(0.0);
        Assert.assertTrue(first.equals(second));
    }

    @Test
    public void whenGivenNull_ShouldReturnFalse() throws quantityMeasureException {
        try {
            FeetMeasurement first = new FeetMeasurement(0.0);
            FeetMeasurement second = new FeetMeasurement(null);
            Assert.assertTrue(first.equals(second));
        } catch (quantityMeasureException e) {

        }
    }

    @Test
    public void whenGivenReference_ShouldReturntrue() throws quantityMeasureException {
        FeetMeasurement quantityMeasurement = new FeetMeasurement(0.0);
        Assert.assertTrue(quantityMeasurement.equals(quantityMeasurement));
    }

    @Test
    public void whenGivenFeetValue_ShouldReturnFalse() throws quantityMeasureException {

        FeetMeasurement first = new FeetMeasurement(1.0);
        FeetMeasurement second = new FeetMeasurement(1.0);
        Assert.assertEquals(first, second);

    }
////Inch Test case

    @Test
    public void whenGivenZeroInch_ShouldReturnTrue() throws quantityMeasureException {
        InchMeasurement first = new InchMeasurement(0.0);
        InchMeasurement second = new InchMeasurement(0.0);
        Assert.assertTrue(first.equals(second));
    }

    @Test
    public void whenGivenNullInInch_ShouldReturnFalse() throws quantityMeasureException {
        try {
            InchMeasurement first = new InchMeasurement(0.0);
            InchMeasurement second = new InchMeasurement(null);
            Assert.assertTrue(first.equals(second));
        } catch (quantityMeasureException e) {

        }
    }

    @Test
    public void whenGivenInchObjectReference_ShouldReturntrue() throws quantityMeasureException {
        InchMeasurement quantityMeasurement = new InchMeasurement(0.0);
        Assert.assertTrue(quantityMeasurement.equals(quantityMeasurement));
    }

    @Test
    public void whenGivenInchValue_ShouldReturnFalse() throws quantityMeasureException {

        InchMeasurement first = new InchMeasurement(1.0);
        InchMeasurement second = new InchMeasurement(1.0);
        Assert.assertEquals(first, second);

    }
}
