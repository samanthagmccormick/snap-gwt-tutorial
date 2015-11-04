package org.gwtproject.tutorial.client;

/* Implement this interface to allow a class to act as a module entry point.  */
import com.google.gwt.core.client.EntryPoint;
/* The panel to which all other widgets must ultimately be added. */
import com.google.gwt.user.client.ui.RootPanel;
/* GWT Polymer Elements - Paper Button (Material Design) */
import com.vaadin.polymer.paper.widget.PaperButton;
import com.vaadin.polymer.Polymer;
import com.vaadin.polymer.elemental.Function;
import com.vaadin.polymer.iron.element.IronIconElement;
import com.vaadin.polymer.paper.element.PaperIconItemElement;

import java.util.Arrays;

public class TodoList implements EntryPoint {
  
  /* Tip: to facilitate the usage of webcomponents gwt-polymer-elements maintains a couple of static constants: Element.TAG and Element.SRC, to avoid memorizing tag names and import paths respectively */

  public void onModuleLoad() {
    // We have to load icon sets before run application
    Polymer.importHref(Arrays.asList(
           PaperIconItemElement.SRC,
           IronIconElement.SRC), new Function() {
      public Object call(Object arg) {
        // The app is executed when all imports succeed.
        startApplication();
        return null;
      }
    });
  }

  private void startApplication() {
    RootPanel.get().add(new Main());
  }

}