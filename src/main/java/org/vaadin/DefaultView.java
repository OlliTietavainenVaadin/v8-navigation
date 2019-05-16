package org.vaadin;

import com.vaadin.navigator.View;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class DefaultView extends VerticalLayout implements View {

    public DefaultView() {
        setSizeFull();
        addComponent(new Label("Default view"));
    }
}
