package car.example.bean;

public class MyBean {
    private String message;
    public MyBean(){

    }
    public void setMessage(String message) {
        this.message = message;
    }
    @Override
    public String toString() {
        return "MyBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
