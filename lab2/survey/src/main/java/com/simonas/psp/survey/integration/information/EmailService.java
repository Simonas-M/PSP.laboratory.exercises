package com.simonas.psp.survey.integration.information;

import com.simonas.psp.survey.data.entity.User;
import com.simonas.psp.survey.service.InformationDeliveryService;
import org.springframework.stereotype.Component;

@Component
public class EmailService implements InformationDeliveryService {
    @Override
    public boolean sendMessage(User user, String message) {
        System.out.println("\nSending message to " + user.getNickname() + " via Email:");
        System.out.println(message);
        return true;
    }
}
