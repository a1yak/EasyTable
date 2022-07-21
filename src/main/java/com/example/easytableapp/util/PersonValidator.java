package com.example.easytableapp.util;

import com.example.easytableapp.Models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
@Component
public class PersonValidator  implements Validator {


    @Override
    public boolean supports(Class<?> clazz) {
        return Person.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Person person = (Person) target;

        ValidationUtils.rejectIfEmpty(errors,"name","","Please enter your name");
        ValidationUtils.rejectIfEmpty(errors,"surname","","Please enter your surname");
        ValidationUtils.rejectIfEmpty(errors,"birthDate","","Please enter your birthdate");

    }
}
