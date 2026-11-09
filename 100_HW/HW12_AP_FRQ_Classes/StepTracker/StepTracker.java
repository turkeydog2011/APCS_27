import java.util.*;
public class StepTracker {
int totalstep;
int activedais;
int days;
public StepTracker(){
    int totalstep = 0;
    int activedais = 0;
    int days;
}
//they showed a steptracker with an int input but it doesnt do anything ¯\_(ツ)_/¯
public StepTracker(int a){
    int totalstep = 0;
    int activedais = 0;
    int days;
}
public void addDailySteps(int a){
totalstep += a;
days++;
if(a>=10000){
    activedais++;
}
}
public int activeDays(){
    return activedais;
}
public double averageSteps(){
return (double)totalstep/days;
}
}