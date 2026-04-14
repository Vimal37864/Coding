class Student{

    String name;
    int rollno;

    void study(){
        System.out.println(name + "student is studying");
    }


    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "vimal";
        s1.rollno = 101;

        s1.study();

    } 

}
          