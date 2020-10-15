package com.jp.cuenta.controller;

import com.jp.cuenta.entity.Transacciones;
import com.jp.cuenta.facade.TransaccionesFacade;
import com.jp.cuenta.controller.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "transaccionesController")
@ViewScoped
public class TransaccionesController extends AbstractController<Transacciones> {

    @Inject
    private MobilePageController mobilePageController;

    public TransaccionesController() {
        // Inform the Abstract parent controller of the concrete Transacciones Entity
        super(Transacciones.class);
    }

}
