public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        System.out.println(allIndexOf("Hello World", ' '));
		// “introToComputerScience”
    }

    public static String capVowelsLowRest (String str) {
		String fin = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
				fin = fin + (char)(str.charAt(i) - 32);
			} else if (ch == 'B' || ch == 'C' || ch == 'D' || ch == 'F' || ch == 'G' || ch == 'H' || ch == 'J' || ch == 'K' || ch == 'L' || ch == 'M' || ch == 'N' || ch == 'P' || ch == 'Q' || ch == 'R' || ch == 'S' || ch == 'T' || ch == 'V' || ch == 'W' || ch == 'X' || ch == 'Y' || ch == 'Z'){
				fin = fin + (char)(str.charAt(i) + 32);
			} else { 
				fin = fin + str.charAt(i);
			}
		}
        return fin;
    }

    public static String camelCase (String str) {
        String fin = "";
		for (int i = 0; i < str.length(); ++i) {
			while (str.charAt(i) == ' ') {
				++i;
			}
			char ch = str.charAt(i);
			if ((fin != "") && (str.charAt(i-1) == ' ')) { 
				if (ch >= 'a' && ch <= 'z'){
					fin = fin + (char)(str.charAt(i) - 32);
				} else {
					fin = fin + str.charAt(i);
				}
			} else {
				if ((ch >= 'A') && (ch <= 'Z')){
					fin = fin + (char)(str.charAt(i) + 32);
				} else {
					fin = fin + str.charAt(i);
				}
			}
		}
        return fin;
    }

    public static String allIndexOf (String str, char ch) {
        int[] out = new int[str.length()];
		int index = 0;
		for (int i = 0; i < str.length(); i++) {
			if (ch == str.charAt(i)) {
				out[index] = i;
				index++;
			}			
		}
        String answer = "output: {";
		for (int i = 0; i < index; i++) {
			if (i != (index-1)) {
				answer = answer + out[i] + ", ";
			} else {
				answer += out[i] + "}";
			}
		}
		return answer;
    }
}