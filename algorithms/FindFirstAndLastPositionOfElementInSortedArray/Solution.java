class Solution {
    public int[] searchRange(int[] nums, int target) {
        int length = nums.length;
        if (length == 0)
            return new int[]{-1, -1};

        int low = 0,
            high = length - 1;

        while (low < high) {
            int mid = (low + high) / 2;

            if (nums[mid] < target)
                low = mid + 1;
            else if (nums[mid] > target)
                high = mid - 1;
            else
                high = mid;
        }

        if (nums[low] != target)
            return new int[]{-1, -1};

        int temp = low;
        low = 0;
        high = length - 1;

        while (low < high) {
            int mid = (int) Math.ceil((low + high) / 2.0);

            if (nums[mid] < target)
                low = mid + 1;
            else if (nums[mid] > target)
                high = mid - 1;
            else
                low = mid;
        }

        return new int[]{temp, low};
    }
}