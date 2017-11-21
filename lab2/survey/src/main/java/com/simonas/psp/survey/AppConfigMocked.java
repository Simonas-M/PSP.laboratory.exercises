package com.simonas.psp.survey;

import com.simonas.psp.survey.data.factories.UpcaseUserFactory;
import com.simonas.psp.survey.data.factories.UserFactory;
import com.simonas.psp.survey.facades.ExecutionFacade;
import com.simonas.psp.survey.facades.SurveyFacade;
import com.simonas.psp.survey.facades.UserFacade;
import com.simonas.psp.survey.facades.execution.SimpleExecutionFacade;
import com.simonas.psp.survey.facades.survey.MockedSurveyFacade;
import com.simonas.psp.survey.facades.user.AnonymousUserFacade;
import com.simonas.psp.survey.repositories.SurveyRepository;
import com.simonas.psp.survey.repositories.UserRepository;
import com.simonas.psp.survey.repositories.survey.MockedSurveyRepository;
import com.simonas.psp.survey.repositories.user.MockedUserRepository;
import com.simonas.psp.survey.services.UserService;
import com.simonas.psp.survey.services.user.SimpleUserService;
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
    public ExecutionFacade executionFacade() {
        return new SimpleExecutionFacade();
    }
    @Bean
    public SurveyFacade surveyFacade() { return new MockedSurveyFacade(surveyRepository()); }
    @Bean
    public UserFacade userFacade() {
        return new AnonymousUserFacade();
    }


    @Bean
    public UserService userService() {
        return new SimpleUserService(userRepository());
    }


    @Bean
    public UserFactory userFactory() {
        return new UpcaseUserFactory();
    }
}
