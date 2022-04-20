package ru.streetcover.strcov;

public class Primer {
    public double generalNeedSBR (double siteArea, double consumptionPrimer){  //принимает площадь площадки, расход праймера,
         double needPrimer = siteArea * consumptionPrimer;
        return needPrimer; //возвращает общее количество праймера
    }

    public int ocruglContainerPrimer(double needPrimer, double conteinerPrimer){    // принимает общую потребность праймера, размер упаковки праймера
         int numPrimer = (int)Math.ceil((double)(needPrimer/conteinerPrimer));
        return numPrimer; //возвращае кол-во упаковок праймера
    }

    public double costCompletePrimer(double numPrimer, double conteinerPrimer, double costPrimer){//принимает кол-во упаковок праймера, размер упаковки праймера, стоимость праймера
         double totalPricePrimer = (numPrimer * conteinerPrimer) * costPrimer;
        return totalPricePrimer;   //возвращает стоимость крошки SBR
    }
}
