package com.lorelei.controller;

import com.lorelei.model.user.User;
import com.lorelei.model.user.UserDTO;
import com.lorelei.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@RestController
@RequestMapping("/v1")
public class RegistrationController
{
    @Autowired
    private UserService userService;

    @PostMapping("/user/registration")
    public ModelAndView register(
            @ModelAttribute("user") @Valid UserDTO userDTO,
            HttpServletRequest httpServletRequest,
            Errors errors)
    {
        ModelAndView mav = new ModelAndView();

        User user = userService.register(userDTO);

        mav.addObject("user", user);

        return mav;
    }
}
