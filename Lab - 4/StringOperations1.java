package stringoperations1;
public class StringOperations1
{
    public static void main(String[] args) 
    {
        String str1 = "High";
        String str2 = "Expectation";
        String concatenatedString = str1 + " " + str2;
        System.out.println("Concatenated : " + concatenatedString);
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Length of str2: " + str2.length());
        String substring = concatenatedString.substring(6, 11); 
        System.out.println("Substring : " + substring);
        System.out.println("str1 in uppercase: " + str1.toUpperCase());
        //System.out.println("str2 in uppercase: " + str2.toUpperCase());
        //System.out.println("str1 in lowercase: " + str1.toLowerCase());
        System.out.println("str2 in lowercase: " + str2.toLowerCase());
        System.out.println("str1 and str2 are equal: " + str1.equals(str2));
        int comparisonResult = str1.compareTo(str2);
        System.out.println("Comparison : " + comparisonResult);
    }
}