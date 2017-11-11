
public class Admin extends Employee {
    private String idAdmin;
    private String bidang;

    public Admin() {
    }
        
    public Admin(String idAdmin, String name, String gender, String address) {
        super(name, address, gender);
        this.idAdmin = idAdmin;
    }

    public String getIdAdmin() {
        return idAdmin;
    }
    
}
