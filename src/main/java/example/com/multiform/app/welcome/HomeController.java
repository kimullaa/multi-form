package example.com.multiform.app.welcome;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;

@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model) {
        return "welcome/home";
    }

    @RequestMapping(value = "/entry", method = RequestMethod.POST)
    public String entry(@Validated ParentForm form, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "welcome/home";
        }
        return "welcome/home";
    }

    @ModelAttribute
    public ParentForm setUpParentForm() {
        ParentForm parentForm = new ParentForm();
        parentForm.setUserFormList(Arrays.asList(new UserForm("value1", "value2"), new UserForm("value3", "value4")));
        return parentForm;
    }

}
