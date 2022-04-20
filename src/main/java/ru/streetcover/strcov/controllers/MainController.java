package ru.streetcover.strcov.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.streetcover.strcov.models.DataIndicators;
import ru.streetcover.strcov.repository.DataIndicatorsRepository;

@Controller
public class MainController {

    @Autowired
    private DataIndicatorsRepository dataIndicatorsRepository;

    @GetMapping("/")
    public String homePage(Model model) {
        Iterable<DataIndicators> dataIndicators = dataIndicatorsRepository.findAll();
        model.addAttribute("dataIndicators", dataIndicators);
//        model.addAttribute("area", get);

        model.addAttribute("title", "Страница расчетов");
        return "home";
    }

    @PostMapping("/index/")
    public String HomePageRezult(@PathVariable(value="id") long id,
                                 @RequestParam String area,
                                 @RequestParam String primerConsumptions,
                                 @RequestParam String topLayerThickness,
                                 @RequestParam String EPDMConsumption,
                                 @RequestParam String bottomLayerThickness,
                                 @RequestParam String SBRConsumption,
                                 @RequestParam String numberOfCoatingLayers,
                                 @RequestParam String topBinderConsumption,
                                 @RequestParam String buttonBinderConsumption,
                                 @RequestParam String solvenConsumption,
                                 @RequestParam String priceEPDM,
                                 @RequestParam String priceBinderRUBbarrel,
                                 @RequestParam String priceBinderEURObarrel,
                                 @RequestParam String priceSBR,
                                 @RequestParam String pricePrimer
    ){
        DataIndicators dataIndicators = new DataIndicators();
        return "index";
    }

}
