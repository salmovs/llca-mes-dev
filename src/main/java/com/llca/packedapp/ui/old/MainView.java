package com.llca.packedapp.ui.old;


import com.llca.packedapp.MessageBean;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.contextmenu.MenuItem;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.Viewport;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;
import org.springframework.beans.factory.annotation.Autowired;

/*

@Route("")

@PWA(name = "Project Base for Vaadin Flow with Spring", shortName = "Project Base")
//public class MainView extends VerticalLayout {
public class MainView extends AppLayout {
   // final TextField filter;
    VerticalLayout layout;

    public MainView(@Autowired MessageBean bean) {

        MenuBar menuBar = new MenuBar();
        Text selected = new Text("");
        Div message = new Div(new Text("Selected: "), selected);

        MenuItem project = menuBar.addItem("Project");
        MenuItem account = menuBar.addItem("Account");
        menuBar.addItem("Sign Out", e -> selected.setText("Sign Out"));


*/
/* MenuBar menuBar = new MenuBar();
        Stream.of("Главная","Планирование ","Производсвенные линии").forEach(menuBar::addItem);*//*




        addToDrawer( new DrawerToggle());
        Tabs tabs = new Tabs(new Tab("Home"), new Tab("About"));
        tabs.setOrientation(Tabs.Orientation.VERTICAL);
        addToDrawer(tabs);

        layout = new VerticalLayout();

        Button button = new Button("Тест ",
                e -> Notification.show(bean.getMessage()));

        layout.add(button);

     //   this.filter = new TextField();

        //Label label = new Label("Добро пожаловать Хозяин");


      */
/*  Button button = new Button("Тест ",
                e -> Notification.show(bean.getMessage()));*//*

        //add(button);
        setContent(layout);
    }



}
*/
