
public class Schedule {
    private int idSchedule;
    private String idVehicle;
    private String hari;

    public Schedule(int idSchedule, String idVehicle, String hari) {
        this.idSchedule = idSchedule;
        this.idVehicle = idVehicle;
        this.hari = hari;
    }
    
    public Schedule(String idVehicle, String hari) {
        this.idVehicle = idVehicle;
        this.hari = hari;
    }

    public int getIdSchedule() {
        return idSchedule;
    }

    public void setIdSchedule(int idSchedule) {
        this.idSchedule = idSchedule;
    }

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public String getIdVehicle() {
        return idVehicle;
    }

    public void setIdVehicle(String idVehicle) {
        this.idVehicle = idVehicle;
    }
    
}
    
