package com._0_nums;

class TestNumUtil {

    static NumsUtils numsUtils = new NumsUtils();//新建一个类的对象，方便调用类下面的函数

    public static void testInsert() {// static的意思是静态，不需要运行就可以调用
        int[] nums = {1, 2, 3, 4, 5};
        boolean res = numsUtils.insert(nums, 1, 6);//非static必须动态调用
        for (int num: nums) {
            System.out.print(num + " ");
        }
        //System.out.println(res)
        NumsUtils.test1();
    }

    public static void main(String[] args) {
        //testInsert();
        //testGetLength();
        //testFindPos();
        testDelete();
    }
    public static void testGetLength(){
        int[] nums= {1,3,5};
        int res = numsUtils.length(nums);
        System.out.println(res);
    }

    public static void testFindPos(){
        int[] nums= {1,2,3,4,5};
        //int targetNum=5;
        int res=numsUtils.findPos(nums,6);
        System.out.println(res);
    }

    public static void testDelete(){
        int[] nums= {1,3,6,2,8};
        boolean res=numsUtils.delete(nums, 0);
        for (int i=0; i<nums.length-1; i++) {
            System.out.print(nums[i] + " ");
        }
        //for (int num: nums) {//对于nums数组中的每一个元素num
        //  System.out.print(num + " ");
        //}
    }

}

