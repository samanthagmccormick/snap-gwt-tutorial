package org.gwtproject.tutorial.client;

import com.google.gwt.core.client.GWT;
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

/**
 * Entry point classes define onModuleLoad().
 */

public class TodoList implements EntryPoint {
  
  /**
   * This is the entry point method. Initialize you GWT module here.
   */
    
  /* Tip: to facilitate the usage of webcomponents gwt-polymer-elements maintains a couple of static constants: Element.TAG and Element.SRC, to avoid memorizing tag names and import paths respectively */ 

  public void onModuleLoad() {
    
    // Writes Hello World to the module log window.
    GWT.log("Hello World!", null);
    
    // We have to load icon sets before run application
    Polymer.importHref(Arrays.asList(
          "iron-icons/iron-icons.html",
           PaperIconItemElement.SRC,
           IronIconElement.SRC), new Function() {
      public Object call(Object arg) {
        // The app is executed when all imports succeed.
        startApplication();
        return null;
      }
    });
  }

  /* Load the main screen */
  private void startApplication() {
    RootPanel.get().add(new Main());
  }

}