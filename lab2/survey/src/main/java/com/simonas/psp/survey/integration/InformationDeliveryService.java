package com.simonas.psp.survey.integration;

import com.simonas.psp.survey.data.entity.User;

public interface InformationDeliveryService {
    boolean sendMessage(User user, String message);
}
