package sep_rcc.util;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.logging.Logger;

public class ResourcesProducers {

    @Produces
    @PersistenceContext
    private EntityManager em;

}