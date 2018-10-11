public class Runner {


    public static void main(String[] args) {
        System.out.println(sleepIn(true, false));
        System.out.println(stringTimes("Woah", 8));
        System.out.println(helloName("Jerry"));
        int[] nums = {1,2,3,4,5,6};
        System.out.println(firstLast6(nums));
        System.out.println(cigarParty(61, false));
        System.out.println(luckySum(8,13,4));
        System.out.println(doubleChar("Hi-There"));
        System.out.println(gHappy("xxggxx"));
        int[] twos = {2,2,4,2};
        System.out.println(twoTwo(twos));
        System.out.println(canBalance(nums));
    }



    public static boolean sleepIn(boolean weekday, boolean vacation) {
        boolean returner = true;
        if(vacation == true){
            returner = true;
        }else if(weekday == true && vacation == false){
            returner = false;
        }else if(weekday == false && vacation == false){
            returner = true;
        }
        return returner;
    }

    public static String stringTimes(String str, int n) {
        String newString = "";
        for(int i = 0; i < n; i++) {
            newString += str;
        }
        return newString;
    }

    public static String helloName(String name) {
        return ("Hello " + name + "!");
    }

    public static boolean firstLast6(int[] nums) {
        boolean returner = true;
        if(nums[0] != 6 && nums[nums.length - 1] != 6){
            returner = false;
        }else{
            returner = true;
        }
        return returner;
    }

    public static boolean cigarParty(int cigars, boolean isWeekend) {
        boolean returner = true;
        if(isWeekend && cigars >= 40){
            returner = true;
        }else if(cigars >= 40  && cigars <= 60){
            returner = true;
        }else{
            returner = false;
        }
        return returner;
    }

    public static int luckySum(int a, int b, int c) {
        int sum = 0;
        if(a == 13){
            sum = 0;
        }else if(b == 13){
            sum = a;
        }else if(c == 13){
            sum = a + b;
        }else{
            sum = a + b + c;
        }
        return sum;
    }

    public static String doubleChar(String str) {
        String doubleStr = "";
        for(int i = 0; i < str.length(); i++){
            doubleStr += str.substring(i, i + 1) + str.substring(i, i + 1);
        }
        return doubleStr;
    }

    public static boolean gHappy(String str) {
        if(str.length() == 1 && str.charAt(0) == 'g')
            return false;

        if(str.length() >= 2 &&
                (str.charAt(0) == 'g' && str.charAt(1) != 'g' ||
                        str.charAt(str.length()-1) == 'g' &&
                                str.charAt(str.length()-2) != 'g'))
            return false;

        for(int i = 1; i <= str.length() - 2; i++) {
            if(str.charAt(i) == 'g' && str.charAt(i-1) != 'g' &&
                    str.charAt(i+1) != 'g')
                return false;
        }

        return true;
    }

    public static boolean twoTwo(int[] twos){

        for (int i = 0; i < twos.length; i++){
            if (twos[i] != 2)
                continue;
            if (i >= 1 && twos[i-1] == 2)
                continue;
            if (i < (twos.length-1) && twos[i+1] == 2)
                continue;
            return false;
        }
        return true;
    }

    public static boolean canBalance(int[] nums) {
        int firstHalf = 0;
        for(int i = 0; i < nums.length; i++){
            firstHalf += nums[i];
            int secondHalf = 0;
            for(int k = nums.length-1; k > i; k--){
                secondHalf += nums[k];
            }
            if(firstHalf == secondHalf){
                return  true;
            }
        }
        return false;
    }



}
