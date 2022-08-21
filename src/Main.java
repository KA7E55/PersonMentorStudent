import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Mentor[]mentors = {new Mentor("Muhammed",30),
                new Mentor("Zhanarbek",22),
        new Mentor("Nurbek",22),new Mentor("Muhamed",20)};

        Student[]students = new Student[40];
        for (int i = 0; i < 40; i++) {
            int randomNumber = random.nextInt(0,40);
            switch (randomNumber){
                case 0 -> students[i] = new Student("Student 1 - "+i,10+i);
                case 1 -> students[i] = new Student("Student 2 - "+i,10+i);
                case 2 -> students[i] = new Student("Student 3 - "+i,10+i);
                case 3 -> students[i] = new Student("Student 4 - "+i,10+i);
                case 4 -> students[i] = new Student("Student 5 - "+i,10+i);
                case 5 -> students[i] = new Student("Student 6 - "+i,10+i);
                case 6 -> students[i] = new Student("Student 7 - "+i,10+i);
                case 7 -> students[i] = new Student("Student 8 - "+i,10+i);
                case 8 -> students[i] = new Student("Student 9 - "+i,10+i);
                case 9 -> students[i] = new Student("Student 10 - "+i,10+i);
                case 10 -> students[i] = new Student("Student 11 - "+i,10+i);
                case 11 -> students[i] = new Student("Student 12 - "+i,10+i);
                case 12 -> students[i] = new Student("Student 13 - "+i,10+i);
                case 13 -> students[i] = new Student("Student 14 - "+i,10+i);
                case 14 -> students[i] = new Student("Student 13 - "+i,10+i);
                case 15 -> students[i] = new Student("Student 14 - "+i,10+i);
                case 16 -> students[i] = new Student("Student 15 - "+i,10+i);
                case 17 -> students[i] = new Student("Student 16 - "+i,10+i);
                case 18 -> students[i] = new Student("Student 17 - "+i,10+i);
                case 19 -> students[i] = new Student("Student 18 - "+i,10+i);
                case 20 -> students[i] = new Student("Student 19 - "+i,10+i);
                case 21 -> students[i] = new Student("Student 20 - "+i,10+i);
                case 22 -> students[i] = new Student("Student 21 - "+i,10+i);
                case 23 -> students[i] = new Student("Student 22 - "+i,10+i);
                case 24 -> students[i] = new Student("Student 23 - "+i,10+i);
                case 25 -> students[i] = new Student("Student 24 - "+i,10+i);
                case 26 -> students[i] = new Student("Student 25 - "+i,10+i);
                case 27 -> students[i] = new Student("Student 26 - "+i,10+i);
                case 28 -> students[i] = new Student("Student 27 - "+i,10+i);
                case 29 -> students[i] = new Student("Student 28 - "+i,10+i);
                case 30 -> students[i] = new Student("Student 29 - "+i,10+i);
                case 31 -> students[i] = new Student("Student 30 - "+i,10+i);
                case 32 -> students[i] = new Student("Student 31 - "+i,10+i);
                case 33 -> students[i] = new Student("Student 32 - "+i,10+i);
                case 34 -> students[i] = new Student("Student 33 - "+i,10+i);
                case 35 -> students[i] = new Student("Student 34 - "+i,10+i);
                case 36 -> students[i] = new Student("Student 35 - "+i,10+i);
                case 37 -> students[i] = new Student("Student 36 - "+i,10+i);
                case 38 -> students[i] = new Student("Student 37 - "+i,10+i);
                case 39 -> students[i] = new Student("Student 38 - "+i,10+i);
                case 40 -> students[i] = new Student("Student 39 - "+i,10+i);
            }
        }
        for (Student i:students) {
            switch (random.nextInt(1,40)){
                case 1 -> mentors[0].addStudent(i);
                case 2 -> mentors[1].addStudent(i);
                case 3 -> mentors[2].addStudent(i);
                case 4 -> mentors[3].addStudent(i);
            }
        }
        for (Mentor i:mentors) {
            System.out.println("Mentor: "+i.getName());
            for (int j = 0; j < i.getIndexOfNewStudents(); j++) {
                System.out.println(i.getStudents()[j].getName());
            }
            System.out.println("--------------------");
        }
        for (Mentor i:mentors) {
            System.out.printf("-----Ментору по имени %s попалось %d студентов\n", i.getName(), i.getIndexOfNewStudents());
        }
    }
}

