import java.util.ArrayList;
public class StepTracker
{
 /* to be implemented here */
 private int activedays;
 private int stepmin;
 private int totaldays;
 private int steptotal;
 public StepTracker(int stepcount){
   activedays=0;
   stepmin=stepcount;
   totaldays=0;
   steptotal=0;
 }
 public int activeDays(){
   return activedays;
 }
 public double averageSteps(){
   if(totaldays==0)
     return 0.0;
   return (double)steptotal/totaldays;
 }
 public void addDailySteps(int steps){
   steptotal+=steps;
   totaldays++;
   if(steps>=stepmin)
     activedays++;
 }
} 
