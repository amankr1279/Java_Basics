public class StudentAdapter implements Student{
    private SchoolStudent schoolStudent;

    public StudentAdapter(SchoolStudent schoolStudent) {
        this.schoolStudent = schoolStudent;
    }

    @Override
    public String getFirstName() {
        return this.schoolStudent.getfName();
    }

    @Override
    public String getLastName() {
        return this.schoolStudent.getlName();
    }

    @Override
    public String getEmailAddress() {
        return this.schoolStudent.getEmail();
    }
}
