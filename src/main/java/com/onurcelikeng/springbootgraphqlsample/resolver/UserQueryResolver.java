package com.onurcelikeng.springbootgraphqlsample.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.onurcelikeng.springbootgraphqlsample.model.User;
import com.onurcelikeng.springbootgraphqlsample.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class UserQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private UserRepository userRepository;

    public User getByIdentityNumber(Long identityNumber) {
        return userRepository.getByIdentityNumber(identityNumber);
    }

    public List<User> getUsersByBirthPlace(String birthPlace) {
        return userRepository.getUsersByBirthPlace(birthPlace);
    }
}
