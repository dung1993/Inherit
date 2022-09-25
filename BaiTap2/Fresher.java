package BaiTap2;

public class Fresher extends Employee{
    public String Graduation_date = "2022";
    public String Graduation_rank = "Giỏi";
    public String Education = "RMIT";

    public Fresher(){};
    public Fresher(int ID,String FullName,String BirthDate,String Phone,String Email,String Graduation_date,String Graduation_rank,String University_name){
        super(ID, FullName, BirthDate, Phone, Email);
        this.Graduation_date = Graduation_date;
        this.Graduation_rank = Graduation_rank;
        this.Education = Education;
    }

    public String getGraduation_date() {
        return Graduation_date;
    }

    public void setGraduation_date(String graduation_date) {
        Graduation_date = graduation_date;
    }

    public String getGraduation_rank() {
        return Graduation_rank;
    }

    public void setGraduation_rank(String graduation_rank) {
        Graduation_rank = graduation_rank;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String education) {
        Education = education;
    }

    public String toString(){
        return "ID: " + getID() + " FullName: " + getFullName() + " BirthDate: " + getBirthDate() + " Phone: " + getPhone() + " Email: " + getEmail()+
                " Graduation of date: " + getGraduation_date() + " Graduation of rank: " + getGraduation_rank()+ " Education: " + getEducation();
    }
}
