package co.za.midv1990.Services;

import co.za.midv1990.Domain.Athlete;

/**
 * Created by Ihsaan on 2017/08/14.
 */
public interface AthleteService {
    Athlete create(Athlete athlete);

    Athlete read(String identity);

    Athlete update(Athlete athlete);

    void delete (String identity);
}
