public class Student {

    int phone;
    String name;

    //Конструктор - джава метод,
    //Который выплняется первым при создании обьекта
    public Student(int phone, String name) {
        this.phone = phone;
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
