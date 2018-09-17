package com.li.Easy;

/**
 * 35. 搜索插入位置
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
 * 如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 你可以假设数组中无重复元素。
 *
 */
public class _35SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, target);
    }

    private static int binarySearch(int[] nums, int left, int right, int target) {
        int len = right - left + 1;
        if (len == 0) return right + 1;

        if (len == 1) {
            if (nums[left] == target) return left;
            else if (nums[left] < target) return left + 1;
            else return left;
        }

        int mid = left + len / 2;
        if (target == nums[mid]) return mid;
        else if (target > nums[mid]) return binarySearch(nums, mid + 1, right, target);
        else return binarySearch(nums, left, mid - 1, target);

    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 8, 9, 10};
        int[] nums1 = {1, 3, 5};
        System.out.println(searchInsert(nums1, 4));
    }
}
