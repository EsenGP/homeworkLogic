public class first_Task
{

    private static double middleNumb(int[] inputArray){
        int count = 0;
        int sum = 0;
        for(int i = 0; i < inputArray.length ;i++)
        {
            sum+= inputArray[i];
            count++;
        }
        double middleNumber = (double) sum / count;
        return middleNumber;
    }

    public static void main(String[] args)
    {
        int[] allNumbers = {1,7,6,9,4,6,2,7};
        System.out.println(middleNumb(allNumbers));
    }
}
