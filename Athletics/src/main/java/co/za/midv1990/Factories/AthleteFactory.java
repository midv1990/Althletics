package co.za.midv1990.Factories;

import co.za.midv1990.Domain.Athlete;

import java.util.Map;

/**
 * Created by Ihsaan on 2017/08/14.
 */
public class AthleteFactory {
    public static Athlete getAthlete (Map<String, String> values ,String identity, int age){
        Athlete athlete = new Athlete.Builder()
                .identity(identity)
                .name(values.get("name"))
                .surname(values.get("surname"))
                .age(age)
                .build();
        return athlete;

    }
}
