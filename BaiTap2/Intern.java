package BaiTap2;

public class Intern extends Employee{
    private String Majors = "Quản Trị Kinh Doanh";
    private String Semester = "Học kì 2";
    private String University_name = "Đại Học Kinh Tế Huế";

    public Intern(){};
    public Intern(int ID,String FullName,String BirthDate,String Phone,String Email,String Majors,String Semester,String University_name){
        super(ID, FullName, BirthDate, Phone, Email);
        this.Majors = Majors;
        this.Semester = Semester;
        this.University_name = University_name;
    }

    public String getMajors() {
        return Majors;
    }

    public void setMajors(String majors) {
        Majors = majors;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String semester) {
        Semester = semester;
    }

    public String getUniversity_name() {
        return University_name;
    }

    public void setUniversity_name(String university_name) {
        University_name = university_name;
    }

    public String toString(){
        return "ID: " + getID() + " FullName: " + getFullName() + " BirthDate: " + getBirthDate() + " Phone: " + getPhone() + " Email: " + getEmail() +
                " Majors: " + getMajors() + " Semester: " + getSemester()+ " University_name: " + getUniversity_name();
    }
}
