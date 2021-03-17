package pl.coderslab.beans;

public class MessageSender {

    private MessageService messageService;
    public String message;

    public MessageSender(MessageService messageService) {
        this.messageService = messageService;
    }

    public  void sendMessage(){
        messageService.send();
    }


    public void setMessage(String message) {
        this.message = message;
    }

    public void sendMessageFromProperty(){
        messageService.send(message);
    }
}
