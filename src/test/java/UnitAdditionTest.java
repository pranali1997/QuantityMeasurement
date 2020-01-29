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
        double add=new UnitAddition().getAddition(first,second);
        Assert.assertEquals(4.0,add,0.0);
    }
}
