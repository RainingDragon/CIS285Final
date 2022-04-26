import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testInsertionSort {
@Test
public void test() {
testPositive();
testNegative();
testMixed();
}
    public testInsertionSort() {
    }

	public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;

        insertionSort sortion = new insertionSort();
        mySortClass.insertSort(arr, arr.length);
        assertArrayEquals(new int[]{2,9,7,8,10}, arr);

	}

	public void testNegative(){

        int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;

        insertionSort sortion = new insertionSort();
        sortion.insertSort(arr, arr.length);
        assertArrayEquals(new int[]{ -10, -8, -2, -7 -9}, arr);
	}

	public void testMixed(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = -9;
        arr[2] = 70;
        arr[3] = -10;
        arr[4] = 2;

        insertionSort sortion = new insertionSort();
        sortion.insertSort(arr, arr.length);
        assertArrayEquals(new int[]{-10, -9, 2, 7, 8}, arr);
    }

}
