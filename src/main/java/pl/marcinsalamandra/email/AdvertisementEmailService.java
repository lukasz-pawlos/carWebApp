package pl.marcinsalamandra.email;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class AdvertisementEmailService {

    private final EmailSender emailSender;

    public void sendEmailAfterPostingAdvert(String toEmail, String secretKey) {
        String message =
                        "Thank you for posting a new advertisement.\n\nWith below key you can edit or delete your advert:\n" + secretKey +
                        "\n\nThis email is generated automatically, please do not reply.";
        String subject = "New advertisement";

        emailSender.sendEmail(toEmail, subject, message);
    }

    public void sendEmailAfterBuying(String toEmail, String buyerEmail, String buyerPhone, String secretKey) {
        String message =
                "Someone had bought your car associated with advertisement key:\n" + secretKey +
                        "\n\nBelow you have buyer's email and phone number:\n\n" +
                        "Email: " + buyerEmail + "\nPhone: " + buyerPhone +
                        "\n\nThis email is generated automatically, please do not reply.";
        String subject = "Your car has been sold";

        emailSender.sendEmail(toEmail, subject, message);
    }
}