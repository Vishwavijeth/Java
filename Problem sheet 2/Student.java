class Student {
    double totalScore;
    double quizNum;
    String Student_name;
    
    Student(String name){
        //this.name = name;
        Student_name = name;
    }
    
    void getName(){
        System.out.print("Name : " +Student_name);
    }
    
    void addQuiz(double score){
        totalScore += score;
        quizNum++;
    }
    
    void getTotalScore(){
        System.out.print(totalScore);
    }
    
    void averageScore(){
        double average = totalScore / quizNum;
        System.out.print("Average : " +average);
    }
}

class Stud{
    public static void main(String[] args){
    Student s1 = new Student("a");
    s1.getName();
    s1.addQuiz(70);
    s1.addQuiz(70);
    s1.getTotalScore();
    s1.averageScore();
    }
}
