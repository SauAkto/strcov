package ru.streetcover.strcov.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/indicators/{id}")
    public String getParametr(@PathVariable(value = "id") long id,
                              @RequestParam String primerConsumptions,
                              @RequestParam String EPDMConsumption,
                              @RequestParam String SBRConsumption,
                              @RequestParam String topBinderConsumption,
                              @RequestParam String buttonBinderConsumption,
                              @RequestParam String solvenConsumption,
                              @RequestParam String priceEPDM,
                              @RequestParam String pricePrimer,
                              @RequestParam String priceSBR,
                              @RequestParam String priceSolven,
                              @RequestParam String sizePrimerBucket,
                              @RequestParam String sizeSalvenCanister,
                              @RequestParam String sizeEPDMbag,
                              @RequestParam String sizeSBRbag,
                              @RequestParam String sizeBinderBarrel,
                              @RequestParam String sizeBinderBucket,
                              @RequestParam String rateEURO,
                              @RequestParam String rateUSD,
                              @RequestParam String priceBinderRUBbarrel,
                              @RequestParam String priceBinderEURObarrel,
                              @RequestParam String priceBinderUSDbarrel,
                              @RequestParam String priceBinderRUBbucket,
                              @RequestParam String priceBinderEURObucket,
                              @RequestParam String priceBinderUSDbucket,
                              @RequestParam String priceBinderRUBbarrelBL,
                              @RequestParam String priceBinderEURObarrelBL,
                              @RequestParam String priceBinderUSDbarrelBL,
                              @RequestParam String priceBinderRUBbucketBL,
                              @RequestParam String priceBinderEURObucketBL,
                              @RequestParam String priceBinderUSDbucketBL,
                              Model model)
    {
        DataIndicators dataIndicators = dataIndicatorsRepository.findById(id).orElseThrow();
        dataIndicators.setPrimerConsumptions(primerConsumptions);
        dataIndicators.setEPDMConsumption(EPDMConsumption);
        dataIndicators.setSBRConsumption(SBRConsumption);
        dataIndicators.setTopBinderConsumption(topBinderConsumption);
        dataIndicators.setButtonBinderConsumption(buttonBinderConsumption);
        dataIndicators.setSolvenConsumption(solvenConsumption);
        dataIndicators.setPriceEPDM(priceEPDM);
        dataIndicators.setPricePrimer(pricePrimer);
        dataIndicators.setPriceSBR(priceSBR);
        dataIndicators.setPriceSolven(priceSolven);
        dataIndicators.setSizePrimerBucket(sizePrimerBucket);
        dataIndicators.setSizeSalvenCanister(sizeSalvenCanister);
        dataIndicators.setSizeEPDMbag(sizeEPDMbag);
        dataIndicators.setSizeSBRbag(sizeSBRbag);
        dataIndicators.setSizeBinderBarrel(sizeBinderBarrel);
        dataIndicators.setSizeBinderBucket(sizeBinderBucket);
        dataIndicators.setRateEURO(rateEURO);
        dataIndicators.setRateUSD(rateUSD);
        dataIndicators.setPriceBinderRUBbarrel(priceBinderRUBbarrel);
        dataIndicators.setPriceBinderEURObarrel(priceBinderEURObarrel);
        dataIndicators.setPriceBinderUSDbarrel(priceBinderUSDbarrel);
        dataIndicators.setPriceBinderRUBbucket(priceBinderRUBbucket);
        dataIndicators.setPriceBinderEURObucket(priceBinderEURObucket);
        dataIndicators.setPriceBinderUSDbucket(priceBinderUSDbucket);
        dataIndicators.setPriceBinderRUBbarrelBL(priceBinderRUBbarrelBL);
        dataIndicators.setPriceBinderEURObarrelBL(priceBinderEURObarrelBL);
        dataIndicators.setPriceBinderUSDbarrelBL(priceBinderUSDbarrelBL);
        dataIndicators.setPriceBinderRUBbucketBL(priceBinderRUBbucketBL);
        dataIndicators.setPriceBinderEURObucketBL(priceBinderEURObucketBL);
        dataIndicators.setPriceBinderUSDbucketBL(priceBinderUSDbucketBL);

        dataIndicatorsRepository.save(dataIndicators);

        Iterable<DataIndicators> dataInd = dataIndicatorsRepository.findAll();
        model.addAttribute("dataIndicators", dataInd);
        model.addAttribute("title", "Страница ввода данных");

        return "indicators";
    }
}
