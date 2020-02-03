import org.junit.Assert;
import org.junit.Test;
import quantityMeasurement.UnitAddition;
import quantityMeasurement.UnitMeasurement;
import quantityMeasurement.quantityMeasureException;

public class UnitAdditionTest {

    @Test
    public void whenGivenTwoInchValues_ShouldReturnAdditionInInch() throws quantityMeasureException {
        UnitMeasurement first=new UnitMeasurement("LENGTH",UnitMeasurement.UnitType.INCH,2.0);
        UnitMeasurement second=new UnitMeasurement("LENGTH",UnitMeasurement.UnitType.INCH,2.0);
        double add=new UnitAddition().getAddition(first,second);
        Assert.assertTrue(first.equals(second));
        Assert.assertEquals(4.0,add,0.0);
    }

    @Test
    public void whenGivenOneFeetTwoInchValues_ShouldReturnAdditionInInch() throws quantityMeasureException {
        UnitMeasurement first=new UnitMeasurement("LENGTH",UnitMeasurement.UnitType.FEET,1.0);
        UnitMeasurement second=new UnitMeasurement("LENGTH",UnitMeasurement.UnitType.INCH,2.0);
        double add=new UnitAddition().getAddition(first,second);
        Assert.assertTrue(first.equals(second));
        Assert.assertEquals(14.0,add,0.0);
    }

    @Test
    public void whenGivenOneFeetOneFeetValues_ShouldReturnAdditionInInch() throws quantityMeasureException {
        UnitMeasurement first=new UnitMeasurement("LENGTH",UnitMeasurement.UnitType.FEET,1.0);
        UnitMeasurement second=new UnitMeasurement("LENGTH",UnitMeasurement.UnitType.FEET,1.0);
        double add=new UnitAddition().getAddition(first,second);
        Assert.assertTrue(first.equals(second));
        Assert.assertEquals(24.0,add,0.0);
    }

    @Test
    public void whenGivenTwoInchTwoPointFiveCm_ShouldReturnAdditionInInch() throws quantityMeasureException {
        UnitMeasurement first=new UnitMeasurement("LENGTH",UnitMeasurement.UnitType.INCH,2.0);
        UnitMeasurement second=new UnitMeasurement("LENGTH",UnitMeasurement.UnitType.CENTIMETER,2.5);
        double add=new UnitAddition().getAddition(first,second);
        Assert.assertTrue(first.equals(second));
        Assert.assertEquals(3.0,add,0.0);
    }

    @Test
    public void whenGivenGallonAndLitre_ShouldReturnAdditionInLitre() throws quantityMeasureException {
        UnitMeasurement first=new UnitMeasurement("VOLUMN",UnitMeasurement.UnitType.GALLON,1.0);
        UnitMeasurement second=new UnitMeasurement("VOLUMN",UnitMeasurement.UnitType.LITRE,3.78);
        double add=new UnitAddition().getAddition(first,second);
        Assert.assertTrue(first.equals(second));
       Assert.assertEquals(7.5649999999999995,add,0.0);
    }


    @Test
    public void whenGivenLitreAndMiliLitre_ShouldReturnAdditionInLitre() throws quantityMeasureException {
        UnitMeasurement first=new UnitMeasurement("VOLUMN",UnitMeasurement.UnitType.LITRE,1.0);
        UnitMeasurement second=new UnitMeasurement("VOLUMN",UnitMeasurement.UnitType.MILILITER,1000.0);
        double add=new UnitAddition().getAddition(first,second);
        Assert.assertTrue(first.equals(second));
        Assert.assertEquals(2.0,add,0.0);
    }

    @Test
    public void whenGivenTonneAndGram_ShouldReturnAdditionInKilogram() throws quantityMeasureException {
        UnitMeasurement first=new UnitMeasurement("MASS",UnitMeasurement.UnitType.Tonne,1.0);
        UnitMeasurement second=new UnitMeasurement("MASS",UnitMeasurement.UnitType.GRAM,1000.0);
        double add=new UnitAddition().getAddition(first,second);
        Assert.assertTrue(first.equals(second));
        Assert.assertEquals(1001.0,add,0.0);
    }

    @Test
    public void whenGivenTonneAndGramWithLengthUnit_ShouldReturnAdditionInKilogram() throws quantityMeasureException {
        UnitMeasurement first=new UnitMeasurement("MASS",UnitMeasurement.UnitType.Tonne,1.0);
        UnitMeasurement second=new UnitMeasurement("LENGTH",UnitMeasurement.UnitType.GRAM,1000.0);
        double add=new UnitAddition().getAddition(first,second);
        Assert.assertFalse(first.equals(second));
        Assert.assertEquals(1001.0,add,0.0);
    }

    @Test
    public void whenGivenOneFeetWithMassTwoInch_ShouldReturnAdditionInInch() throws quantityMeasureException {
        UnitMeasurement first=new UnitMeasurement("MASS",UnitMeasurement.UnitType.FEET,1.0);
        UnitMeasurement second=new UnitMeasurement("LENGTH",UnitMeasurement.UnitType.INCH,2.0);
        double add=new UnitAddition().getAddition(first,second);
        Assert.assertFalse(first.equals(second));
        Assert.assertEquals(14.0,add,0.0);
    }

}
