import java.util.Scanner;

public class DiffHottestandColdestOfEachMonthQ1 {
    public static void main(String[] args) {
        double[]dailyTemp=new double[30];
        double hottest, coldest;
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter daily temperature of a month");
        dailyTemp= keyboard.nextDouble();
        for (int i = 0; i < 30; i++) {
            dailyTemp[0]=hottest;
            dailyTemp[1]=coldest;
            if (dailyTemp[i]>dailyTemp[0])
                hottest=dailyTemp[i];
            if (dailyTemp[i]<dailyTemp[1]);
            coldest=dailyTemp[i];
        }
        System.out.println("The difference between the hottest and coldest days in a month is: "+hottest-coldest);

    }
}
