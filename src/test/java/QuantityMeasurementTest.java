import org.junit.Assert;
import org.junit.Test;
import quantityMeasurement.UnitMeasurement;
import quantityMeasurement.quantityMeasureException;

public class QuantityMeasurementTest {

    @Test
    public void whenGivenZeroFeet_ShouldReturnTrue() throws quantityMeasureException {
        UnitMeasurement first = new UnitMeasurement(UnitMeasurement.UnitType.FEET,0.0);
        UnitMeasurement second = new UnitMeasurement(UnitMeasurement.UnitType.FEET,0.0);
        Assert.assertEquals(first,second);
    }

    @Test
    public void whenGivenNull_ShouldReturnFalse() throws quantityMeasureException {
            UnitMeasurement first = new UnitMeasurement(UnitMeasurement.UnitType.FEET,0.0);
            UnitMeasurement second = new UnitMeasurement(UnitMeasurement.UnitType.FEET,null);
            Assert.assertFalse(first.equals(second));
    }

    @Test
    public void whenGivenReference_ShouldReturntrue() throws quantityMeasureException {
        UnitMeasurement quantityMeasurement = new UnitMeasurement(UnitMeasurement.UnitType.FEET,0.0);
        Assert.assertTrue(quantityMeasurement.equals(quantityMeasurement));
    }

    @Test
    public void whenGivenFeetValue_ShouldReturnFalse() throws quantityMeasureException {

        UnitMeasurement first = new UnitMeasurement(UnitMeasurement.UnitType.FEET,1.0);
        UnitMeasurement second = new UnitMeasurement(UnitMeasurement.UnitType.FEET,1.0);
        Assert.assertEquals(first, second);

    }
//Inch Test case

    @Test
    public void whenGivenZeroInch_ShouldReturnTrue() throws quantityMeasureException {
        UnitMeasurement first = new UnitMeasurement(UnitMeasurement.UnitType.INCH,0.0);
        UnitMeasurement second = new UnitMeasurement(UnitMeasurement.UnitType.INCH,0.0);
        Assert.assertTrue(first.equals(second));
    }

    @Test
    public void whenGivenNullInInch_ShouldReturnFalse() throws quantityMeasureException {
            UnitMeasurement first = new UnitMeasurement(UnitMeasurement.UnitType.INCH,0.0);
            UnitMeasurement second = new UnitMeasurement(UnitMeasurement.UnitType.INCH,null);
            Assert.assertFalse(first.equals(second));

    }

    @Test
    public void whenGivenInchObjectReference_ShouldReturntrue() throws quantityMeasureException {
        UnitMeasurement quantityMeasurement = new UnitMeasurement(UnitMeasurement.UnitType.INCH,0.0);
        Assert.assertTrue(quantityMeasurement.equals(quantityMeasurement));
    }

    @Test
    public void whenGivenInchValue_ShouldReturnFalse() throws quantityMeasureException {
        UnitMeasurement first = new UnitMeasurement(UnitMeasurement.UnitType.INCH,1.0);
        UnitMeasurement second = new UnitMeasurement(UnitMeasurement.UnitType.INCH,1.0);
        Assert.assertEquals(first, second);
    }

    //Test Case For Feet To Inch

    @Test
    public void whenGivenZeroFeetAndZeroInch_ShouldReturnZeroInch() throws quantityMeasureException {
        UnitMeasurement first = new UnitMeasurement(UnitMeasurement.UnitType.FEET,0.0);
        double v1 = first.convertedUnitMeasurement();
        UnitMeasurement second = new UnitMeasurement(UnitMeasurement.UnitType.INCH,0.0);
       double v2=second.convertedUnitMeasurement();
        Assert.assertTrue(v1==v2);
    }

    @Test
    public void whenGivenOneFeetAndOneInch_ShouldReturnFalseInch() throws quantityMeasureException {
        UnitMeasurement first = new UnitMeasurement(UnitMeasurement.UnitType.FEET,1.0);
        double v1 = first.convertedUnitMeasurement();
        UnitMeasurement second = new UnitMeasurement(UnitMeasurement.UnitType.INCH,1.0);
        double v2=second.convertedUnitMeasurement();
       Assert.assertTrue(v1!=v2);
    }

    @Test
    public void whenGivenOneInchAndOneFeet_ShouldReturnFalseInch() throws quantityMeasureException {
        UnitMeasurement first = new UnitMeasurement(UnitMeasurement.UnitType.FEET,1.0);
        double v1 = first.convertedUnitMeasurement();
        UnitMeasurement second = new UnitMeasurement(UnitMeasurement.UnitType.INCH,1.0);
        double v2=second.convertedUnitMeasurement();
        Assert.assertTrue(v1!=v2);
    }

    @Test
    public void whenGivenOnefeetAndTwelveInch_ShouldReturnTrue() throws quantityMeasureException {
        UnitMeasurement first = new UnitMeasurement(UnitMeasurement.UnitType.FEET,1.0);
        double v1 = first.convertUnitMeasureInchToFeet();
        UnitMeasurement second = new UnitMeasurement(UnitMeasurement.UnitType.INCH,12.0);
        double v2=second.convertUnitMeasureInchToFeet();
        Assert.assertEquals(v1,v2,0.0);
    }




}
