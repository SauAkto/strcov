package ru.streetcover.strcov;

public class Solven {
    public double generalNeedSolvent (double siteArea, double consumptionSolvent, int numbersLayer){  //принимает площадь площадки, расход растворителя, количество слоев резинового покрытия
         double needSolvent = (siteArea * consumptionSolvent) * numbersLayer;
        return needSolvent; //возвращает общее количество праймера
    }

    public int ocruglContainerSolvent(double needSolvent, double conteinerSolvent){    // принимает общую потребность растворителя, размер упаковки растворителя
         int numSolvent = (int)Math.ceil((double)(needSolvent/conteinerSolvent));
        return numSolvent; //возвращае кол-во упаковок растворителя
    }

    public double costCompleteSolvent(double numSolvent, double conteinerSolvent, double costSolvent){//принимает кол-во упаковок растворителя, размер упаковки растворителя, стоимость растворителя
         double totalPriceSolvent = (numSolvent * conteinerSolvent) * costSolvent;
        return totalPriceSolvent;   //возвращает стоимость растворителя
    }
}
