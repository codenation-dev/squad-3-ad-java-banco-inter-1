package br.com.codenation.errordashboard.service.interfaces;

import br.com.codenation.errordashboard.domain.dto.UserDTO;
import br.com.codenation.errordashboard.domain.entity.User;

public interface UserServiceInterface {

    User getUserDetails(String email);

    UserDTO createUser(String name, String email, String password);

    User findByEmail(String email);
    UserDTO save(User user);
}
