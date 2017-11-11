
public class Reservation {
    private int idReservation;
    private int idPassenger;
    private int idSchedule;
    private String status;

    public Reservation() {
    }

    public Reservation(int idReservation, int idPassenger, int idSchedule) {
        this.idReservation = idReservation;
        this.idPassenger = idPassenger;
        this.idSchedule = idSchedule;
        status = "Belum lunas";
    }

    public Reservation(int idPassenger, int idSchedule) {
        this.idPassenger = idPassenger;
        this.idSchedule = idSchedule;
        status = "Belum lunas";
    }
    
    public int getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(int idPendataran) {
        this.idReservation = idPendataran;
    }

    public int getIdPassenger() {
        return idPassenger;
    }

    public void setIdPassenger(int idPassenger) {
        this.idPassenger = idPassenger;
    }

    public int getIdSchedule() {
        return idSchedule;
    }

    public void setIdSchedule(int idSchedule) {
        this.idSchedule = idSchedule;
    }    
    
    public void setStatus(String x) {
        status = x;
    }
    
    public String getStatus() {
        return status;
    }
}
