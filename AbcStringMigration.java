package Assignment2;

public class AbcStringMigration {
	

	    public static void main(String[] args) {
	        String a = "abcdef";
	        String b = "xyz1234";
	        String c = "abcxy";

	        //  Verify length conditions
	        verifyLengthConditions(a, b, c);

	        // Verify equality conditions
	        verifyEqualityConditions(a, b, c);

	        //  Check case-insensitive equality of 'a' and 'c'
	        checkCaseInsensitiveEquality(a, c);

	        //  Check presence and absence of substrings in 'a'
	        checkSubstringsInA(a);

	        //  Check uppercase conversion of 'b'
	        checkUppercaseB(b);

	        //  Validate length conditions again
	        verifyLengthConditions(a, b, c);

	        //  Concatenate 'a' and 'b' and validate length conditions
	        concatenateAndVerifyLength(a, b, c);

	        // Validate prefix and suffix of 'a' and 'b'
	        validatePrefixAndSuffix(a, b);

	        //  Check presence of space and absence of '9' in 'c'
	        checkSpaceAndNineInC(c);
	    }

	    private static void verifyLengthConditions(String a, String b, String c) {
	        if (a.length() > c.length() && a.length() < b.length()) {
	            System.out.println("Length conditions for 'a' verified successfully.");
	        } else {
	            System.out.println("Length conditions for 'a' not satisfied.");
	        }
	    }

	    private static void verifyEqualityConditions(String a, String b, String c) {
	        if (!a.equals(b) && !a.equals(c)) {
	            System.out.println("Equality conditions for 'a' verified successfully.");
	        } else {
	            System.out.println("Equality conditions for 'a' not satisfied.");
	        }
	    }

	    private static void checkCaseInsensitiveEquality(String a, String c) {
	        if (a.equalsIgnoreCase(c)) {
	            System.out.println("Case-insensitive equality between 'a' and 'c' verified successfully.");
	        } else {
	            System.out.println("Case-insensitive equality between 'a' and 'c' not satisfied.");
	        }
	    }

	    private static void checkSubstringsInA(String a) {
	        if (a.contains("cd") && !a.contains("xy")) {
	            System.out.println("Substring conditions for 'a' verified successfully.");
	        } else {
	            System.out.println("Substring conditions for 'a' not satisfied.");
	        }
	    }

	    private static void checkUppercaseB(String b) {
	        String uppercaseB = b.toUpperCase();
	        if (uppercaseB.contains("Z") && !uppercaseB.contains("z")) {
	            System.out.println("Uppercase conversion of 'b' verified successfully.");
	        } else {
	            System.out.println("Uppercase conversion of 'b' not satisfied.");
	        }
	    }

	    private static void concatenateAndVerifyLength(String a, String b, String c) {
	        String concatenated = a + b;
	        if (concatenated.length() < c.length() || concatenated.length() > 5) {
	            System.out.println("Length conditions for concatenated string of 'a' and 'b' verified successfully.");
	        } else {
	            System.out.println("Length conditions for concatenated string of 'a' and 'b' not satisfied.");
	        }
	    }

	    private static void validatePrefixAndSuffix(String a, String b) {
	        if (a.startsWith("ab") && !b.endsWith("yz")) {
	            System.out.println("Prefix and suffix conditions for 'a' and 'b' verified successfully.");
	        } else {
	            System.out.println("Prefix and suffix conditions for 'a' and 'b' not satisfied.");
	        }
	    }

	    private static void checkSpaceAndNineInC(String c) {
	        if (c.contains(" ") && !c.contains("9")) {
	            System.out.println("Space and absence of '9' conditions for 'c' verified successfully.");
	        } else {
	            System.out.println("Space and absence of '9' conditions for 'c' not satisfied.");
	        }
	    }
	}



