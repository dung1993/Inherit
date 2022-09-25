package BaiTap2;

public class Employee {
    private int ID;
    private String FullName = "Phùng Thanh Độ";
    private String BirthDate = "1989";
    private String Phone = "090860460";
    private String Email = "dochet1989@gmail.com";
    public Employee(){

    }

    public Employee(int ID,String FullName,String BirthDate,String Phone,String Email){
        this.ID = ID;
        this.FullName = FullName;
        this.BirthDate = BirthDate;
        this.Phone = Phone;
        this.Email = Email;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(String birthDate) {
        BirthDate = birthDate;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String toString(){
        return "ID: " + getID() + " FullName: " + getFullName() + " BirthDate: " + getBirthDate() + " Phone: " + getPhone() + " Email: " + getEmail();
    }
}
