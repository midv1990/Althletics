package co.za.midv1990.Repositories;

import co.za.midv1990.Domain.Athlete;

/**
 * Created by Ihsaan on 2017/08/14.
 */
public interface AthleteRepository {
    Athlete create(Athlete athlete);

    Athlete read(String identity);

    Athlete update(Athlete athlete);

    void delete (String identity);
}
