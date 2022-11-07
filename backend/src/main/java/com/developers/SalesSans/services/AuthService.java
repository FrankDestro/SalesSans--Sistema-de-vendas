package com.developers.SalesSans.services;

import com.developers.SalesSans.entities.User;
import com.developers.SalesSans.repositories.UserRepository;
import com.developers.SalesSans.services.exceptions.ForbiddenException;
import com.developers.SalesSans.services.exceptions.UnauthorizedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.transaction.annotation.Transactional;

public class AuthService {

    @Autowired
    private UserRepository userRepository;

    // Buscar o usuario autenticado.
    @Transactional(readOnly = true)
    public User authenticated() {
        try {
            String username = SecurityContextHolder.getContext().getAuthentication().getName();
            return userRepository.findByEmail(username);

        } catch (Exception e) {
            throw new UnauthorizedException("Invalid User");
        }
    }

    // verificar o usuario logado e ele mesmo ou admin.
    public void validateSelfOrAdmin(Long userId) {
        User user = authenticated();
        if (!user.getId().equals(userId) && !user.hasRole("ROLE_ADMIN")) {
            throw new ForbiddenException("Acess denied");
        }
    }

    // Validar se o usuario logado e admin.
    public void validaIfUserIsAdmin() {
        User user = authenticated();
        if (!user.hasRole("ROLE_ADMIN")) {
            throw new ForbiddenException("Acess denied");
        }

    }

}



