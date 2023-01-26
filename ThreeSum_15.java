import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

class ThreeSum_15 {


    public ArrayList<ArrayList<Integer>> threeSum(int[] nums) {

        ArrayList<ArrayList<Integer>> solution = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int currentVal = nums[i];
            int frontPointer = i + 1;
            int rearPointer = nums.length - 1;

            if (i == 0 || nums[i] != nums[i - 1]) {

                while (frontPointer < rearPointer) {
                    int sum = currentVal + nums[rearPointer] + nums[frontPointer];
                    if (sum == 0) {
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(currentVal);
                        temp.add(nums[rearPointer]);
                        temp.add(nums[frontPointer]);

                        solution.add(temp);

                        frontPointer++;
                        rearPointer--;

                        while (frontPointer < rearPointer && nums[frontPointer] == nums[frontPointer - 1]) {
                            frontPointer++;
                        }
                    }
                    if (sum < 0) frontPointer++;
                    if (sum > 0) rearPointer--;
                }
            }
        }
        return solution;


        // List<List<Integer>> solution = new ArrayList<>();

        // int[] lookup = new int[1002553];
        // HashSet<List<Integer>> set = new HashSet<>();

        // for(int i = 0; i < nums.length; i++){
        //     int val = nums[i];
        //     lookup[Math.floorMod(val, 1002553)]++;
        // }

        // for(int i = 0; i < nums.length; i++){
        //     int firstVal = nums[i];

        //     for(int j = 0; j < nums.length; j++){
        //         if(j == i) continue;
        //         int secondVal = nums[j];
        //         int diff = 0 - (firstVal + secondVal);

        //         lookup[Math.floorMod(firstVal, 1002553)]--;
        //         lookup[Math.floorMod(secondVal, 1002553)]--;

        //         if(lookup[Math.floorMod(diff, 1002553)] > 0){
        //             List<Integer> temp = new ArrayList<>();
        //             temp.add(firstVal);
        //             temp.add(secondVal);
        //             temp.add(diff);

        //             Collections.sort(temp);

        //             if(!set.contains(temp)) {
        //                 set.add(temp);
        //                 solution.add(temp);
        //                 }
        //         }
        //         lookup[Math.floorMod(firstVal, 1002553)]++;
        //         lookup[Math.floorMod(secondVal, 1002553)]++;
        //     }

        // }
        // return solution;
    }


}
