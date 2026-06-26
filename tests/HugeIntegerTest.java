import groupFour.HugeInteger;
import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;


public class HugeIntegerTest {

    @Test
    public void testForMethodParse(){

        int [] actual = HugeInteger.parse("43268968268");
        int [] expected = {4, 3, 2, 6, 8, 9, 6, 8, 2, 6, 8};

        assertArrayEquals(actual, expected);
    }


    @Test
    public void testThatIfAnyOtherCharacterOrLetterIsPassedIntoMethodParseErrorIsThrown(){
        String number = "28648$o8888888888888888888888888888888888888888888888888888888888973";

        assertThrows(IllegalArgumentException.class, () -> {
            HugeInteger.parse(number);
        });
    }


    @Test
    public void testForToStringMethod(){
        int [] numbers = {2, 8, 6, 4, 8, 9, 3, 9, 7, 3,};

        String actual = HugeInteger.toString(numbers);
        String expected = "[2, 8, 6, 4, 8, 9, 3, 9, 7, 3]";

        assertEquals(actual, expected);
    }

    @Test
    public void testThatIsEquals_ReturnsTrueIfTwoArraysAreEqual(){

        HugeInteger hugeInteger = new HugeInteger("245697");


        boolean actual = hugeInteger.isEqualTo("245697");
        boolean expected = true;

        assertEquals(actual, expected);
    }

    @Test
    public void testThatIsEquals_ReturnsTrueIfTwoArraysWithEitherHavingLeadingZerosAreEqual(){

        HugeInteger hugeInteger = new HugeInteger("0000000245697");


        boolean actual = hugeInteger.isEqualTo("245697");
        boolean expected = true;

        assertEquals(actual, expected);
    }

    @Test
    public void testThatIsEquals_ReturnsFalseIfTwoNumbersAreNotTheSameLength(){
        HugeInteger hugeInteger = new HugeInteger("45697");


        boolean actual = hugeInteger.isEqualTo("245697");
        boolean expected = false;

        assertEquals(actual, expected);
    }

    @Test
    public void testThatIsEquals_ReturnsFalseIfTwoNumbersAreNotTheSame(){
        HugeInteger hugeInteger = new HugeInteger("245597");


        boolean actual = hugeInteger.isEqualTo("245697");
        boolean expected = false;

        assertEquals(actual, expected);
    }

//    @Test
//    public void testThatIfTheLengthOfTheTwoArraysAreNotEqual_ErrorIsThrown(){
//        int [] firstArray = {2, 4, 5, 6, 9, 7};
//        int [] secondArray = {1,2, 3, 4};
//
//        HugeInteger h1 = new HugeInteger("1234");
//
//        System.out.println(h1);
//        HugeInteger h2 = new HugeInteger("1234");
//
//        assertTrue(h1.isEqualTo(secondArray));

//        boolean actual = firstArray.isEqualTo(secondArray);
//        boolean expected = true;

//        assertThrows(IllegalArgumentException.class, () -> {
//            hugeInteger.isEqualTo(firstArray, secondArray);
//        });
//
//        assertEquals(actual, expected);
//    }


    @Test
    public void testThatMethodIsGreaterThan_ReturnsTrueIfTheFirstArrayIsLargerThanTheSecondArray(){
        HugeInteger hugeInteger = new HugeInteger("345697");


        boolean actual = hugeInteger.isGreaterThan("245697");
        boolean expected = true;

        assertEquals(actual, expected);
    }
//
//
//    @Test
//    public void testThatIfTheSecondArrayToBeComparedIsNull_AnErrorIsThrown(){
//        int [] firstArray = {7, 4, 5, 6, 9, 7};
//        int [] secondArray = {};
//
//        assertThrows(IllegalArgumentException.class, () -> {
//            hugeInteger.isGreaterThan(firstArray, secondArray);
//        });
//    }
//
//
    @Test
    public void testThatMethodIsLessThan_ReturnsTrueIfTheFirstArrayIsLargerThanTheSecondArray(){
        HugeInteger hugeInteger = new HugeInteger("145697");


        boolean actual = hugeInteger.isLessThan("245697");
        boolean expected = true;

        assertEquals(actual, expected);
    }

    @Test
    public void testGreaterThanOrEqualTo_returnsTrueWhenItIsGreaterThanComparedTo(){

        HugeInteger hugeInteger = new HugeInteger("845697");


        boolean actual = hugeInteger.isGreaterThanOrEqualTo("245697");
        boolean expected = true;

        assertEquals(actual, expected);

    }

    @Test
    public void testGreaterThanOrEqualTo_returnsTrueWhenItIsEqualToComparedTo(){

        HugeInteger hugeInteger = new HugeInteger("845697");


        boolean actual = hugeInteger.isGreaterThanOrEqualTo("845697");
        boolean expected = true;

        assertEquals(actual, expected);

    }

    @Test
    public void testGreaterThanOrEqualTo_returnsFalseWhenItIsNotEqualOrGreaterThanComparedTo(){

        HugeInteger hugeInteger = new HugeInteger("445697");


        boolean actual = hugeInteger.isGreaterThanOrEqualTo("845697");
        boolean expected = false;

        assertEquals(actual, expected);

    }

    @Test
    public void testLessThanOrEqualTo_returnsTrueWhenItIsLessThanComparedTo(){

        HugeInteger hugeInteger = new HugeInteger("845697");


        boolean actual = hugeInteger.isGreaterThanOrEqualTo("245697");
        boolean expected = true;

        assertEquals(actual, expected);

    }

    @Test
    public void testLessThanOrEqualTo_returnsTrueWhenItIsEqualToComparedTo(){

        HugeInteger hugeInteger = new HugeInteger("845697");


        boolean actual = hugeInteger.isLessThanOrEqualTo("845697");
        boolean expected = true;

        assertEquals(actual, expected);

    }

    @Test
    public void testLessThanOrEqualTo_returnsFalseWhenItIsNotEqualOrLessThanComparedTo(){

        HugeInteger hugeInteger = new HugeInteger("945697");


        boolean actual = hugeInteger.isLessThanOrEqualTo("845697");
        boolean expected = false;

        assertEquals(actual, expected);

    }

}
