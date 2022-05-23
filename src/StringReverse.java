
public class StringReverse {

    public static void main(String[] args) {
	String str = "ABCDEF";
	String rev = "";
	char a;
	// System.out.println(str);
	for (int i = 0; i < str.length(); i++) {
	    // System.out.println(str.length());
	    a = str.charAt(i);
	    // System.out.println(a);
	    rev = a + rev;

	    if (str.length() == rev.length()) {
		System.out.println(rev);
	    }

	}
    }

}
