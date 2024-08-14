import java.util.Scanner;

public class Student {
    private String studentCode;
    private String studentName;
    private int age;
    private boolean sex;
    private double markHTML;
    private double markJavascript;
    private double markJava;

    public Student() {
    }

    public Student(String studentCode, String studentName, int age, boolean sex, double markHTML, double markJavascript, double markJava) {
        this.studentCode = studentCode;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.markHTML = markHTML;
        this.markJavascript = markJavascript;
        this.markJava = markJava;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public double getMarkHTML() {
        return markHTML;
    }

    public void setMarkHTML(double markHTML) {
        this.markHTML = markHTML;
    }

    public double getMarkJavascript() {
        return markJavascript;
    }

    public void setMarkJavascript(double markJavascript) {
        this.markJavascript = markJavascript;
    }

    public double getMarkJava() {
        return markJava;
    }

    public void setMarkJava(double markJava) {
        this.markJava = markJava;
    }

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Student Code: ");
        this.studentCode = sc.nextLine();
        System.out.print("Student Name: ");
        this.studentName = sc.nextLine();
        System.out.print("Age: ");
        this.age = sc.nextInt();
        System.out.print("Sex: ");
        this.sex = sc.nextBoolean();
        System.out.print("Mark HTML: ");
        this.markHTML = sc.nextDouble();
        System.out.print("Mark Javascript: ");
        this.markJava = sc.nextDouble();
        System.out.print("Mark Java: ");
        this.markJavascript = sc.nextDouble();
    }

    public void showData(){
        System.out.println("Student Code: " + this.studentCode);
        System.out.println("Student Name: " + this.studentName);
        System.out.println("Age: " + this.age);
        System.out.println("Sex: " + (this.sex ? "Nam" : "Nu"));
        System.out.println("Mark HTML: " + this.markHTML);
        System.out.println("Mark Javascript: " + this.markJavascript);
        System.out.println("Mark Java: " + this.markJava);
    }

    public void consider(){
        double average = (this.markHTML + this.markJava + this.markJavascript) / 3;
        if (average >= 8) {
            System.out.println("Giỏi.");
        }else if (average >= 7) {
            System.out.println("Khá.");
        }else if (average >= 5) {
            System.out.println("Trung bình.");
        }else {
            System.out.println("Trượt.");
        }
    }
}
