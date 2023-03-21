public class Wrapper {
    public static void main(String[] args) {
        // create an Integer wrapper object
        Integer myInt = new Integer(42);

        // convert the Integer object to an int primitive
        int myValue = myInt.intValue();
        System.out.println("Integer value: " + myValue);

        // use the parseInt method to convert a String to an int
        String myString = "123";
        int myIntValue = Integer.parseInt(myString);
        System.out.println("Parsed integer value: " + myIntValue);

        // use the valueOf method to create an Integer object from an int
        int myInt2 = 456;
        Integer myIntObject = Integer.valueOf(myInt2);
        System.out.println("Integer object value: " + myIntObject);

        // use the toString method to convert an Integer object to a String
        String myString2 = myInt.toString();
        System.out.println("String value: " + myString2);
    }
}
