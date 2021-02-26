import org.junit.jupiter.api.Assertions;
        import org.junit.jupiter.api.Test;

        import java.util.Currency;

public class test{
    @Test
    public void BigTest(){
        int[] CurrentArray = {1000000000,1,999999999,228,1001,999};
        int[] SortedArray = {1,228,999,1001,999999999,1000000000};
        Sorter.sort_tanos(CurrentArray,0,6);
        Assertions.assertArrayEquals(CurrentArray,SortedArray);
    }
    @Test
    public void ErrorTest1(){
        int[] CurrentArray = {5,3,1,6,2,4};
        int[] SortedArray = {1,2,3,4,5,6};
        Sorter.sort_tanos(CurrentArray,1,6);
        Assertions.assertArrayEquals(CurrentArray,SortedArray);
    }
    @Test
    public void DiffTest() {
        int[] CurrentArray = {100, 50, 150, 145};
        int[] SortedArray = {50, 145, 100, 150, 49};
        Sorter.sort_tanos(CurrentArray, 0, 4);
        Assertions.assertArrayEquals(CurrentArray, SortedArray);
    }
    @Test
    public void NegativeTest(){
        int[] CurrentArray = {-1,-2,-3,-4,-5};
        int[] SortedArray = {-5,-4,-3,-2,-1};
        Sorter.sort_tanos(CurrentArray,0,5);
        Assertions.assertArrayEquals(CurrentArray,SortedArray);
    }
    @Test
    public void EqualTest(){
        int[] CurrentArray = {10,10,10,4,4,4,3,3,3,7,7,7};
        int[] SortedArray = {3,3,3,4,4,4,7,7,7,10,10,10};
        Sorter.sort_tanos(CurrentArray,0,12);
        Assertions.assertArrayEquals(CurrentArray,SortedArray);
    }
    @Test
    public void AloneTest(){
        int[] CurrentArray = {1};
        int[] SortedArray = {1};
        Sorter.sort_tanos(CurrentArray,0,1);
        Assertions.assertArrayEquals(CurrentArray,SortedArray);
    }
    @Test
    public void ErrorTest2(){
        int[] CurrentArray = {1,2,3,4,5};
        int[] SortedArray = {1,2,3,4,5};
        Sorter.sort_tanos(CurrentArray,0,0);
        Assertions.assertArrayEquals(CurrentArray,SortedArray);
    }
    @Test
    public void ErrorTest3(){
        int[] CurrentArray = {1,2,3,4,5};
        int[] SortedArray = {1,2,3,4,5};
        Sorter.sort_tanos(CurrentArray,5,5);
        Assertions.assertArrayEquals(CurrentArray,SortedArray);
    }
    @Test
    public void NotSortedTest(){
        int[] CurrentArray = {10,9,12,13,11};
        int[] SortedArray = {10,9,12,13,11};
        Sorter.sort_tanos(CurrentArray,0,5);
        Assertions.assertArrayEquals(CurrentArray,SortedArray);
    }

}