import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import quantityMeasurement.QuantityMeasureException;
import quantityMeasurement.UnitAddition;
import quantityMeasurement.UnitConversion;
import quantityMeasurement.UnitMeasurement;

import static org.mockito.Mockito.when;

public class QuantityMeasurementAdditionMockitoTest {

    @Mock
    UnitConversion unitConversionMock;

    @Rule
    public MockitoRule mockitoRule= MockitoJUnit.rule();

    @Test
    public void whenGivenTwoInchValues_ShouldReturnAdditionInInchUsingMockito() throws QuantityMeasureException {
        UnitMeasurement first=new UnitMeasurement("LENGTH",UnitMeasurement.UnitType.INCH,2.0);
        UnitMeasurement second=new UnitMeasurement("LENGTH",UnitMeasurement.UnitType.INCH,2.0);
        when()
        double add=new UnitAddition().getAddition(first,second);
        Assert.assertTrue(first.equals(second));
        Assert.assertEquals(4.0,add,0.0);
    }

}
