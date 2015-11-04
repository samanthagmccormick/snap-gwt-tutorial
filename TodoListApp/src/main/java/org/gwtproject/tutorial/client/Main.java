package org.gwtproject.tutorial.client;

    import com.google.gwt.core.client.GWT;
    import com.google.gwt.uibinder.client.UiBinder;
    /* A type of widget that can wrap another widget, hiding the wrapped widget's methods. When added to a panel, a composite behaves exactly as if the widget it wraps had been added.
    The composite is useful for creating a single widget out of an aggregate of multiple other widgets contained in a single panel. */
    import com.google.gwt.user.client.ui.Composite;
    /* A panel that contains HTML, and which can attach child widgets to identified elements within that HTML. */
    import com.google.gwt.user.client.ui.HTMLPanel;

    public class Main extends Composite {
      interface MainUiBinder extends UiBinder<HTMLPanel, Main> {
      }

      private static MainUiBinder ourUiBinder = GWT.create(MainUiBinder.class);

      public Main() {
        initWidget(ourUiBinder.createAndBindUi(this));
      }
    }