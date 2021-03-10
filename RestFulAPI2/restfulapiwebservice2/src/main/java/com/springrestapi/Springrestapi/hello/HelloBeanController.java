package com.springrestapi.Springrestapi.hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloBeanController {
    @Autowired
    private MessageSource messageSource;

    @GetMapping(path = "/hellobean-internationalization")
//    @ApiModelProperty(notes = "good morning message according to locale")
    public String welcome(){
        return messageSource.getMessage("good.morning.message",null,
                LocaleContextHolder.getLocale());
    }

    @GetMapping(path = "/hello")
    @ResponseBody
    //@ApiModelProperty(notes = "displays name given in params along with good morning message")
    public String helloname(@RequestParam(name = "name",defaultValue = "Guest") String name){
        String greet =messageSource.getMessage("good.morning.message",null,
                LocaleContextHolder.getLocale());
        return String.format("%s %s!", greet, name);
    }
}

