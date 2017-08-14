package co.za.midv1990.Factories;

import co.za.midv1990.Domain.Athlete;
import junit.framework.TestCase;

import java.util.HashMap;
import java.util.Map;

import co.za.midv1990.*;

/**
 * Created by Ihsaan on 2017/08/14.
 */
public class AthleteFactoryTest extends TestCase {
    Map<String,String> values;

    public void setUp() throws Exception {
        super.setUp();
        values= new HashMap<String, String>();
        values.put("identity","9010015559081");
        values.put("name","Muhammad");
        values.put("surname","deVilliers");


    }

    public void testGetAthlete() throws Exception {
        Athlete a = AthleteFactory.getAthlete(values,"9010035559081",25);
        assertEquals("Ihsaan", a.getName());
    }

}