package OOP.StopWatch;

public class StopWatch {
    private double startTime, endTime;
    public StopWatch(){

    }
   public double getStartTime(){
    return this.startTime;
   }
   public double getEndTime(){
        return this.endTime;
   }
   public void Start(){
        startTime = System.currentTimeMillis();
   }
   public void Stop(){
        endTime = System.currentTimeMillis();
   }
   public double getElapsedTime(){
        this.Stop();
        return this.endTime - this.startTime;
   }


}
