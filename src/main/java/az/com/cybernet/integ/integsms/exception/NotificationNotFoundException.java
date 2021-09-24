package az.com.cybernet.integ.integsms.exception;

public class NotificationNotFoundException extends NotFoundException {

    public static final String MESSAGE = "Notification with id %s does not exist.";
    private static final long serialVersionUID = 58432132487812L;

    public NotificationNotFoundException(Long id) {
        super(String.format(MESSAGE, id));
    }
}
