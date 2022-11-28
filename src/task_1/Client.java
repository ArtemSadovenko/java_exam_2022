package task_1;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Client {
    private long id;
    private String name;
    private String surname;
    private String email;
    private int salary;

    public Client(String name, String surname, String email, int salary) {
        try {
            validate(name, surname, email, salary);
            this.id = -1l;
            this.name = name;
            this.surname = surname;
            this.email = email;
            this.salary = salary;
        }catch (InvalidData e){
            e.invoke();
        }
    }

    public boolean validate(String name, String surname, String email, int salary)throws InvalidData{
        if(name.isEmpty() || surname.isEmpty() || salary < 0 || !(email.contains("@gmail.com")) ){
            throw new InvalidData("Invalid Data");
        }
        return true;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Client() {
    }
}
