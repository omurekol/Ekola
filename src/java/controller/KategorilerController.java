package controller;

import entity.Kategoriler;
import facade.KategorilerFacade;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.annotation.PostConstruct;

@ManagedBean(name = "kategorilerController")
@ViewScoped
public class KategorilerController extends AbstractController<Kategoriler> {

    @EJB
    private KategorilerFacade ejbFacade;

    /**
     * Initialize the concrete Kategoriler controller bean. The
     * AbstractController requires the EJB Facade object for most operations.
     */
    @PostConstruct
    @Override
    public void init() {
        super.setFacade(ejbFacade);
    }

    public KategorilerController() {
        // Inform the Abstract parent controller of the concrete Kategoriler?cap_first Entity
        super(Kategoriler.class);
    }

}
