package com.llca.packedapp.ui.views.login;


import com.llca.packedapp.ui.utils.LlcaConst;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.page.Viewport;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

//@Route("")
@Route
@PageTitle("Стартовая страница")
@Viewport(LlcaConst.VIEWPORT)
public class LoginView extends Div {
    public LoginView(){
        setText("ZAEBIS");
    }
}
