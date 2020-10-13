package enumexamples;

public enum  SessionBreak {

    MORNING_TEA("11 am","11:15 am"),
    LUNCH("1 pm", "1:45 pm"),
    EVENING_TEA("4 pm", "4:15 pm");

    private String startTime,endTime;

    SessionBreak(String time,String endTime){
       this.startTime =time;
       this.endTime=endTime;
    }

    public String getStartTime(){
        return startTime;
    }

    public String getEndTime(){
        return endTime;
    }

}
