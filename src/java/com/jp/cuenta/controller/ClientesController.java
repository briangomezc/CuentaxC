package com.jp.cuenta.controller;

import com.jp.cuenta.entity.Clientes;
import com.jp.cuenta.facade.ClientesFacade;
import com.jp.cuenta.controller.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "clientesController")
@ViewScoped
public class ClientesController extends AbstractController<Clientes> {

    @Inject
    private MobilePageController mobilePageController;

    public ClientesController() {
        // Inform the Abstract parent controller of the concrete Clientes Entity
        super(Clientes.class);
    }

}
