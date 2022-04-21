package ru.streetcover.strcov.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.streetcover.strcov.models.DataIndicators;
import ru.streetcover.strcov.repository.DataIndicatorsRepository;

@Controller
public class indicators {

    @Autowired
    private DataIndicatorsRepository dataIndicatorsRepository;

    @GetMapping("/indicators")
    public String indicators(Model model){

        Iterable<DataIndicators> dataIndicators = dataIndicatorsRepository.findAll();
        model.addAttribute("dataIndicators", dataIndicators);

        model.addAttribute("title", "Данные");
        return "indicators";
    }

    @GetMapping("/home/indicators") //уход от дублей адресной строки /home/indicators
    public String indicatorsR(Model model){

        Iterable<DataIndicators> dataIndicators = dataIndicatorsRepository.findAll();
        model.addAttribute("dataIndicators", dataIndicators);

        model.addAttribute("title", "Данные");
        return "indicators";
    }
}
