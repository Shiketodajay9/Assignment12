package com.anudip;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project Started...!" );
        ApplicationContext ap=new ClassPathXmlApplicationContext("Config.xml");
        AgentDao Dao=(AgentDao)ap.getBean("e2");
        //for add agent
         System.out.println(Dao.saveAgent(new Agent(6,"rachna",22000)));
        // for update agent comission    
       // System.out.println(Dao.updateAgent(new Agent(1,45000)));
        //for delete agent
       // System.out.println(Dao.deleteAgent(new Agent(6)));
    }
}
