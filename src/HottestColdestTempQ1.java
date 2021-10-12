import java.util.Scanner;

public class HottestColdestTempQ1 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        double[]dailyTemp=new double[365];
        System.out.println("Enter daily temperature of a year one by one");
        dailyTemp=keyboard.nextDouble();
        String hottest, coldest;
         dailyTemp[0]=hottest;
        dailyTemp[1]=coldest;
        for (int i = 0; i < dailyTemp.length; i++) {
            dailyTemp[i];
            if (dailyTemp[i]>dailyTemp[0]) {
                hottest = dailyTemp[i];
            }
            System.out.println("The hottest temperature is: "+hottest);
                if (dailyTemp[i]<dailyTemp[1]){
                    coldest=dailyTemp[i];
                }
            System.out.println("The coldest temperature is: "+coldest);
            }

        }
    }

