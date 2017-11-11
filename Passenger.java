
public class Passenger {
    private int idPassenger;
    private String name, gender, address, birthdate;
    private List<Reservation> pemesanan = new ArrayList();

    public Passenger(int idPassenger, String name) {
        this.idPassenger = idPassenger;
        this.name = name;
    }

    public Passenger(int idPassenger, String name, String gender, String address, String birthdate) {
        this.idPassenger = idPassenger;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.birthdate = birthdate;
    }
    
    public int getidPassenger() {
        return idPassenger;
    }

    public void setidPassenger(int idPassenger) {
        this.idPassenger = idPassenger;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public void addPemesanan(Reservation x) {
        this.pemesanan.add(x);
    }
    
    public List<Reservation> getPemesanan() {
        return pemesanan;
    }
}
