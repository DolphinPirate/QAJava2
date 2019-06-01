public class Main {

    public static void main(String[] args) {
       /*
        //локальные переменые
        int a = 0;
        byte b = 10;
        String hello = "";
        String newHello;
        boolean yesNo = false;

        //sayHello("Bey!");
        //sayHello("Chao!");*/

       Student student = new Student(11111, "Artem");
        printDetalis(student);
        Student student007 = new Student(33333,"Jon");
        printDetalis(student007);

    }

    public static void printDetalis(Student student){
        System.out.println(student.getName());
        System.out.println(student.getPhone() );
    }

    public static void sayHello(String phrase){
        System.out.println(phrase);
    }

    /*public static void sayHello2(){
        System.out.println("Bey!");
    }*/
}
