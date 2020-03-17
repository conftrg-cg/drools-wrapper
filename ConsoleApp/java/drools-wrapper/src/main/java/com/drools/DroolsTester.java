package com.drools;

import com.models.Person;
import org.kie.api.KieServices;
import org.kie.api.runtime.ExecutionResults;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.StatelessKieSession;
import org.kie.internal.command.CommandFactory;

import java.util.ArrayList;
import java.util.List;

public class DroolsTester {

    public String test() {

        KieServices kieServices = KieServices.Factory.get();
        KieContainer kContainer = kieServices.getKieClasspathContainer();
        return kContainer.toString();
        /*
        KieSession kSession = kContainer.newKieSession("Test");
        List cmds = new ArrayList();
        cmds.add( CommandFactory.newSetGlobal( "list1", new ArrayList(), true ) );
        cmds.add( CommandFactory.newInsert( new Person( "jon", 102 ), "person" ) );
        cmds.add( CommandFactory.newQuery( "Get People" ,"getPeople" ));

        ExecutionResults results = kSession.execute( CommandFactory.newBatchExecution( cmds ) );
        results.getValue( "list1" ); // returns the ArrayList
        results.getValue( "person" ); // returns the inserted fact Person
        results.getValue( "Get People" );// returns the query as a QueryResults instance.

        return "Ran some test";*/
    }
}
