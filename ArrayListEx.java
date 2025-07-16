import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {


       // Collection<Integer> nums=new ArrayList<>();

        List<Integer> nums=new ArrayList<>();
        nums.add(23);
        nums.add(8);
        nums.add(11);
        nums.add(17);

        for(int n:nums){
            System.out.println(n);
        }

        for(int i=0;i<nums.size();i++){
            System.out.println(nums.get(i));
        }

       // Collections.sort(nums);
    


    }
}
