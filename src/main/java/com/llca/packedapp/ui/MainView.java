package com.llca.packedapp.ui;


import com.llca.packedapp.MessageBean;

import com.llca.packedapp.ui.views.storefront.StorefrontView;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.confirmdialog.ConfirmDialog;
import com.vaadin.flow.component.contextmenu.MenuItem;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.page.Viewport;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.TabVariant;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.component.menubar.*;

import com.vaadin.flow.router.RouteConfiguration;
import com.vaadin.flow.server.VaadinServlet;
import org.springframework.beans.factory.annotation.Autowired;


import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

import java.util.ArrayList;
import java.util.List;

import static com.llca.packedapp.ui.utils.LlcaConst.TITLE_STOREFRONT;
import static com.llca.packedapp.ui.utils.LlcaConst.VIEWPORT;


//@Route("")
@Viewport(VIEWPORT)
@PWA(name = "Project Base for Vaadin Flow with Spring", shortName = "Project Base",
        startPath = "login",
        backgroundColor = "#227aef",
        themeColor = "#227aef",
        offlinePath = "offline-page.html")





//public class MainView extends VerticalLayout {
public class MainView extends AppLayout {
    //VerticalLayout layout;
    private final ConfirmDialog confirmDialog = new ConfirmDialog();
    private final Tabs menu;


    public MainView(){

        confirmDialog.setCancelable(true);
        confirmDialog.setConfirmButtonTheme("raised tertiary error");
        confirmDialog.setCancelButtonTheme("raised tertiary");

        this.setDrawerOpened(false);
        Span appName = new Span("My Starter Project");
        appName.addClassName("hide-on-mobile");

        menu = createMenuTabs();

        this.addToNavbar(appName);
        this.addToNavbar(true, menu);
        this.getElement().appendChild(confirmDialog.getElement());

        getElement().addEventListener("search-focus", e -> {
            getElement().getClassList().add("hide-navbar");
        });

        getElement().addEventListener("search-blur", e -> {
            getElement().getClassList().remove("hide-navbar");
        });



}

    private static Tabs createMenuTabs() {
        final Tabs tabs = new Tabs();
        tabs.setOrientation(Tabs.Orientation.HORIZONTAL);
        tabs.add(getAvailableTabs());
        return tabs;
    }

    private static Tab[] getAvailableTabs() {
        final List<Tab> tabs = new ArrayList<>(4);
       /* tabs.add(createTab(VaadinIcon.EDIT, TITLE_STOREFRONT,
                StorefrontView.class));
*/


        final String contextPath = VaadinServlet.getCurrent().getServletContext().getContextPath();
/*        final Tab logoutTab = createTab(createLogoutLink(contextPath));
        tabs.add(logoutTab);*/
        return tabs.toArray(new Tab[tabs.size()]);
    }

    private static Tab createTab(Component content) {
        final Tab tab = new Tab();
        tab.addThemeVariants(TabVariant.LUMO_ICON_ON_TOP);
        tab.add(content);
        return tab;
    }


/*    @Override
    protected void afterNavigation() {
        super.afterNavigation();

        String target = RouteConfiguration.forSessionScope().getUrl(this.getContent().getClass());
    }*/
}
