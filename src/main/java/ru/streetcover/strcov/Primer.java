package ru.streetcover.strcov;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.data.jpa.provider.HibernateUtils;
import ru.streetcover.strcov.models.DataIndicators;
import ru.streetcover.strcov.models.RezultationData;

public class Primer{

    double needPrimer;
    double numPrimer;
    double allCostPrimer;
    SessionFactory factory = null;

    try
       {
    factory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(DataIndicators.class)
            .addAnnotatedClass(RezultationData.class)
            .buildSessionFactory();

        Session session = factory.getCurrentSession();
        session.beginTransaction();
        DataIndicators daIn = session.get(DataIndicators.class, 2);

        needPrimer = generalNeedPrimer(daIn.getArea(), daIn.getNumberOfCoatingLayers());
        numPrimer = ocruglContainerPrimer(needPrimer, daIn.getSizePrimerBucket());
        allCostPrimer = costCompletePrimer(numPrimer, daIn.getSizePrimerBucket(), daIn.getPricePrimer());

        RezultationData reDa = session.get(RezultationData.class, 2);
        reDa.setCostPrimer(allCostPrimer);
        reDa.setPrimerNeed(needPrimer);
        reDa.setPackPrimer(numPrimer);

        session.getTransaction().commit();

    }
    finally{
        if(factory != null) {
            factory.close();
        }
    }


    public double generalNeedPrimer (double siteArea, double consumptionPrimer){  //принимает площадь площадки, расход праймера,
         double needPrimer = siteArea * consumptionPrimer;
        return needPrimer; //возвращает общее количество праймера
    }

    public double ocruglContainerPrimer(double needPrimer, double conteinerPrimer){    // принимает общую потребность праймера, размер упаковки праймера
         double numPrimer = Math.ceil((double)(needPrimer/conteinerPrimer));
        return numPrimer; //возвращае кол-во упаковок праймера
    }

    public double costCompletePrimer(double numPrimer, double conteinerPrimer, double costPrimer){//принимает кол-во упаковок праймера, размер упаковки праймера, стоимость праймера
         double totalPricePrimer = (numPrimer * conteinerPrimer) * costPrimer;
        return totalPricePrimer;   //возвращает стоимость крошки SBR
    }
}
