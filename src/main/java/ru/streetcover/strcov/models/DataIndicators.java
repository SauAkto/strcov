package ru.streetcover.strcov.models;

import javax.persistence.*;

@Entity
public class DataIndicators {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;



    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "rezult_id")
    private RezultationData rezultationData;


    private double area; // площадь покрытия
    private double topLayerThickness; //толщина верхнего слоя
    private double bottomLayerThickness; //толщина нижнего слоя

    private double primerConsumptions; // расход праймера
    private double EPDMConsumption;// расход ЭПДМ
    private double SBRConsumption; // расход черной крошки
    private double numberOfCoatingLayers; // количество слоев покрытия
    private double topBinderConsumption; //расход клея верх
    private double buttonBinderConsumption; // расход клея низ
    private double solvenConsumption; // расход растворителя

    private double priceEPDM; // стоимость ЭПДМ
    private double pricePrimer; // стоимость праймер
    private double priceSBR; // стоимость чераня крошка
    private double priceSolven; // стоимость растворитель

    private double sizePrimerBucket; // размер ведра праймера
    private double sizeSalvenCanister; // размер канистры растворителя
    private double sizeEPDMbag;// размера мешка ЭПДМ
    private double sizeSBRbag; // размер мешка черной крошки
    private double sizeBinderBarrel; // размер бочки клея
    private double sizeBinderBucket; // размер ведра клея

    private double rateEURO; // курс евро
    private double rateUSD; // курс доллара
    //стоимость клея стандартного связующего
    private double priceBinderRUBbarrel; // стоимость клея в рублях, бочка
    private double priceBinderEURObarrel; // стоимость клея в евро  бочка
    private double priceBinderUSDbarrel; // стоимость клея в долларах, бочка
    private double priceBinderRUBbucket; // стоимость клея в рублях, ведро
    private double priceBinderEURObucket; // стоимость клея в евроб, ведро
    private double priceBinderUSDbucket; // стоимость клея в долларах, ведро
    //стоимость клея для дешевого келя, подложка
    private double priceBinderRUBbarrelBL; // стоимость клея в рублях, бочка
    private double priceBinderEURObarrelBL; // стоимость клея в евро  бочка
    private double priceBinderUSDbarrelBL; // стоимость клея в долларах, бочка
    private double priceBinderRUBbucketBL; // стоимость клея в рублях, ведро
    private double priceBinderEURObucketBL; // стоимость клея в евроб, ведро
    private double priceBinderUSDbucketBL; // стоимость клея в долларах, ведро

    public DataIndicators() {

    }

    public RezultationData getRezultationData() {
        return rezultationData;
    }

    public void setRezultationData(RezultationData rezultationData) {
        this.rezultationData = rezultationData;
    }

    public double getRateEURO() {
        return rateEURO;
    }

    public void setRateEURO(String rateEURO) {
        this.rateEURO = Double.parseDouble(rateEURO);
    }

    public double getRateUSD() {
        return rateUSD;
    }

    public void setRateUSD(String rateUSD) {
        this.rateUSD = Double.parseDouble(rateUSD);
    }


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

    public void setPriceSolven(String priceSolven) {
        this.priceSolven = Double.parseDouble(priceSolven);
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

    public void setPriceBinderUSDbarrel(String priceBinderUSDbarrel) {
        this.priceBinderUSDbarrel = Double.parseDouble(priceBinderUSDbarrel);
    }

    public double getPriceBinderRUBbucket() {
        return priceBinderRUBbucket;
    }

    public void setPriceBinderRUBbucket(String priceBinderRUBbucket) {
        this.priceBinderRUBbucket = Double.parseDouble(priceBinderRUBbucket);
    }

    public double getPriceBinderEURObucket() {
        return priceBinderEURObucket;
    }

    public void setPriceBinderEURObucket(String priceBinderEURObucket) {
        this.priceBinderEURObucket = Double.parseDouble(priceBinderEURObucket);
    }

    public double getPriceBinderUSDbucket() {
        return priceBinderUSDbucket;
    }

    public void setPriceBinderUSDbucket(String priceBinderUSDbucket) {
        this.priceBinderUSDbucket = Double.parseDouble(priceBinderUSDbucket);
    }

    public double getSizePrimerBucket() {
        return sizePrimerBucket;
    }

    public void setSizePrimerBucket(String sizePrimerBucket) {
        this.sizePrimerBucket = Double.parseDouble(sizePrimerBucket);
    }

    public double getSizeBinderBucket() {
        return sizeBinderBucket;
    }

    public void setSizeBinderBucket(String sizeBinderBucket) {
        this.sizeBinderBucket = Double.parseDouble(sizeBinderBucket);
    }

    public double getSizeSalvenCanister() {
        return sizeSalvenCanister;
    }

    public void setSizeSalvenCanister(String sizeSalvenCanister) {
        this.sizeSalvenCanister = Double.parseDouble(sizeSalvenCanister);
    }

    public double getSizeEPDMbag() {
        return sizeEPDMbag;
    }

    public void setSizeEPDMbag(String sizeEPDMbag) {
        this.sizeEPDMbag = Double.parseDouble(sizeEPDMbag);
    }

    public double getSizeSBRbag() {
        return sizeSBRbag;
    }

    public void setSizeSBRbag(String sizeSBRbag) {
        this.sizeSBRbag = Double.parseDouble(sizeSBRbag);
    }

    public double getSizeBinderBarrel() {
        return sizeBinderBarrel;
    }

    public void setSizeBinderBarrel(String sizeBinderBarrel) {
        this.sizeBinderBarrel = Double.parseDouble(sizeBinderBarrel);
    }

    public double getPriceBinderRUBbarrelBL() {
        return priceBinderRUBbarrelBL;
    }

    public void setPriceBinderRUBbarrelBL(String priceBinderRUBbarrelBL) {
        this.priceBinderRUBbarrelBL = Double.parseDouble(priceBinderRUBbarrelBL);
    }

    public double getPriceBinderEURObarrelBL() {
        return priceBinderEURObarrelBL;
    }

    public void setPriceBinderEURObarrelBL(String priceBinderEURObarrelBL) {
        this.priceBinderEURObarrelBL = Double.parseDouble(priceBinderEURObarrelBL);
    }

    public double getPriceBinderUSDbarrelBL() {
        return priceBinderUSDbarrelBL;
    }

    public void setPriceBinderUSDbarrelBL(String priceBinderUSDbarrelBL) {
        this.priceBinderUSDbarrelBL = Double.parseDouble(priceBinderUSDbarrelBL);
    }

    public double getPriceBinderRUBbucketBL() {
        return priceBinderRUBbucketBL;
    }

    public void setPriceBinderRUBbucketBL(String priceBinderRUBbucketBL) {
        this.priceBinderRUBbucketBL = Double.parseDouble(priceBinderRUBbucketBL);
    }

    public double getPriceBinderEURObucketBL() {
        return priceBinderEURObucketBL;
    }

    public void setPriceBinderEURObucketBL(String priceBinderEURObucketBL) {
        this.priceBinderEURObucketBL = Double.parseDouble(priceBinderEURObucketBL);
    }

    public double getPriceBinderUSDbucketBL() {
        return priceBinderUSDbucketBL;
    }

    public void setPriceBinderUSDbucketBL(String priceBinderUSDbucketBL) {
        this.priceBinderUSDbucketBL = Double.parseDouble(priceBinderUSDbucketBL);
    }
}
