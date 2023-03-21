public class CompareTo {
    public static void main(String[] args) {

        String s1="SMART";
        String s2="smart";
        System.out.println(s1.compareTo(s2));

        String s3="abc";
        String s4="bac";
        System.out.println(s3.compareTo(s4));

        String s5="b";
        String s6="abc";
        System.out.println(s5.compareTo(s6));


// Compare the two integers using compareTo() method
        Integer num1 = 10;
        Integer num2 = 10;
        int result = num1.compareTo(num2);
        System.out.println(result);

        if (result < 0) {
            System.out.println("num1 is lesser");
        } else if (result > 0) {
            System.out.println("num1 is greater");
        } else {
            System.out.println("equal");
        }
    }
}

