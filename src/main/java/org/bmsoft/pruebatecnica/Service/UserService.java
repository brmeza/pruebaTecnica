package org.bmsoft.pruebatecnica.Service;

import org.bmsoft.pruebatecnica.Entity.User;
import org.bmsoft.pruebatecnica.Exception.ConfigDataResourceNotFoundException;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class UserService {

    private final WebClient webClient;

    public UserService(WebClient webClient) {
        this.webClient = webClient;
    }

    @Cacheable(value = "users", key = "#root.methodName", unless = "#result == null", cacheManager = "cacheManager")
    public List<User> getUsers() {
        List<User> users = webClient.get()
                .uri("/users")
                .retrieve()
                .bodyToFlux(User.class)
                .collectList()
                .block();

        if (users == null || users.isEmpty()) {
            throw new ConfigDataResourceNotFoundException("No users found");
        }

        return users;
    }
}