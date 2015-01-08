package controller;

import entity.Yorumlar;
import facade.YorumlarFacade;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.annotation.PostConstruct;

@ManagedBean(name = "yorumlarController")
@ViewScoped
public class YorumlarController extends AbstractController<Yorumlar> {

    @EJB
    private YorumlarFacade ejbFacade;

    /**
     * Initialize the concrete Yorumlar controller bean. The AbstractController
     * requires the EJB Facade object for most operations.
     */
    @PostConstruct
    @Override
    public void init() {
        super.setFacade(ejbFacade);
    }

    public YorumlarController() {
        // Inform the Abstract parent controller of the concrete Yorumlar?cap_first Entity
        super(Yorumlar.class);
    }

}
