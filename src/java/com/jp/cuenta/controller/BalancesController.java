package com.jp.cuenta.controller;

import com.jp.cuenta.entity.Balances;
import com.jp.cuenta.facade.BalancesFacade;
import com.jp.cuenta.controller.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "balancesController")
@ViewScoped
public class BalancesController extends AbstractController<Balances> {

    @Inject
    private MobilePageController mobilePageController;

    public BalancesController() {
        // Inform the Abstract parent controller of the concrete Balances Entity
        super(Balances.class);
    }

}
