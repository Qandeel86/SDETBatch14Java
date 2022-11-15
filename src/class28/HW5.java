package class28;

import java.util.HashMap;

public class HW5 {
    public static void main(String[] args) {
        /*Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who gets the
         highest salary. Output should be in the below format:
         John Smith=$100000
        */
        HashMap<String,Integer> employee=new HashMap<>();
        employee.put("Qandeel",150000);
        employee.put("Adnan",250000);
        
        int maxValue=0;
        String maxKey = null;
        
        var maximum=employee.keySet();
        for(var max:maximum){
            if(employee.get(max)>maxValue){
                maxValue=employee.get(max);
                maxKey=max;
            }
        }
        System.out.println(maxKey+"="+maxValue);
        
    }
}
