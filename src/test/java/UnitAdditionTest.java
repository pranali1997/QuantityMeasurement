import org.junit.Assert;
import org.junit.Test;
import quantityMeasurement.UnitAddition;
import quantityMeasurement.UnitMeasurement;
import quantityMeasurement.quantityMeasureException;

public class UnitAdditionTest {

    @Test
    public void whenGivenTwoInchValues_ShouldReturnAdditionInInch() throws quantityMeasureException {
        UnitMeasurement first=new UnitMeasurement(UnitMeasurement.UnitType.INCH,2.0);
        UnitMeasurement second=new UnitMeasurement(UnitMeasurement.UnitType.INCH,2.0);
        double add=new UnitAddition().getAddition(first,second, UnitMeasurement.UnitConv.FeetToInch);
        Assert.assertEquals(4.0,add,0.0);
    }

    @Test
    public void whenGivenOneFeetTwoInchValues_ShouldReturnAdditionInInch() throws quantityMeasureException {
        UnitMeasurement first=new UnitMeasurement(UnitMeasurement.UnitType.FEET,1.0);
        UnitMeasurement second=new UnitMeasurement(UnitMeasurement.UnitType.INCH,2.0);
        double add=new UnitAddition().getAddition(first,second, UnitMeasurement.UnitConv.FeetToInch);
        Assert.assertEquals(14.0,add,0.0);
    }

    @Test
    public void whenGivenOneFeetOneFeetValues_ShouldReturnAdditionInInch() throws quantityMeasureException {
        UnitMeasurement first=new UnitMeasurement(UnitMeasurement.UnitType.FEET,1.0);
        UnitMeasurement second=new UnitMeasurement(UnitMeasurement.UnitType.FEET,1.0);
        double add=new UnitAddition().getAddition(first,second, UnitMeasurement.UnitConv.FeetToInch);
        Assert.assertEquals(24.0,add,0.0);
    }

    @Test
    public void whenGivenTwoInchTwoPointFiveCm_ShouldReturnAdditionInInch() throws quantityMeasureException {
        UnitMeasurement first=new UnitMeasurement(UnitMeasurement.UnitType.INCH,2.0);
        UnitMeasurement second=new UnitMeasurement(UnitMeasurement.UnitType.CENTIMETER,2.5);
        double add=new UnitAddition().getAddition(first,second, UnitMeasurement.UnitConv.CentimeterToInch);
        Assert.assertEquals(3.0,add,0.0);
    }

}