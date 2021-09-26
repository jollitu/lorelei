package com.lorelei.controller;

import com.lorelei.user.UserDTO;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

public class RegistrationController
{
    public ModelAndView register(
            @ModelAttribute("user") @Valid UserDTO userDTO,
            HttpServletRequest httpServletRequest,
            Errors errors)
    {
        return null;
    }
}
