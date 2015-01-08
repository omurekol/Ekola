package controller;

import entity.Konular;
import facade.KonularFacade;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.annotation.PostConstruct;

@ManagedBean(name = "konularController")
@ViewScoped
public class KonularController extends AbstractController<Konular> {

    @EJB
    private KonularFacade ejbFacade;

    /**
     * Initialize the concrete Konular controller bean. The AbstractController
     * requires the EJB Facade object for most operations.
     */
    @PostConstruct
    @Override
    public void init() {
        super.setFacade(ejbFacade);
    }

    public KonularController() {
        // Inform the Abstract parent controller of the concrete Konular?cap_first Entity
        super(Konular.class);
    }

}
