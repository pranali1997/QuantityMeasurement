import org.junit.Assert;
import org.junit.Test;
import quantityMeasurement.UnitConversion;
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
        UnitConversion unit = new UnitConversion();
        double v1 = unit.getUnitConversion(first,UnitMeasurement.UnitConv.FeetToInch);
        UnitMeasurement second = new UnitMeasurement(UnitMeasurement.UnitType.INCH,0.0);
       double v2=unit.getUnitConversion(second,UnitMeasurement.UnitConv.FeetToInch);
        Assert.assertTrue(v1==v2);
    }

    @Test
    public void whenGivenOneFeetAndOneInch_ShouldReturnFalseInch() throws quantityMeasureException {
        UnitMeasurement first = new UnitMeasurement(UnitMeasurement.UnitType.FEET,1.0);
        UnitConversion unit = new UnitConversion();
        double v1 = unit.getUnitConversion(first,UnitMeasurement.UnitConv.FeetToInch);
        UnitMeasurement second = new UnitMeasurement(UnitMeasurement.UnitType.INCH,1.0);
        double v2=unit.getUnitConversion(second,UnitMeasurement.UnitConv.FeetToInch);
       Assert.assertTrue(v1!=v2);
    }

    @Test
    public void whenGivenOneInchAndOneFeet_ShouldReturnFalseInch() throws quantityMeasureException {
        UnitMeasurement first = new UnitMeasurement(UnitMeasurement.UnitType.FEET,1.0);
        UnitConversion unit = new UnitConversion();
        double v1 = unit.getUnitConversion(first,UnitMeasurement.UnitConv.FeetToInch);
        UnitMeasurement second = new UnitMeasurement(UnitMeasurement.UnitType.INCH,1.0);
        double v2=unit.getUnitConversion(second,UnitMeasurement.UnitConv.FeetToInch);
        Assert.assertTrue(v1!=v2);
    }

    @Test
    public void whenGivenOnefeetAndTwelveInch_ShouldReturnTrue() throws quantityMeasureException {
        UnitMeasurement first = new UnitMeasurement(UnitMeasurement.UnitType.FEET,1.0);
        UnitConversion unit = new UnitConversion();
        double v1 = unit.getUnitConversion(first,UnitMeasurement.UnitConv.FeetToInch);
        UnitMeasurement second = new UnitMeasurement(UnitMeasurement.UnitType.INCH,12.0);
        double v2=unit.getUnitConversion(second,UnitMeasurement.UnitConv.FeetToInch);
        Assert.assertTrue(v1==v2);
    }

    //Added Test Cases For Yard Conversion

    @Test
    public void whenGivenThreefeetAndOneYard_ShouldReturnTrue() throws quantityMeasureException {
        UnitMeasurement first = new UnitMeasurement(UnitMeasurement.UnitType.FEET,3.0);
        UnitConversion unit = new UnitConversion();
        double v1 = unit.getUnitConversion(first,UnitMeasurement.UnitConv.FeetToInch);
        UnitMeasurement second = new UnitMeasurement(UnitMeasurement.UnitType.YARD,1.0);
        double v2=unit.getUnitConversion(second,UnitMeasurement.UnitConv.YardToInch);
        Assert.assertTrue(v1==v2);
    }

    @Test
    public void whenGivenOnefeetAndOneYard_ShouldReturnFalse() throws quantityMeasureException {
        UnitMeasurement first = new UnitMeasurement(UnitMeasurement.UnitType.FEET,1.0);
        UnitConversion unit = new UnitConversion();
        double v1 = unit.getUnitConversion(first,UnitMeasurement.UnitConv.FeetToInch);
        UnitMeasurement second = new UnitMeasurement(UnitMeasurement.UnitType.YARD,1.0);
        double v2=unit.getUnitConversion(second,UnitMeasurement.UnitConv.YardToInch);
        Assert.assertTrue(v1!=v2);
    }

    @Test
    public void whenGivenOneInchAndOneYard_ShouldReturnFalse() throws quantityMeasureException {
        UnitMeasurement first = new UnitMeasurement(UnitMeasurement.UnitType.INCH,1.0);
        UnitConversion unit = new UnitConversion();
        double v1 = unit.getUnitConversion(first,UnitMeasurement.UnitConv.YardToInch);
        UnitMeasurement second = new UnitMeasurement(UnitMeasurement.UnitType.YARD,1.0);
        double v2=unit.getUnitConversion(second,UnitMeasurement.UnitConv.YardToInch);
        Assert.assertTrue(v1!=v2);
    }

    @Test
    public void whenGivenThirtySixInchAndOneYard_ShouldReturnTrue() throws quantityMeasureException {
        UnitMeasurement first = new UnitMeasurement(UnitMeasurement.UnitType.INCH,36.0);
        UnitConversion unit = new UnitConversion();
        double v1 = unit.getUnitConversion(first,UnitMeasurement.UnitConv.YardToInch);
        UnitMeasurement second = new UnitMeasurement(UnitMeasurement.UnitType.YARD,1.0);
        double v2=unit.getUnitConversion(second,UnitMeasurement.UnitConv.YardToInch);
        Assert.assertTrue(v1==v2);
    }

    @Test
    public void whenGivenTwoInchAndFiveCentimeter_ShouldReturnTrue() throws quantityMeasureException {
        UnitMeasurement first = new UnitMeasurement(UnitMeasurement.UnitType.INCH,2.0);
        UnitConversion unit = new UnitConversion();
        double v1 = unit.getUnitConversion(first,UnitMeasurement.UnitConv.CentimeterToInch);
        UnitMeasurement second = new UnitMeasurement(UnitMeasurement.UnitType.CENTIMETER,5.0);
        double v2=unit.getUnitConversion(second,UnitMeasurement.UnitConv.CentimeterToInch);
        Assert.assertTrue(v1==v2);
    }

    @Test
    public void whenGivenOneGallon_ShouldReturnInTrue() throws quantityMeasureException {
        UnitMeasurement first = new UnitMeasurement(UnitMeasurement.UnitType.GALLON,  1.0);
        UnitConversion unit = new UnitConversion();
        double v1 = unit.getUnitConversion(first,UnitMeasurement.UnitConv.GallonToLitre);
        UnitMeasurement second = new UnitMeasurement(UnitMeasurement.UnitType.LITRE,3.785);
        double v2=unit.getUnitConversion(second,UnitMeasurement.UnitConv.GallonToLitre);
        Assert.assertTrue(v1==v2);
    }

    @Test
    public void whenGivenOneLitreAndThousandMililiter_ShouldReturnTrue() throws quantityMeasureException {
        UnitMeasurement first = new UnitMeasurement(UnitMeasurement.UnitType.LITRE,  1.0);
        UnitConversion unit = new UnitConversion();
        double v1 = unit.getUnitConversion(first,UnitMeasurement.UnitConv.MililitreToLitre);
        UnitMeasurement second = new UnitMeasurement(UnitMeasurement.UnitType.MILILITER,1000.0);
        double v2=unit.getUnitConversion(second,UnitMeasurement.UnitConv.MililitreToLitre);
        Assert.assertTrue(v1==v2);
    }

    @Test
    public void whenGivenOnekgAndThousandGrams_ShouldReturnTrue() throws quantityMeasureException {
        UnitMeasurement first = new UnitMeasurement(UnitMeasurement.UnitType.KILOGRAM,  1.0);
        UnitConversion unit = new UnitConversion();
        double v1 = unit.getUnitConversion(first,UnitMeasurement.UnitConv.GramToKilogram);
        UnitMeasurement second = new UnitMeasurement(UnitMeasurement.UnitType.GRAM,1000.0);
        double v2=unit.getUnitConversion(second,UnitMeasurement.UnitConv.GramToKilogram);
        Assert.assertTrue(v1==v2);
    }


    @Test
    public void whenGivenOneTonneAndThousandKilograms_ShouldReturnTrue() throws quantityMeasureException {
        UnitMeasurement first = new UnitMeasurement(UnitMeasurement.UnitType.Tonne,  1.0);
        UnitConversion unit = new UnitConversion();
        double v1 = unit.getUnitConversion(first,UnitMeasurement.UnitConv.TonneToKilogram);
        UnitMeasurement second = new UnitMeasurement(UnitMeasurement.UnitType.KILOGRAM,1000.0);
        double v2=unit.getUnitConversion(second,UnitMeasurement.UnitConv.TonneToKilogram);
        Assert.assertTrue(v1==v2);
    }


}
