package BaiTap2;

public class Experience extends Employee{
    public double ExpInYear = 2;
    public String ProSkill;

    public Experience (){

    }

    public Experience (int ID,String FullName,String BirthDate,String Phone,String Email,double ExpInYear,String ProSkill){
        super(ID, FullName, BirthDate, Phone, Email);
        this.ExpInYear = ExpInYear;
        this.ProSkill = ProSkill;
    }

    public double getExpInYear() {
        return ExpInYear;
    }

    public void setExpInYear(double expInYear) {
        ExpInYear = expInYear;
    }

    public String getProSkill() {
        return ProSkill;
    }

    public void setProSkill(String proSkill) {
        ProSkill = proSkill;
    }

    public String toString(){
        return "ID: " + getID() + " FullName: " + getFullName() + " BirthDate: " + getBirthDate() + " Phone: " + getPhone() + " Email: " + getEmail()
                + " ExpInYear: " + getExpInYear() + " ProSkill: " + getProSkill();
    }
}
