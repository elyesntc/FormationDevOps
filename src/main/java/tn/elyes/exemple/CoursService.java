package tn.elyes.exemple;
import tn.elyes.model.CoursType;
import java.util.ArrayList;
import java.util.List;
public class CoursService {
    public List getAvailableCours(CoursType type){

        List contenu = new ArrayList();

        if(type.equals(CoursType.CLOUD)){
            contenu.add("IaaS");
            contenu.add("PaaS");
            contenu.add("SaaS");

        }else if(type.equals(CoursType.DEVOPS)){
            contenu.add("Jenkins");
            contenu.add("Ansible");
            contenu.add("CI/CD");

        }else if(type.equals(CoursType.DOCKER)){
            contenu.add("Dockerfile");
            contenu.add("Docker Compose");
            contenu.add("Docker Swarm");

        }else {
            contenu.add("Pas de cours disponibles");
        }
        return contenu;
    }
}
