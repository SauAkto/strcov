package ru.streetcover.strcov.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DataIndicators {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private double area;
    private double primerConsumptions; // расход праймера
    private double topLayerThickness; //толщина верхнего слоя
    private double EPDMConsumption;// расход ЭПДМ
    private double bottomLayerThickness; //толщина нижнего слоя
    private double SBRConsumption; // расход черной крошки
    private double numberOfCoatingLayers; // количество слоев покрытия
    private double topBinderConsumption; //расход клея верх
    private double buttonBinderConsumption; // расход клея низ
    private double solvenConsumption; // расход растворителя
    private double priceEPDM; // стоимость ЭПДМ
    private double pricePrimer; // стоимость праймер
    private double priceSBR; // стоимость чераня крошка
    private double priceSolven; // стоимость растворитель
    private double priceBinderRUBbarrel; // стоимость клея в рублях, бочка
    private double priceBinderEURObarrel; // стоимость клея в евроб  бочка
    private double priceBinderUSDbarrel; // стоимость клея в долларах, бочка
    private double priceBinderRUBbucket; // стоимость клея в рублях, ведро
    private double priceBinderEURObucket; // стоимость клея в евроб, ведро
    private double priceBinderUSDbucket; // стоимость клея в долларах, ведро
    private double sizePrimerBucket; // размер ведра праймера
    private double sizeBinderBucket; // размер ведра клея
    private double sizeSalvenCanister; // размер канистры растворителя
    private double sizeEPDMbag;// размера мешка ЭПДМ
    private double sizeSBRbag; // размер мешка черной крошки
    private double sizeBinderBarrel; // размер бочки клея
    private double rateEURO; // курс евро

    public DataIndicators() {

    }

    public double getRateEURO() {
        return rateEURO;
    }

    public void setRateEURO(double rateEURO) {
        this.rateEURO = rateEURO;
    }

    public double getRateUSD() {
        return rateUSD;
    }

    public void setRateUSD(double rateUSD) {
        this.rateUSD = rateUSD;
    }

    private double rateUSD; // курс доллара


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = Double.parseDouble(area);
    }

    public double getPrimerConsumptions() {
        return primerConsumptions;
    }

    public void setPrimerConsumptions(String primerConsumptions) {
        this.primerConsumptions = Double.parseDouble(primerConsumptions);
    }

    public double getTopLayerThickness() {
        return topLayerThickness;
    }

    public void setTopLayerThickness(String topLayerThickness) {
        this.topLayerThickness = Double.parseDouble(topLayerThickness);
    }

    public double getEPDMConsumption() {
        return EPDMConsumption;
    }

    public void setEPDMConsumption(String EPDMConsumption) {
        this.EPDMConsumption = Double.parseDouble(EPDMConsumption);
    }

    public double getBottomLayerThickness() {
        return bottomLayerThickness;
    }

    public void setBottomLayerThickness(String bottomLayerThickness) {
        this.bottomLayerThickness = Double.parseDouble(bottomLayerThickness);
    }

    public double getSBRConsumption() {
        return SBRConsumption;
    }

    public void setSBRConsumption(String SBRConsumption) {
        this.SBRConsumption = Double.parseDouble(SBRConsumption);
    }

    public double getNumberOfCoatingLayers() {
        return numberOfCoatingLayers;
    }

    public void setNumberOfCoatingLayers(String numberOfCoatingLayers) {
        this.numberOfCoatingLayers = Double.parseDouble(numberOfCoatingLayers);
    }

    public double getTopBinderConsumption() {
        return topBinderConsumption;
    }

    public void setTopBinderConsumption(String topBinderConsumption) {
        this.topBinderConsumption = Double.parseDouble(topBinderConsumption);
    }

    public double getButtonBinderConsumption() {
        return buttonBinderConsumption;
    }

    public void setButtonBinderConsumption(String buttonBinderConsumption) {
        this.buttonBinderConsumption = Double.parseDouble(buttonBinderConsumption);
    }

    public double getSolvenConsumption() {
        return solvenConsumption;
    }

    public void setSolvenConsumption(String solvenConsumption) {
        this.solvenConsumption = Double.parseDouble(solvenConsumption);
    }

    public double getPriceEPDM() {
        return priceEPDM;
    }

    public void setPriceEPDM(String priceEPDM) {
        this.priceEPDM = Double.parseDouble(priceEPDM);
    }

    public double getPricePrimer() {
        return pricePrimer;
    }

    public void setPricePrimer(String pricePrimer) {
        this.pricePrimer = Double.parseDouble(pricePrimer);
    }

    public double getPriceSBR() {
        return priceSBR;
    }

    public void setPriceSBR(String priceSBR) {
        this.priceSBR = Double.parseDouble(priceSBR);
    }

    public double getPriceSolven() {
        return priceSolven;
    }

    public void setPriceSolven(double priceSolven) {
        this.priceSolven = priceSolven;
    }

    public double getPriceBinderRUBbarrel() {
        return priceBinderRUBbarrel;
    }

    public void setPriceBinderRUBbarrel(String priceBinderRUBbarrel) {
        this.priceBinderRUBbarrel = Double.parseDouble(priceBinderRUBbarrel);
    }

    public double getPriceBinderEURObarrel() {
        return priceBinderEURObarrel;
    }

    public void setPriceBinderEURObarrel(String priceBinderEURObarrel) {
        this.priceBinderEURObarrel = Double.parseDouble(priceBinderEURObarrel);
    }

    public double getPriceBinderUSDbarrel() {
        return priceBinderUSDbarrel;
    }

    public void setPriceBinderUSDbarrel(double priceBinderUSDbarrel) {
        this.priceBinderUSDbarrel = priceBinderUSDbarrel;
    }

    public double getPriceBinderRUBbucket() {
        return priceBinderRUBbucket;
    }

    public void setPriceBinderRUBbucket(double priceBinderRUBbucket) {
        this.priceBinderRUBbucket = priceBinderRUBbucket;
    }

    public double getPriceBinderEURObucket() {
        return priceBinderEURObucket;
    }

    public void setPriceBinderEURObucket(double priceBinderEURObucket) {
        this.priceBinderEURObucket = priceBinderEURObucket;
    }

    public double getPriceBinderUSDbucket() {
        return priceBinderUSDbucket;
    }

    public void setPriceBinderUSDbucket(double priceBinderUSDbucket) {
        this.priceBinderUSDbucket = priceBinderUSDbucket;
    }

    public double getSizePrimerBucket() {
        return sizePrimerBucket;
    }

    public void setSizePrimerBucket(double sizePrimerBucket) {
        this.sizePrimerBucket = sizePrimerBucket;
    }

    public double getSizeBinderBucket() {
        return sizeBinderBucket;
    }

    public void setSizeBinderBucket(double sizeBinderBucket) {
        this.sizeBinderBucket = sizeBinderBucket;
    }

    public double getSizeSalvenCanister() {
        return sizeSalvenCanister;
    }

    public void setSizeSalvenCanister(double sizeSalvenCanister) {
        this.sizeSalvenCanister = sizeSalvenCanister;
    }

    public double getSizeEPDMbag() {
        return sizeEPDMbag;
    }

    public void setSizeEPDMbag(double sizeEPDMbag) {
        this.sizeEPDMbag = sizeEPDMbag;
    }

    public double getSizeSBRbag() {
        return sizeSBRbag;
    }

    public void setSizeSBRbag(double sizeSBRbag) {
        this.sizeSBRbag = sizeSBRbag;
    }

    public double getSizeBinderBarrel() {
        return sizeBinderBarrel;
    }

    public void setSizeBinderBarrel(double sizeBinderBarrel) {
        this.sizeBinderBarrel = sizeBinderBarrel;
    }


}
