package good.anyway;

public class FindInt {
    public static boolean findBefore(int[] data, int target) {
        boolean flag = false;
        for (int i=0; i<data.length && !flag; i++) {
            if (data[i] == target) {
                flag = true;
            }
        }
        return flag;
    }

    public static boolean findAfter(int[] data, int target) {
        boolean found = false;
        for (int i=0; i<data.length; i++) {
            if (data[i] == target) {
                found = true;
                break;
            }
        }
        return found;
    }

    public static boolean findFinal(int[] data, int target) {
        for (int i=0; i<data.length; i++) {
            if (data[i] == target) {
                return true;
            }
        }
        return false;
    }
}
