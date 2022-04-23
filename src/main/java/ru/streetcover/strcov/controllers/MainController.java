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
        model.addAttribute("title", "Страница расчетов");
        return "home";
    }

    @GetMapping("/home")
    public String homePages(Model model) {
        Iterable<DataIndicators> dataIndicators = dataIndicatorsRepository.findAll();
        model.addAttribute("dataIndicators", dataIndicators);
        model.addAttribute("title", "Страница расчетов");
        return "home";
    }

    @GetMapping("/home/home") //уход от дублей адресной строки /home/home
    public String homePagesR(Model model) {
        Iterable<DataIndicators> dataIndicators = dataIndicatorsRepository.findAll();
        model.addAttribute("dataIndicators", dataIndicators);
        model.addAttribute("title", "Страница расчетов");
        return "home";
    }

    @GetMapping("/home/{id}")
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
                                 @RequestParam String pricePrimer,
                                 Model model
    ){

        DataIndicators dataIndicators = dataIndicatorsRepository.findById(id).orElseThrow(); //ручками прописал ид, заменить на персональный
        dataIndicators.setArea(area);
        dataIndicators.setPrimerConsumptions(primerConsumptions);
        dataIndicators.setTopLayerThickness(topLayerThickness);
        dataIndicators.setEPDMConsumption(EPDMConsumption);
        dataIndicators.setBottomLayerThickness(bottomLayerThickness);
        dataIndicators.setSBRConsumption(SBRConsumption);
        dataIndicators.setNumberOfCoatingLayers(numberOfCoatingLayers);
        dataIndicators.setTopBinderConsumption(topBinderConsumption);
        dataIndicators.setButtonBinderConsumption(buttonBinderConsumption);
        dataIndicators.setSolvenConsumption(solvenConsumption);
        dataIndicators.setPriceEPDM(priceEPDM);
        dataIndicators.setPriceBinderRUBbarrel(priceBinderRUBbarrel);
        dataIndicators.setPriceBinderEURObarrel(priceBinderEURObarrel);
        dataIndicators.setPriceSBR(priceSBR);
        dataIndicators.setPricePrimer(pricePrimer);

        dataIndicatorsRepository.save(dataIndicators);

        Iterable<DataIndicators> dataInd = dataIndicatorsRepository.findAll();
        model.addAttribute("dataIndicators", dataInd);
        model.addAttribute("title", "Страница расчетов");

        return "home";
    }
    @GetMapping("/indicators/home") //уход от дублей адресной строки /home/home
    public String homePagesRI(Model model) {
        Iterable<DataIndicators> dataIndicators = dataIndicatorsRepository.findAll();
        model.addAttribute("dataIndicators", dataIndicators);
        model.addAttribute("title", "Страница расчетов");
        return "home";
    }

    @GetMapping("indicators/home/{id}")
    public String HomePageRezultI(@PathVariable(value="id") long id,
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
                                 @RequestParam String pricePrimer,
                                 Model model
    ){

        DataIndicators dataIndicators = dataIndicatorsRepository.findById(id).orElseThrow(); //ручками прописал ид, заменить на персональный
        dataIndicators.setArea(area);
        dataIndicators.setPrimerConsumptions(primerConsumptions);
        dataIndicators.setTopLayerThickness(topLayerThickness);
        dataIndicators.setEPDMConsumption(EPDMConsumption);
        dataIndicators.setBottomLayerThickness(bottomLayerThickness);
        dataIndicators.setSBRConsumption(SBRConsumption);
        dataIndicators.setNumberOfCoatingLayers(numberOfCoatingLayers);
        dataIndicators.setTopBinderConsumption(topBinderConsumption);
        dataIndicators.setButtonBinderConsumption(buttonBinderConsumption);
        dataIndicators.setSolvenConsumption(solvenConsumption);
        dataIndicators.setPriceEPDM(priceEPDM);
        dataIndicators.setPriceBinderRUBbarrel(priceBinderRUBbarrel);
        dataIndicators.setPriceBinderEURObarrel(priceBinderEURObarrel);
        dataIndicators.setPriceSBR(priceSBR);
        dataIndicators.setPricePrimer(pricePrimer);

        dataIndicatorsRepository.save(dataIndicators);

        Iterable<DataIndicators> dataInd = dataIndicatorsRepository.findAll();
        model.addAttribute("dataIndicators", dataInd);
        model.addAttribute("title", "Страница расчетов");

        return "home";
    }

}
