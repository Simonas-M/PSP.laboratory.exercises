package com.simonas.psp.survey;

import com.simonas.psp.survey.data.factory.UpcaseUserFactory;
import com.simonas.psp.survey.data.factory.UserFactory;
import com.simonas.psp.survey.facade.ExecutionFacade;
import com.simonas.psp.survey.facade.SurveyFacade;
import com.simonas.psp.survey.facade.UserFacade;
import com.simonas.psp.survey.facade.execution.SimpleExecutionFacade;
import com.simonas.psp.survey.facade.survey.MockedSurveyFacade;
import com.simonas.psp.survey.facade.user.AnonymousUserFacade;
import com.simonas.psp.survey.service.InformationDeliveryService;
import com.simonas.psp.survey.integration.information.EmailService;
import com.simonas.psp.survey.repository.ExecutionRepository;
import com.simonas.psp.survey.repository.SurveyRepository;
import com.simonas.psp.survey.repository.UserRepository;
import com.simonas.psp.survey.repository.execution.RepeatedExecutionRepository;
import com.simonas.psp.survey.repository.survey.MockedSurveyRepository;
import com.simonas.psp.survey.repository.user.MockedUserRepository;
import com.simonas.psp.survey.service.UserService;
import com.simonas.psp.survey.service.user.MockedUserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class AppConfigMocked {

    @Bean
    public SurveyRepository surveyRepository() {
        return new MockedSurveyRepository();
    }
    @Bean
    public UserRepository userRepository() {
        return new MockedUserRepository(userFactory());
    }
    @Bean
    public ExecutionRepository executionRepository() {
        return new RepeatedExecutionRepository();
    }

    @Bean
    public ExecutionFacade executionFacade() {
        return new SimpleExecutionFacade(executionRepository(), surveyRepository(), userRepository());
    }
    @Bean
    public SurveyFacade surveyFacade() { return new MockedSurveyFacade(surveyRepository()); }
    @Bean
    public UserFacade userFacade() {
        return new AnonymousUserFacade(userRepository(), userService());
    }


    @Bean
    public UserService userService() {
        return new MockedUserService(userFactory());
    }


    @Bean
    public UserFactory userFactory() {
        return new UpcaseUserFactory();
    }


    @Bean
    public InformationDeliveryService informationDeliveryService() {
        return new EmailService();
    }
}
