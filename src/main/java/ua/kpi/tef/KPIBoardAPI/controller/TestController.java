package ua.kpi.tef.KPIBoardAPI.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.kpi.tef.KPIBoardAPI.entity.User;
import ua.kpi.tef.KPIBoardAPI.repository.UserRepository;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class TestController {
    private final UserRepository repository;
    @GetMapping
    public String test() {
        User user = new User();
        user.setName("Orest");
        repository.save(user);
        return "Hello World";
    }
}
