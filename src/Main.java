public class Main {

    public static void main(String[] args) {

        //Task1-1
        int money=15000, month=0;
        int deposit=0;
        while (deposit<2_459_000) {
            deposit+=deposit/100;
            deposit+=money;
            month=month+1;

            System.out.println("Месяц " +month+"("+(month/12)+" лет"+")"+ ", сумма накоплений равна " +deposit+" рублей");
        }

        //Task1-2
        int i=0;
        while (i<10) {
            i=i+1;
            System.out.print(i);
        }
        System.out.print("\n");
        i=10;
        for (;i>0;i=i-1){
            System.out.print(i);
        }System.out.print("\n");

        //Task1-3
        int populationOfY=12_000_000,bornForYear=17%1000,deadForYear=-8%1000;
        for (int year=1;year<=10;year++) {
            populationOfY=populationOfY+year*(bornForYear+deadForYear)*1000;
            System.out.println("Год "+year+" численность населения составляет "+populationOfY);
        }

        //Task2-1
        int deposit1=15000;
        int sum=0;
        for (int month1=1;sum<=12_000_000;month1+=1){
            sum=sum+sum*7/100;
            sum=sum+deposit1;
            System.out.println(month1+"-"+sum);
        }
        System.out.print("\n");
        //Task2-2
        int deposit2=15000;
        int sum1=0;
        for (int month1=1;sum1<=12_000_000;month1+=1){
            sum1=sum1+sum1*7/100;
            sum1=sum1+deposit2;
            if(month1%6==0) {
                System.out.println(month1 + "-" + sum1);
            }
        }
        //Task2-3
        int deposit3=15000, sum2=0;
        for (int month2=1; month2<=9*12; month2+=1) {
            sum2 = sum2 + sum2 * 7 / 100;
            sum2 = sum2 + deposit3;
            if (month2 % 6 == 0) {
                System.out.println(month2+" - "+sum2);
            }
        }
        System.out.print("\n");

        //Task2-4
        int friday=1;
        //int dayOfWeek=1;
        //int dayMonth=1;
        for(int day=1;day<=31;day+=1) {

            if(day%7==friday){
                System.out.println("Сегодня пятница, "+day+"-е число. Необходимо подготовить отчет.");
            }

        }

        System.out.println();
        //Task3-1
        int currentYear=2022;
        int intervalStart=currentYear-200, intervalFinish=currentYear+100;
        for( int year = 0; year <= intervalFinish; year += 79 ) {
            if (year >= intervalStart) {
                System.out.println(year);
            }
        }

        System.out.println();
        //Task3-2
        int x=2;
        for (int n=1; n<=10; n+=1) {
            int y=x*n;
            System.out.println(x+"*"+n+"="+y);
        }

    }

}




