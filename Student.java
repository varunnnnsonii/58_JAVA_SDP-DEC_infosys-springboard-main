public class Student {
    int StudentId=0;
    String SName="Null";
    float qualifyingExamMarks = 0;
    char SResidentialStatus = '?';
    int yearOfEngg = 0;
    public void setSName(String sName) {
        SName = sName;
    }
    public String getName() {
        return SName;
    }
    public void setQualifyingExamMarks(float qualifyingExamMarks) {
        this.qualifyingExamMarks = qualifyingExamMarks;
    }
    public float getQualifyingExamMarks() {
        return qualifyingExamMarks;
    }
    public void setSResidentialStatus(char sResidentialStatus) {
        SResidentialStatus = sResidentialStatus;
    }
    public String getResidentialStatus() {
        String Rstatus="incorrect credential";

        if (SResidentialStatus=='H'||SResidentialStatus=='h') {
            Rstatus="Hosteller";
            return Rstatus; 
        }else if (SResidentialStatus=='D'||SResidentialStatus=='d') {
            Rstatus="Day Scholar";
            return Rstatus; 
        }else{
            return Rstatus;
        }
        
    }
    public void setStudentId(int studentId) {
        StudentId = studentId;
    }
    public int getStudentId() {
        return StudentId;
    }
    public void setYearOfEngg(int yearOfEngg) {
        this.yearOfEngg = yearOfEngg;
    }
    public int getYearOfEngg() {
        return yearOfEngg;
    }
    public static void main(String[] args) {
        Student Sharib = new Student();
        
        int id =Sharib.getStudentId();
        String name = Sharib.getName();
        float Marks = Sharib.getQualifyingExamMarks();
        String ResidentialStatus=Sharib.getResidentialStatus();
        int YearOfStudy= Sharib.getYearOfEngg();
        System.out.println("Student Name:"+ name);
        System.out.println("Student Id:"+ id);
        System.out.println("Qualifying Marks:"+ Marks);
        System.out.println("Residential Status:"+ ResidentialStatus);
        System.out.println("Year of Study:"+ YearOfStudy);

        Sharib.setQualifyingExamMarks(20);
        Sharib.setSName("Azizurrehmandgsjbdvfgncdf");
        Sharib.setSResidentialStatus('h');
        Sharib.setStudentId(69);
        Sharib.setYearOfEngg(3);
        id =Sharib.getStudentId();
        name = Sharib.getName();
        Marks = Sharib.getQualifyingExamMarks();
        ResidentialStatus=Sharib.getResidentialStatus();
        YearOfStudy= Sharib.getYearOfEngg();
        System.out.println("Student Name:"+ name);
        System.out.println("Student Id:"+ id);
        System.out.println("Qualifying Marks:"+ Marks);
        System.out.println("Residential Status:"+ ResidentialStatus);
        System.out.println("Year of Study:"+ YearOfStudy);

    }


    
}
