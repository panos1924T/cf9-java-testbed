package gr.aueb.cf.cf9.ch13;

public class Main {

    public static void main(String[] args) {

        int[] arr = new int[] {3, 5, 1, 6, 8};
        String str = "tettix";

        System.out.println(MathHelper.getMaxPosition(arr));
        System.out.println(MathHelper.getMinPosition(arr));
        System.out.println(MathHelper.getAverage(arr));

        System.out.println(StringUtils.reverseString(str));
        System.out.println(StringUtils.stringToUppercase(str));
        System.out.println(StringUtils.isPalindrome(str));
    }
}
