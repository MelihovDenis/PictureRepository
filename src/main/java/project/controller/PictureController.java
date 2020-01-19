package project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class PictureController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String downloadIndex() {
        return "index";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String downloadImage(@RequestParam("file") MultipartFile multipartFile, Model model) {
        model.addAttribute("file", multipartFile);
        return "index";
    }
}
