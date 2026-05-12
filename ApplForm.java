package ClassAndObj.java;

class AppForm {
    String name;
    int rollno;


    public void display() {
        System.out.println(name);
        System.out.println(rollno);
    }
    public void setValues(String str, int num) {
        name = str;
        rollno = num;
    }
}

class main {
     AppForm viwer;

    public void main(String[] args) {
        AppForm codeio = new AppForm();
        codeio.setValues("codeio",101);
        codeio.rollno = 101;
        codeio.display();


        ApplForm viewer = new ApplForm();
        viewer.name = "viewer";
        viewer.rollno = 12334;
        viwer.display();
    }
}

