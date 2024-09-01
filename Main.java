
public class Main {
    public static void main(String[] args) {

    }

public int searchInsert(int[] nums, int target) {
    int low = 1;
    int high = nums.length;
    while (low < high) {
        int mid = low + (high - low)/2;
        if (nums[mid] == target) {
            return mid;
        } else if(nums[mid] < target) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }

    if (low == high) {
        return high;
    }
    return low;

}

}