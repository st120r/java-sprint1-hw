import java.util.Arrays;

public class StepTracker {

    int month;
    int days;
    int steps;
    int stepsPerDay = 10000;

    int[][] monthToData = new int[12][30];

    public StepTracker() {
        // fill array to 0 values
        for (int i = 0; i < monthToData.length; i++) {
            //monthToData[i] = new MonthData();
            Arrays.fill(monthToData[i], 0);
        }
    }

    public void addSteps(int month, int days, int steps) {
        // add steps to month day int[][]
        month = month - 1;
        days = days - 1;
        monthToData[month][days] = steps;
    }

    public void showStepsPerMonth(int month) {
        // show statistics for month
        month = month - 1;
        System.out.println("Статистика шагов за " + month + " месяц по дням.");
        for (int j = 0; j < monthToData[month].length; j++) {
            int day = j + 1;
            System.out.println("За " + day + "й день было пройдено " + monthToData[month][j] + " шагов.");
        }
    }

    public void showAllStepsInMonth(int month) {
        month = month - 1;
        int steps = 0;
        System.out.println("Статистика общего количества шагов за " + month + " месяц.");
        for (int j = 0; j < monthToData[month].length; j++) {
            steps = steps + monthToData[month][j];
        }
        System.out.println("За " + month + "й месяц было пройдено " + steps + " шагов.");
    }

    public int showSteps(int month, int days) {
        return monthToData[month][days];
    }

    public int[][] showAll() {
        return monthToData;
    }

/*
for (int i = 0; i < monthToData.length; i++) {
            for (int j = 0; j < monthToData[i].length; j++) {
            }
        }
* */
/*public CompetitionGround(int boundries)
{
    //Remember, you want IEgg, not Egg here
    //This is so that you can add elements that implement IEgg but aren't Eggs
    eggs = new IEgg[boundries][boundries];

    for (int i = 0; i <boundries; i++)
    {
        for (int j = 0; j <boundries; j++)
        {
            eggs[i][j]=new Egg();
        }
    }
}
*
* */
/*
    class MonthData() {
        // Заполните класс самостоятельно
    }*/
} 