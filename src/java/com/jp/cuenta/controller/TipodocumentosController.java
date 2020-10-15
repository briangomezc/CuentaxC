package com.jp.cuenta.controller;

import com.jp.cuenta.entity.Tipodocumentos;
import com.jp.cuenta.facade.TipodocumentosFacade;
import com.jp.cuenta.controller.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "tipodocumentosController")
@ViewScoped
public class TipodocumentosController extends AbstractController<Tipodocumentos> {

    @Inject
    private MobilePageController mobilePageController;

    public TipodocumentosController() {
        // Inform the Abstract parent controller of the concrete Tipodocumentos Entity
        super(Tipodocumentos.class);
    }

}
