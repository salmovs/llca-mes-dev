package com.llca.packedapp.ui.views.storefront;

import com.llca.packedapp.ui.MainView;
import com.llca.packedapp.ui.utils.LlcaConst;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@Tag("storefront-view")
@Route(value = LlcaConst.PAGE_STOREFRONT, layout = MainView.class)
//@RouteAlias(value = LlcaConst.PAGE_STOREFRONT_EDIT, layout = MainView.class)
@RouteAlias(value = LlcaConst.PAGE_ROOT, layout = MainView.class)
@PageTitle(LlcaConst.TITLE_STOREFRONT)
public class StorefrontView {
}
