package com.example.cotroller;

import com.example.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    private ModelAndView user() {
        return new ModelAndView("user", "command", new User());
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    private String addUser(@ModelAttribute("SpringWeb") User user, ModelMap modelMap) {
        modelMap.addAttribute("username", user.getUsername());
        modelMap.addAttribute("password", user.getPassword());
        modelMap.addAttribute("address", user.getAddress());
        modelMap.addAttribute("receivePaper", user.isReceivePaper());
        modelMap.addAttribute("favoriteFrameworks", user.getFavoriteFrameworks());
        modelMap.addAttribute("gender", user.getGender());
        modelMap.addAttribute("favoriteNumber", user.getFavoriteNumber());
        modelMap.addAttribute("country", user.getCountry());
        return "users";
    }

    @ModelAttribute("webFrameworkList")
    private List<String> getWebFrameworkList() {
        List<String> webFrameworkList = new ArrayList<String>();
        webFrameworkList.add("Spring MVC");
        webFrameworkList.add("Struts 1");
        webFrameworkList.add("Struts 2");
        webFrameworkList.add("Apache Wicket");
        return webFrameworkList;
    }

    @ModelAttribute("numbersList")
    private List<String> getNumbersList() {
        List<String> numbersList = new ArrayList<String>();
        numbersList.add("1");
        numbersList.add("2");
        numbersList.add("3");
        numbersList.add("4");
        return numbersList;
    }
    @ModelAttribute("countryList")
    private Map<String, String> getCountryList(){
        Map<String, String> countryList = new HashMap<>();
        countryList.put("US", "United States");
        countryList.put("CH", "China");
        countryList.put("SG", "Singapore");
        countryList.put("MY", "Malaysia");
        return countryList;
    }
}
