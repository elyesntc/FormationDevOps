package tn.elyes.exemple;
import tn.elyes.model.CoursType;
import java.util.ArrayList;
import java.util.List;
public class CoursService {
    public List getAvailableCours(CoursType type){

        List brands = new ArrayList();

        if(type.equals(CoursType.CLOUD)){
            brands.add("IaaS");
            brands.add("PaaS");
            brands.add("SaaS");

        }else if(type.equals(CoursType.DEVOPS)){
            brands.add("Jenkins");
            brands.add("Ansible");
            brands.add("CI/CD");

        }else if(type.equals(CoursType.DOCKER)){
            brands.add("Dockerfile");
            brands.add("Docker Compose");
            brands.add("Docker Swarm");

        }else {
            brands.add("Pas de cours disponibles");
        }
        return brands;
    }
}
