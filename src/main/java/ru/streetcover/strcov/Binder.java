//package ru.streetcover.strcov;
//
//public class Binder {
//    private double costBinder;
//    double typeCurrency;
//    double costBinderRate;
//
//    public double costRubBinder (double typeCurrency, double costBinderRate, double rateUSD, double rateEURO, double costBinderRUB){ // получаем тип валюты, стоимость клея в валюте, курс доллара, курс евро, стоимость клея в рублях
//
//        switch(typeCurrency){   //typeCurrency парамерт выбора типа валюты (1- руб, 2- евро, 3 - доллар)
//            case 1: costBinder = costBinderRUB;
//                break;
//            case 2: costBinder = rateEURO * costBinderRate; // costBinderRate стоимость клея в валюте
//                break;
//            case 3: costBinder = rateUSD * costBinderRate;
//                break;
//            default: costBinder = 0;
//                break;
//        }
//        return costBinder;	//возвращает стоимость клея
//    }
//
//    public double generalNeedBinder (double siteArea, double consumptionTopBinder,  double consumptionButtomBinder, //!необходимо предварительно высчитать площадь в случае многоцветного покрытия, сплюсовать отд цвета
//                                     double thicknessBottomLayer, double thicknessTopLayer){  //принимает площадь площадки, расход клея на верх, расход клея на низ, толщину верхнего слоя, толщину нижнего слоя
//        double needBinder = 0;
//        double binderTop = thicknessTopLayer * (consumptionTopBinder / 10);
//        double binderButtom = thicknessBottomLayer * (consumptionButtomBinder / 10);
//
//        if(thicknessBottomLayer == 0){ // указана ли толщина подложки
//            needBinder = siteArea * binderTop;
//        } else{
//            needBinder = (siteArea * binderButtom) + (siteArea * binderTop);
//        }
//        return needBinder; //возвращает общее количество клея
//    }
//
//    public int ocruglContainerBinder(double needBinder, double conteinerBinder){    // принимает общую потребность клея, размер бочки
//        int numPackageBarrel = needBinder/conteinerBinder;
//        int numBinderBucket = (int)Math.ceil((double)(needBinder%conteinerBinder)/25);
//        int[] packegeBinder = {numPackageBarrel, needBinderBucket};
//        return packegeBinder; //возвращае кол-во бочек и кол-во ведер
//    }
//
//    public double[] costCompletePrivateBinder(double[] packegeBinder, double conteinerBinder, double costBinder){//принимает массив колва упаковок, размер бочки, стоимость клея
//        double e = conteinerBinder * packegeBinder[0];
//        double w = packegeBinder[1] * 25;
//        double costBarrel = e * costBinder;
//        double costBucket = w * costBinder;
//        double completeCostBinder = costBarrel + costBucket;
//        double[] totalPriceBinder = {costBarrel, costBucket, completeCostBinder};
//        return totalPriceBinder;   //возвращает стоимость клея общая, стоимость бочек и стоимосьт ведер
//    }
//}
