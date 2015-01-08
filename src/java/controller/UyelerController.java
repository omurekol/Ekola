package controller;

import entity.Uyeler;
import facade.UyelerFacade;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.annotation.PostConstruct;

@ManagedBean(name = "uyelerController")
@ViewScoped
public class UyelerController extends AbstractController<Uyeler> {

    @EJB
    private UyelerFacade ejbFacade;

    /**
     * Initialize the concrete Uyeler controller bean. The AbstractController
     * requires the EJB Facade object for most operations.
     */
    @PostConstruct
    @Override
    public void init() {
        super.setFacade(ejbFacade);
    }

    public UyelerController() {
        // Inform the Abstract parent controller of the concrete Uyeler?cap_first Entity
        super(Uyeler.class);
    }

}
