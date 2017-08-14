package co.za.midv1990.Services.ServicesImplementation;

import co.za.midv1990.Domain.Athlete;
import co.za.midv1990.Repositories.AthleteRepository;
import co.za.midv1990.Repositories.RepoImplementation.AthleteRepoImpl;
import co.za.midv1990.Services.AthleteService;

/**
 * Created by Ihsaan on 2017/08/14.
 */
public class AthleteServiceImpl implements AthleteService{

    private static AthleteServiceImpl service = null;

    AthleteRepository repository = AthleteRepoImpl.getInstance();

    public static AthleteServiceImpl getInstance(){
        if(service == null)
        {
            service = new AthleteServiceImpl();
        }
        return service;
    }

    public Athlete create(Athlete athlete) {
        return repository.create(athlete);
    }

    public Athlete read(String identity) {
        return repository.read(identity);
    }

    public Athlete update(Athlete athlete) {
        return repository.update(athlete);
    }

    public void delete(String identity) {
        repository.delete(identity);
    }
}
