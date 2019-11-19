package Travelicon.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by Shereeba Pruitt
 */

@Controller
@RequestMapping(value = "travelicon")
public class TravelController {

    //Request path: /travelicon
    @RequestMapping(value = "")
    public String index(Model model) {
        model.addAttribute("title", "Travelicon");
        return "travelicon/index";
    }

    // Request path: travelicon/destinations
    @RequestMapping(value = "destinations")
    public String destination(Model model) {
        model.addAttribute("title", "Destinations");
        return "travelicon/destinations";
    }
}
