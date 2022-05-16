package pl.marcinsalamandra.util;

import org.springframework.stereotype.Service;

@Service
public class PhoneNumberSplitter {

    public String splitPhoneNumber(String phone) {
        StringBuilder phoneAfterSplit = new StringBuilder();

        for (int i = 0; i < 9; i += 3) {
            phoneAfterSplit.append(phone, i, Math.min(9, i + 3));

            if(i < 6) {
                phoneAfterSplit.append(' ');
            }
        }

        return phoneAfterSplit.toString();
    }
}
