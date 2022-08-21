public class Mentor extends Person {

    private Student[] students = new Student[40];
    private int indexOfNewStudents = 0;

    public Mentor(String name,int age){
        super(name, age);
    }
    public void addStudent(Student student){
        students[indexOfNewStudents] = student;
        indexOfNewStudents++;
    }
    public void takeExam(){
        System.out.println("-----Ментор "+this.getName()+" принимает экзамен");
        for (int i = 0; i < indexOfNewStudents; i++) {
            System.out.println("-----Сдет экзамен "+students[i].getName()+" -----");
            System.out.println("-----Его возраст "+students[i].getAge()+" -----");
            students[i].explain();
            System.out.println("--------------------");

        }
    }
    public int getIndexOfNewStudents(){
        return indexOfNewStudents;
    }
    public Student[]getStudents(){
        return students;
    }

}
