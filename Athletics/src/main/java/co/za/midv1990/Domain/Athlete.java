package co.za.midv1990.Domain;

import java.io.Serializable;


/**
 * Created by Ihsaan on 2017/08/08.
 */
public class Athlete implements Serializable {
    private String name,surname,identity;
    private int age;

    //getters
    public String getName() {return name;}
    public String getSurname() {return surname;}
    public String getIdentity() {return identity;}
    public int getAge() {return age;}

    //constructor

    private Athlete(){}

    public Athlete(Builder build) {
        this.name = build.name;
        this.surname = build.surname;
        this.identity = build.identity;
        this.age = build.age;
    }

    //builder class
    public static class Builder
    {
        private String name,surname,identity;
        private int age;

        public Builder name(String value)
        {
            this.name = value;
            return this;
        }
        public Builder surname(String value)
        {
            this.surname = value;
            return this;
        }
        public Builder identity(String value)
        {
            this.identity = value;
            return this;
        }
        public Builder age(int value)
        {
            this.age = value;
            return this;
        }

        public Athlete build(){return new Athlete(this);}
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Athlete athlete = (Athlete) o;

        return name.equals(athlete.name);
    }
    @Override
    public int hashCode() {return name.hashCode();}
}
