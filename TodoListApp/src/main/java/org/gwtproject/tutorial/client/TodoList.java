package org.gwtproject.tutorial.client;

/* Implement this interface to allow a class to act as a module entry point.  */
import com.google.gwt.core.client.EntryPoint;
/* The panel to which all other widgets must ultimately be added. */
import com.google.gwt.user.client.ui.RootPanel;
/* GWT Polymer Elements - Paper Button (Material Design) */
import com.vaadin.polymer.paper.widget.PaperButton;

public class TodoList implements EntryPoint {
  public void onModuleLoad() {
    // Use Widget API to Create a <paper-button>
    PaperButton button = new PaperButton("Press me!");
    button.setRaised(true);
    RootPanel.get().add(button);
  }
}