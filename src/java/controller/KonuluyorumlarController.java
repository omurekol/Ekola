package controller;

import entity.Konuluyorumlar;
import facade.KonuluyorumlarFacade;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.annotation.PostConstruct;

@ManagedBean(name = "konuluyorumlarController")
@ViewScoped
public class KonuluyorumlarController extends AbstractController<Konuluyorumlar> {

    @EJB
    private KonuluyorumlarFacade ejbFacade;

    /**
     * Initialize the concrete Konuluyorumlar controller bean. The
     * AbstractController requires the EJB Facade object for most operations.
     */
    @PostConstruct
    @Override
    public void init() {
        super.setFacade(ejbFacade);
    }

    public KonuluyorumlarController() {
        // Inform the Abstract parent controller of the concrete Konuluyorumlar?cap_first Entity
        super(Konuluyorumlar.class);
    }

    @Override
    protected void initializeEmbeddableKey() {
        this.getSelected().setKonuluyorumlarPK(new entity.KonuluyorumlarPK());
    }

}
