package ru.streetcover.strcov;

public class SBR {
    public int generalNeedSBR (int siteArea, int consumptionTopSBR,  int consumptionButtomSBR, //!необходимо предварительно высчитать площадь в случае многоцветного покрытия, сплюсовать отд цвета
                               int thicknessBottomLayer, int thicknessTopLayer){  //принимает площадь площадки, расход крошки SBR верх, расход крошки SBR низ, толщину верхнего слоя, толщину нижнего слоя
         int needSBR = 0;
         int needSBRtop = 0;
         int needSBRbuttom = 0;
         int topSBR = thicknessTopLayer * (consumptionTopSBR / 10);
         int buttomSBR = thicknessBottomLayer * (consumptionButtomSBR / 10);

        if(thicknessBottomLayer != 0){ // указана ли толщина подложки
            needSBRbuttom = siteArea * buttomSBR;
        }
        if (thicknessTopLayer != 0){ //есть ли верхний слой из черной крошки
            needSBRtop = siteArea * topSBR;
        }
        needSBR = needSBRbuttom + needSBRtop;
        return needSBR; //возвращает общее количество крошки
    }

    public int ocruglContainerSBR(double needSBR, double conteinerSBR){    // принимает общую потребность SBR, размер мешка SBR
         int numSBRBag = (int)Math.ceil((double)(needSBR/conteinerSBR));
        return numSBRBag; //возвращае кол-во мешков SBR
    }

    public double costCompleteSBR(double numSBRBag, double conteinerSBR, double costSBR){//принимает кол-во упаковок SBR, размер упаковки SBR, стоимость крошки SBR
         double totalPriceSBR = (numSBRBag * conteinerSBR) * costSBR;
        return totalPriceSBR;   //возвращает стоимость крошки SBR
    }
}
