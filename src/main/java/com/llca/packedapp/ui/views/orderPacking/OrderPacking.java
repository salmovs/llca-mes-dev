package com.llca.packedapp.ui.views.orderPacking;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.*;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import java.util.stream.Stream;

@Route("")
public class OrderPacking extends VerticalLayout {
    //final Grid<String> grid;
    final TextField filter;
    private final Button addNewBtn;

    // build layout


    public OrderPacking(){
        this.addNewBtn = new Button("Кнопка ");
        this.filter = new TextField();

        HorizontalLayout actions = new HorizontalLayout(filter,addNewBtn);
        add(actions);
    }
}
