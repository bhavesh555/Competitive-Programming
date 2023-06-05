package Binary_Search;

class Solution {
    public int search(int[] nums, int target) {
         int low=0;
    int high= nums.length - 1;
    int mid=low+(high-low)/2;

    while(low <= high){
        if(nums[mid] == target)
            return mid;
        
        
        else if(nums[low] <= nums[mid]){
            if(nums[low] <= target && nums[mid] > target)
                high=mid-1;
            else
                low=mid+1;
        }
        
        else if(nums[mid] <= nums[high]){
            if(nums[mid] < target && nums[high] >= target){
                low=mid+1;
            }
            else
                high=mid-1;
        }
        
        mid=low+(high-low)/2;
    }
    return -1;
    }
}