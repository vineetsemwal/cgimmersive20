package enumexamples;

public class DayMain {
    public static void main(String args[]){
        Day sun=Day.SUNDAY;
        System.out.println("sunday="+sun +" name="+sun.name()+" "+sun.ordinal());

        Day days[]=Day.values();
        for (Day day:days){
            System.out.println(day+" name="+day.name()+" ordinal="+day.ordinal()+" tostring="+day.toString());
        }

    }
}
