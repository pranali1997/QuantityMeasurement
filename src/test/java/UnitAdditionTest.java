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

    @Test
    public void whenGivenGallonAndLitre_ShouldReturnAdditionInLitre() throws quantityMeasureException {
        UnitMeasurement first=new UnitMeasurement(UnitMeasurement.UnitType.GALLON,1.0);
        UnitMeasurement second=new UnitMeasurement(UnitMeasurement.UnitType.LITRE,3.78);
        double add=new UnitAddition().getAddition(first,second, UnitMeasurement.UnitConv.GallonToLitre);
        Assert.assertEquals(7.5649999999999995,add,0.0);
    }

    @Test
    public void whenGivenLitreAndMiliLitre_ShouldReturnAdditionInLitre() throws quantityMeasureException {
        UnitMeasurement first=new UnitMeasurement(UnitMeasurement.UnitType.LITRE,1.0);
        UnitMeasurement second=new UnitMeasurement(UnitMeasurement.UnitType.MILILITER,1000.0);
        double add=new UnitAddition().getAddition(first,second, UnitMeasurement.UnitConv.MililitreToLitre);
        Assert.assertEquals(2.0,add,0.0);
    }

    @Test
    public void whenGivenTonneAndGram_ShouldReturnAdditionInKilogram() throws quantityMeasureException {
        UnitMeasurement first=new UnitMeasurement(UnitMeasurement.UnitType.Tonne,1.0);
        UnitMeasurement second=new UnitMeasurement(UnitMeasurement.UnitType.GRAM,1000.0);
        double add=new UnitAddition().getAddition(first,second, UnitMeasurement.UnitConv.TonneAndGmToKilogram);
        Assert.assertEquals(1001.0,add,0.0);
    }


}
