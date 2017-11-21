package com.simonas.psp.survey;

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
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public SurveyRepository surveyRepository() {
        return new MockedSurveyRepository();
    }

    @Bean
    public UserRepository userRepository() {
        return new MockedUserRepository();
    }

    @Bean
    public ExecutionFacade executionFacade() {
        return new SimpleExecutionFacade();
    }

    @Bean
    public SurveyFacade surveyFacade() {
        return new MockedSurveyFacade(surveyRepository());
    }

    @Bean
    public UserFacade userFacade() {
        return new AnonymousUserFacade();
    }
}
