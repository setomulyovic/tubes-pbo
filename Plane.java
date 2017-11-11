
public class Plane implements Vehicle{
     private String idPlane;
    private String track;
    
    public Plane(String idPlane, String track){
        this.idPlane = idPlane;
        this.track = track;
    } 
    
    @Override
    public String track(){
        return track;
    }
    
}
