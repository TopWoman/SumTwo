package leetcode.sumtwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class SumtwoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SumtwoApplication.class, args);

        Integer[] nums = new Integer[] {3,2,3};
        Integer[] newNums = new Integer[2];
        int target = 6;

        for(int i = 0; i < nums.length-1; i++)
            for(int j = i+1; j < nums.length; j++){
            if(nums[i] + nums[j] == target) {
                newNums[0] = i;
                newNums[1] = j;
                System.out.println(Arrays.toString(newNums));
            }
        }
    }
}
