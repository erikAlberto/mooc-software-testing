package tudelft.numfinder;

public class NumFinder {
    private int smallest = Integer.MAX_VALUE;
    private int largest = Integer.MIN_VALUE;

    public void find(int[] nums) {
        if(nums.length != 0){
            for(int n : nums) {

                if(n < smallest)
                    smallest = n;
                if (n > largest)
                    largest = n;

            }
        }else{
            System.out.println("array is empty");
        }
    }

    public int getSmallest () {
        return smallest;
    }

    public int getLargest () {
        return largest;
    }
}
