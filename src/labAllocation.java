import java.util.LinkedHashMap;
public class labAllocation {
    public String labNumber(int labArray[],int numberOfStudents){
        LinkedHashMap<Integer,Integer> labAndRemainingStudents = new LinkedHashMap<>();
        for(int iterator = 0;iterator < labArray.length; iterator++){
            if(labArray[iterator]>numberOfStudents){
                labAndRemainingStudents.put(labArray[iterator],labArray[iterator] - numberOfStudents);
            }
        }
        int minRemaining = Integer.MAX_VALUE;
        int labCount = 0;
        String result = "";
        for(int labNumber : labAndRemainingStudents.keySet()){
            labCount++;
            if(labAndRemainingStudents.get(labNumber)<minRemaining){
                minRemaining = labAndRemainingStudents.get(labNumber);
                result = "L"+labCount;
            }
        }
        return result;
    }
}
