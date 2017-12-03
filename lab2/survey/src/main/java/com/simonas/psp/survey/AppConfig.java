package com.simonas.psp.survey;

import com.simonas.psp.survey.data.factory.UpcaseUserFactory;
import com.simonas.psp.survey.data.factory.UserFactory;
import com.simonas.psp.survey.facade.ExecutionFacade;
import com.simonas.psp.survey.facade.SurveyFacade;
import com.simonas.psp.survey.facade.UserFacade;
import com.simonas.psp.survey.facade.execution.SimpleExecutionFacade;
import com.simonas.psp.survey.facade.survey.MockedSurveyFacade;
import com.simonas.psp.survey.facade.user.RegisteredUserFacade;
import com.simonas.psp.survey.service.InformationDeliveryService;
import com.simonas.psp.survey.integration.information.EmailService;
import com.simonas.psp.survey.repository.ExecutionRepository;
import com.simonas.psp.survey.repository.SurveyRepository;
import com.simonas.psp.survey.repository.UserRepository;
import com.simonas.psp.survey.repository.execution.OneTimeExecutionRepository;
import com.simonas.psp.survey.repository.survey.InMemorySurveyRepository;
import com.simonas.psp.survey.repository.user.SimpleUserRepository;
import com.simonas.psp.survey.service.UserService;
import com.simonas.psp.survey.service.user.SimpleUserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public SurveyRepository surveyRepository() {
        return new InMemorySurveyRepository();
    }
    @Bean
    public UserRepository userRepository() {
        return new SimpleUserRepository();
    }
    @Bean
    public ExecutionRepository executionRepository() {
        return new OneTimeExecutionRepository();
    }


    @Bean
    public ExecutionFacade executionFacade() {
        return new SimpleExecutionFacade(executionRepository(), surveyRepository(), userRepository());
    }
    @Bean
    public SurveyFacade surveyFacade() { return new MockedSurveyFacade(surveyRepository()); }
    @Bean
    public UserFacade userFacade() {
        return new RegisteredUserFacade(informationDeliveryService(), userRepository(), userService());
    }


    @Bean
    public UserService userService() {
        return new SimpleUserService(userRepository(), userFactory(), informationDeliveryService());
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