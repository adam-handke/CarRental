package com.car.rental;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.drools.compiler.compiler.DroolsParserException;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.QueryResults;
import org.kie.api.runtime.rule.QueryResultsRow;


public class CarRental {
    public static void main(String[] args) throws DroolsParserException,IOException
    {
        CarRental carRental = new CarRental();
        carRental.executeCarRentalRules();
    }

    public void executeCarRentalRules() throws IOException,DroolsParserException
    {
        KieServices ks = KieServices.Factory.get();
        BasicConfigurator.configure();
        KieContainer kContainer = ks.getKieClasspathContainer();
        KieSession carRentalSession = kContainer.newKieSession("ksession-rules");
        //uruchom wnioskowanie
        carRentalSession.fireAllRules();
    }
}