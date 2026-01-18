package gr.aueb.cf.cf9.fromclass.unit4;

public class GenericSpeakingSchool {

    private ISpeakable student;

    public GenericSpeakingSchool(ISpeakable student) {
        this.student = student;
    }

    public void learn() {
        student.speak();
    }
}
