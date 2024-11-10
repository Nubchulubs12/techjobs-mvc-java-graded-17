//package org.launchcode.techjobsmvc.controllers;
//
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import java.util.HashMap;
//
//public class TechJobsController {
//     static HashMap<String, String> actionChoices = new HashMap<>();
//
//    public TechJobsController() {
//        actionChoices.put("Search", "search");
//        actionChoices.put("List", "list");
//    }
//    @ModelAttribute("actions")
//    public static HashMap<String, String> getActionChoices(Model model) {
//        return actionChoices;
//    }
//
//}
