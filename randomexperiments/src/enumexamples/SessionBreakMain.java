package enumexamples;

public class SessionBreakMain {

    public static void main(String args[]){
        SessionBreak morning=SessionBreak.MORNING_TEA;
        String startTime=morning.getStartTime();
        System.out.println(morning+" start="+startTime+" end="+morning.getEndTime());

        SessionBreak morning1=SessionBreak.MORNING_TEA;
        SessionBreak morning2=SessionBreak.MORNING_TEA;
        if(morning1==morning2){

        }


    }
}
