package World;

public class Tool {
    int MilliSec = 0;
    public void setMilliSecCounter(int Milli){
        MilliSec += Milli;
    }
    public void ResetMilliCounter(){
        MilliSec = 0;
    }
    public int GetMilli(){
        return MilliSec;
    }
}
