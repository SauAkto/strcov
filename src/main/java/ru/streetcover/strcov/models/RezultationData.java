package ru.streetcover.strcov.models;

import javax.persistence.*;

@Entity
public class RezultationData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne(mappedBy = "rezultationData", cascade = CascadeType.ALL)
    private DataIndicators dataIndicators;

    private double allCostsMaterials;// общая стоимость материала
    private double allWeightMaterials; // общий вес материала
    private double costOneMetrCover; // стоимость за 1 м2
    private double allCostBinder; // стоимость клея общая
    private double costBinder; //  стоимость клея
    private double binderNeed; // потребность в клее
    private double binderBarrel; // потебность бочек
    private double binderBucket; // потребность ведер
    private double costEPDM; // общая стоимость ЭПДм
    private double EPMDNeed; // потребность ЭПДМ
    private double bagsEPDM; // кол-во мешков ЭПДМ
    private double costSBR; // стоимость черной крошки
    private double SBRNeed; // потребность в черной крошке
    private double bagsSBR; // кол-во мешков черной крошки
    private double costPrimer; // стоимость праймера
    private double primerNeed; // потребность в праймере
    private double packPrimer; // кол-во упаковок праймера
    private double costSolven; // стоимость растворителя
    private double solvenNeed;//  потребность в растворителе
    private double packSolven; // кол-во упаковок растворителя
    private double costBinderBL; // стоимость клея для подложки
    private double binderNeedBL; // потербность клея для подложи
    private double binderBarrelBL; //  потребность бочек клея для подложки
    private double binderBucketBL; // потребность ведер клея для подложки

    public RezultationData() {

    }

    public Long getId() {
        return id;
    }

    public DataIndicators getDataIndicators() {
        return dataIndicators;
    }

    public void setDataIndicators(DataIndicators dataIndicators) {
        this.dataIndicators = dataIndicators;
    }

    public double getAllCostsMaterials() {
        return allCostsMaterials;
    }

    public void setAllCostsMaterials(double allCostsMaterials) {
        this.allCostsMaterials = allCostsMaterials;
    }

    public double getAllWeightMaterials() {
        return allWeightMaterials;
    }

    public void setAllWeightMaterials(double allWeightMaterials) {
        this.allWeightMaterials = allWeightMaterials;
    }

    public double getCostOneMetrCover() {
        return costOneMetrCover;
    }

    public void setCostOneMetrCover(double costOneMetrCover) {
        this.costOneMetrCover = costOneMetrCover;
    }

    public double getAllCostBinder() {
        return allCostBinder;
    }

    public void setAllCostBinder(double allCostBinder) {
        this.allCostBinder = allCostBinder;
    }

    public double getCostBinder() {
        return costBinder;
    }

    public void setCostBinder(double costBinder) {
        this.costBinder = costBinder;
    }

    public double getBinderNeed() {
        return binderNeed;
    }

    public void setBinderNeed(double binderNeed) {
        this.binderNeed = binderNeed;
    }

    public double getBinderBarrel() {
        return binderBarrel;
    }

    public void setBinderBarrel(double binderBarrel) {
        this.binderBarrel = binderBarrel;
    }

    public double getBinderBucket() {
        return binderBucket;
    }

    public void setBinderBucket(double binderBucket) {
        this.binderBucket = binderBucket;
    }

    public double getCostEPDM() {
        return costEPDM;
    }

    public void setCostEPDM(double costEPDM) {
        this.costEPDM = costEPDM;
    }

    public double getEPMDNeed() {
        return EPMDNeed;
    }

    public void setEPMDNeed(double EPMDNeed) {
        this.EPMDNeed = EPMDNeed;
    }

    public double getBagsEPDM() {
        return bagsEPDM;
    }

    public void setBagsEPDM(double bagsEPDM) {
        this.bagsEPDM = bagsEPDM;
    }

    public double getCostSBR() {
        return costSBR;
    }

    public void setCostSBR(double costSBR) {
        this.costSBR = costSBR;
    }

    public double getSBRNeed() {
        return SBRNeed;
    }

    public void setSBRNeed(double SBRNeed) {
        this.SBRNeed = SBRNeed;
    }

    public double getBagsSBR() {
        return bagsSBR;
    }

    public void setBagsSBR(double bagsSBR) {
        this.bagsSBR = bagsSBR;
    }

    public double getCostPrimer() {
        return costPrimer;
    }

    public void setCostPrimer(double costPrimer) {
        this.costPrimer = costPrimer;
    }

    public double getPrimerNeed() {
        return primerNeed;
    }

    public void setPrimerNeed(double primerNeed) {
        this.primerNeed = primerNeed;
    }

    public double getPackPrimer() {
        return packPrimer;
    }

    public void setPackPrimer(double packPrimer) {
        this.packPrimer = packPrimer;
    }

    public double getCostSolven() {
        return costSolven;
    }

    public void setCostSolven(double costSolven) {
        this.costSolven = costSolven;
    }

    public double getSolvenNeed() {
        return solvenNeed;
    }

    public void setSolvenNeed(double solvenNeed) {
        this.solvenNeed = solvenNeed;
    }

    public double getPackSolven() {
        return packSolven;
    }

    public void setPackSolven(double packSolven) {
        this.packSolven = packSolven;
    }

    public double getCostBinderBL() {
        return costBinderBL;
    }

    public void setCostBinderBL(double costBinderBL) {
        this.costBinderBL = costBinderBL;
    }

    public double getBinderNeedBL() {
        return binderNeedBL;
    }

    public void setBinderNeedBL(double binderNeedBL) {
        this.binderNeedBL = binderNeedBL;
    }

    public double getBinderBarrelBL() {
        return binderBarrelBL;
    }

    public void setBinderBarrelBL(double binderBarrelBL) {
        this.binderBarrelBL = binderBarrelBL;
    }

    public double getBinderBucketBL() {
        return binderBucketBL;
    }

    public void setBinderBucketBL(double binderBucketBL) {
        this.binderBucketBL = binderBucketBL;
    }
}
