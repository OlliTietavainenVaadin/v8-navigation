package org.vaadin;

import com.vaadin.navigator.View;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class AdminView extends VerticalLayout implements View {

    public AdminView() {
        setSizeFull();
        addComponent(new Label("Admin view"));
    }
}
