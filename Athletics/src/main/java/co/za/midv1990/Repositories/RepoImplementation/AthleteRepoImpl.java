package co.za.midv1990.Repositories.RepoImplementation;

import co.za.midv1990.Domain.Athlete;
import co.za.midv1990.Repositories.AthleteRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ihsaan on 2017/08/14.
 */
public class AthleteRepoImpl implements AthleteRepository {

    private static AthleteRepoImpl ari = null;

    private Map<String,Athlete> athleteTable;

    private AthleteRepoImpl(){
        athleteTable = new HashMap<String, Athlete>();
    }

    public static AthleteRepoImpl getInstance(){
        if(ari==null)
        {
            ari = new AthleteRepoImpl();
        }
        return ari;
    }

    public Athlete create(Athlete athlete) {
        athleteTable.put(athlete.getIdentity(),athlete);
        Athlete savedAthlete =athleteTable.get(athlete.getIdentity());
        return savedAthlete;
    }

    public Athlete read(String identity) {
        Athlete athlete = athleteTable.get(identity);
        return athlete;
    }

    public Athlete update(Athlete athlete) {
        athleteTable.put(athlete.getIdentity(),athlete);
        Athlete savedAthlete = athleteTable.get(athlete.getIdentity());
        return savedAthlete;
    }

    public void delete(String identity) {
        athleteTable.remove(identity);

    }
}
