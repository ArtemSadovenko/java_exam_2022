package task_1;

public class InvalidData extends Throwable {
    private String massage;

    public InvalidData(String massage) {
        this.massage = massage;
    }

    public void invoke(){
        System.out.println(massage);
    }

}
