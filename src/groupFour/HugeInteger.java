package groupFour;

public class HugeInteger {

    private static String number;

    public HugeInteger(String number){
        isValid(number);
        HugeInteger.number = number;
    }

    private static String getNumber(){
        return number;
    }

    private static void isValid(String number){
        if(!number.matches("^\\d{1,40}$"))
            throw new IllegalArgumentException("Invalid Input");
    }

    public static int [] parse(String number){
        isValid(number);
        int [] numberArray = new int[number.length()];
        for(int count = 0; count < numberArray.length; count ++)
            numberArray[count] = number.charAt(count) - 48;


        return numberArray;
    }


    public static String toString(int [] numbersArray){
        String output = "[";
        for(int count = 0; count < numbersArray.length; count ++){
            output += String.valueOf(numbersArray[count]);
            if(count < numbersArray.length - 1) output += ", ";
        }

        output += "]";
        return output;
    }

    public static boolean isEqualTo(String newNumber){
        int [] available = HugeInteger.parse(HugeInteger.getNumber());
        int [] comparedTo = HugeInteger.parse(newNumber);

        int availableLength = available.length;
        int comparedToLength = comparedTo.length;


        for(int digit : available){
            if(digit != 0){
                break;
            }

            availableLength --;
        }

        for(int digit : comparedTo) {
            if(digit != 0){
                break;
            }
            comparedToLength --;
        }

        if(availableLength == comparedToLength){
            boolean isEqual = true;
            for(int index = 0; index < availableLength; index ++){
                if(available[available.length-1-index] != comparedTo[comparedTo.length-1-index]){
                    isEqual = false;
                    break;
                }
            }

            return isEqual;
        }

        return false;
    }

    public static boolean isGreaterThan(String newNumber){
        int [] available = HugeInteger.parse(HugeInteger.getNumber());
        int [] comparedTo = HugeInteger.parse(newNumber);

        int availableLength = available.length;
        int comparedToLength = comparedTo.length;


        for(int digit : available){
            if(digit != 0)
                break;

            availableLength --;
        }

        for(int digit : comparedTo) {
            if(digit != 0)
                break;

            comparedToLength --;
        }

        if (availableLength > comparedToLength) return true;

        if(availableLength == comparedToLength){
            boolean isEqual = true;
            for(int index = availableLength; index > 0; index --){
                if((available[available.length-index]) < (comparedTo[comparedTo.length-index])){
                    isEqual = false;
                    break;
                }
            }

            return isEqual;
        }
        return false;
    }

    public static boolean isLessThan(String newNumber){
        int [] available = HugeInteger.parse(HugeInteger.getNumber());
        int [] comparedTo = HugeInteger.parse(newNumber);

        int availableLength = available.length;
        int comparedToLength = comparedTo.length;


        for(int digit : available){
            if(digit != 0){
                break;
            }

            availableLength --;
        }

        for(int digit : comparedTo) {
            if(digit != 0){
                break;
            }
            comparedToLength --;
        }

        if (availableLength < comparedToLength) return true;

        if(availableLength == comparedToLength){
            boolean isEqual = true;
            for(int index = availableLength; index > 0; index --){
                if((available[available.length-index]) > (comparedTo[comparedTo.length-index])){
                    isEqual = false;
                    break;
                }
            }

            return isEqual;
        }
        return false;
    }

    public static boolean isGreaterThanOrEqualTo(String newNumber){
       return isGreaterThan(newNumber) || isEqualTo(newNumber);
    }

    public static boolean isLessThanOrEqualTo(String newNumber){
        return isLessThan(newNumber) || isEqualTo(newNumber);
    }

}
