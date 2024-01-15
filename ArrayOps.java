public class ArrayOps {
    public static void main(String[] args) {
		System.out.println(secondMaxValue(new int[] {2, 8, 3, 7, 8}));
    }
    
    public static int findMissingInt (int [] array) {
		int[] ideal = new int[(array.length + 1)];
		for (int i = 0; i < array.length + 1; i++) {
			ideal[i] = i;
		}
		boolean found1 = false;
		for (int i = 0; i < ideal.length; i++) {
			found1 = false;
			for (int j = 0; j < array.length; j++) {
				if (ideal[i] == array[j]) {
					found1 = true;
				}
			}
			if (found1 == false) {
				return i;
			}
		}
        return 0;
    }

    public static int secondMaxValue(int [] array) {
        int max = 0;
		int secondMax = 0;
		int indexMax = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= max && array[i] > secondMax) {
				max = array[i];
				indexMax = i;
			} 
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] > secondMax && i != indexMax) {
				secondMax = array[i];
			} 
		}
		
		return (secondMax);
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
		boolean equal = true;
		for (int i = 0; i < array1.length; i++) {
			equal = false;
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					equal = true;
				}
			}
			if (equal == false) {
				break;
			}
		}
		return equal;
    }

public static boolean isSorted(int [] array) {
	int max = array[0];
	boolean checkInc = true;
	boolean checkDec = true;
	//Check if its increasing
	for (int i = 0; i < array.length; i++) {
		if (max > array[i]) {
			checkInc = false;
		}
		max = array[i];
	}
	//Check if its decreasing
	max = array[0];
	for (int i = 0; i < array.length; i++) {
		if (max < array[i]) {
			checkDec = false;
		}
		max = array[i];
	}
        if (checkInc == false && checkDec == false) {
			return false;
		} else { 
			return true;
		}
    }
}
