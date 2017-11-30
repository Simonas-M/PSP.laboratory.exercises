package com.simonas.psp.survey.service;

import com.simonas.psp.survey.data.entity.User;

public interface InformationDeliveryService {
    boolean sendMessage(User user, String message);
}
