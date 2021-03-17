package pl.coderslab.beans;

public class EmailService implements MessageService{

    private String message;

    public EmailService(String message) {
        this.message = message;
    }

    @Override
    public void send() {
        System.out.println("Sending email");
    }

    @Override
    public void send(String message) {
        System.out.println(message);
    }
}
