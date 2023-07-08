
public class labAllocation {
    public String labNumber(int labArray[],int numberOfStudents){
        int minRemaining = Integer.MAX_VALUE;
        String result = "";
        for(int iterator = 0;iterator < labArray.length; iterator++){
                if (labArray[iterator]>numberOfStudents && labArray[iterator] - numberOfStudents < minRemaining) {
                    minRemaining = labArray[iterator] - numberOfStudents;
                    result = "L" + (iterator + 1);
                }
        }
        return result;
    }
}
