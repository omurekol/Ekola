package controller;

import entity.Begeniler;
import facade.BegenilerFacade;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.annotation.PostConstruct;

@ManagedBean(name = "begenilerController")
@ViewScoped
public class BegenilerController extends AbstractController<Begeniler> {

    @EJB
    private BegenilerFacade ejbFacade;

    /**
     * Initialize the concrete Begeniler controller bean. The AbstractController
     * requires the EJB Facade object for most operations.
     */
    @PostConstruct
    @Override
    public void init() {
        super.setFacade(ejbFacade);
    }

    public BegenilerController() {
        // Inform the Abstract parent controller of the concrete Begeniler?cap_first Entity
        super(Begeniler.class);
    }

}
