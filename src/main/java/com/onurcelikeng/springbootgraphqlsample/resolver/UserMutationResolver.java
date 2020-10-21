package com.onurcelikeng.springbootgraphqlsample.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.onurcelikeng.springbootgraphqlsample.dto.UserDTO;
import com.onurcelikeng.springbootgraphqlsample.model.User;
import com.onurcelikeng.springbootgraphqlsample.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserMutationResolver implements GraphQLMutationResolver {

    @Autowired
    private UserRepository userRepository;

    public User createUser(UserDTO userDTO) {
        return userRepository.save(User.builder()
                .name(userDTO.getName())
                .surname(userDTO.getSurname())
                .identityNumber(userDTO.getIdentityNumber())
                .gender(userDTO.getGender())
                .birthPlace(userDTO.getBirthPlace())
                .build());
    }

}
