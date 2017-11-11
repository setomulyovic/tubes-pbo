
public class Train implements Vehicle {
    private String idTrain;
    private String track;
    
    public Train(String idTrain,String track){
        this.idTrain = idTrain;
        this.track = track;
    } 
     
    @Override
    public String track(){
        return track;
    }
    
}
