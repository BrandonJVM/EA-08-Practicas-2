/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EA_08_Practicas_2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller

public class ArbolController {

    @GetMapping("/")
    public String index(Model model) {
        List<String> trees = Arrays.asList("Oak", "Pine", "Maple", "Birch", "Willow");
        model.addAttribute("trees", trees);
        return "index";
    }

}
