package com._0_nums;


public class NumsUtils {

    public static void test1(){}

    //计算数组的长度
    public int length(int[] nums){
        //int l= nums.length;
       // return l;
        int l=0;
        for(int i=0; i< nums.length; i++){
            l++;
        }
        return l;
    }

    //在数组的第i个位置插入元素
    public boolean insert(int[] nums, int pos, int insertNum) {
        if (pos < 0 || pos >= nums.length) {// &&
            return false;
        }
        for (int j = nums.length-1; j > pos; j--) {
            nums[j] = nums[j-1];
        }
        nums[pos] = insertNum;
        return true;
    }

    //删除数组中的第i个元素
    public boolean delete(int[] nums, int pos){
        if(pos<0|| pos>=nums.length){
            return false;
        }
        for (int i=pos;i< nums.length-1; i++){
            nums[i]=nums[i+1];
        }
        return true;
    }

    //按值查找
    public int findPos(int[] nums, int targetNum){
        int pos=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==targetNum){
                pos=i;
                break;
            }
        }
        return pos;
    }
}

