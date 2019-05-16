package org.vaadin;

import com.vaadin.navigator.Navigator;
import com.vaadin.ui.*;

public class MainLayout extends HorizontalSplitPanel {

    private Panel contentArea;
    private VerticalLayout menuBar;

    public MainLayout() {
        setSizeFull();
        menuBar = new VerticalLayout();
        menuBar.setHeight("100%");
        contentArea = new Panel();
        contentArea.setSizeFull();
        setFirstComponent(menuBar);
        setSecondComponent(contentArea);
        setSplitPosition(20.0f, Unit.PERCENTAGE);
        initNavigation();
    }

    private void initNavigation() {
        Navigator navigator = new Navigator(UI.getCurrent(), contentArea);
        navigator.addView("", DefaultView.class);
        Button button = new Button("Default view", e -> navigator.navigateTo(""));
        menuBar.addComponent(button);
        navigator.addView("admin", AdminView.class);
        button = new Button("Admin view", e -> navigator.navigateTo("admin"));
        menuBar.addComponent(button);
        menuBar.setExpandRatio(button, 1.0f);


    }

}
