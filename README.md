### About the App
Created with webAppCreator, a command line tool included in GWT that generates the project subdirectories and files you need to get started. It creates a starter application.

## Directories

* **/src/com/google/gwt/sample/TodoListApp** Contains the GWT module definition and initial application files.
* **/test/com/google/gwt/sample/TodoListApp** Contains JUnit test directory and a starter test class.
* **/war** Contains static resources that can be served publicly, such as image files, style sheets, and HTML host pages.
* **/war/WEB-INF** Contains Java web application files.
* **/war/WEB-INF/lib** Contains Java web application libraries.

## Files

* **TodoList.gwt.xml** = GWT module definition
* **TodoList.java** = Entry Point:

  * The entry point contains onModuleLoad() methods. It contains the code that executes when you launch the application. Typically, the types of things you do in the onModuleLoad() method are:
   * create new user interface components
   * set up handlers for events
   * modify the browser DOM in some way

* **TodoList.html** = Host page
* **TodoList.css** = Style sheet
* **web.xml** = Java web application descriptor
* **GreetingService.java, GreetingServiceAsync.java, GreetingServiceImpl.java** = GWT sample RPC classes
* **gwt-servlet.jar** = GWT server runtime library
* **Main.java, Main.ui.xml** = UI Binder screen
 * The UiBinder framework allows you to do exactly that: build your apps as HTML pages with GWT widgets sprinkled throughout them
  * encourages a clean separation of the aesthetics of your UI (a declarative XML template) from its programmatic behavior (a Java class);
  * There are no loops, no conditionals, no if statements in its markup, and only a very limited expression language. UiBinder allows you to lay out your user interface. It’s still up to the widgets or other controllers themselves to convert rows of data into rows of HTML.


### Link to Tutorial
http://www.gwtproject.org/doc/latest/polymer-tutorial/create.html

### Start the server in SuperDevMode
 * $ cd TodoListApp
 * $ mvn war:exploded
 * $ mvn gwt:run

### Launch the browser
 * In the GWT developer window, press "Launch Default Browser"
 * If you change something in the code, you can recompile the application by simply reloading the web page
 * If you change configuration files, e.g. pom.xml or static content in webapp, you might have to restart SuperDevMode. Ctrl+C and mvn gwt:run stops and starts the execution, respectively.
 
## Importing web components

Before using any component, you have to import the appropriate files. But gwt-polymer-elements comes with some utilities so as you it would be done automatically.

* Widgets : When you use a widget, the import happens automatically  PaperButton button = new PapperButton(); 
* Elements : .create() helper class ex) PaperButtonElement button = Polymer.create(PaperButtonElement.TAG); 
* Dynamic imports : importHref("paper-button/paper-button.html"); 
* Static imports : Adding tags to the hosted page head is the traditional way to make webcomponents available if you want them in a mixed application (DOM, JS, or GWT) or if you want to be sure that web components are available from the beginning.  <link rel='import' href='application_context/bower_components/paper-button/paper-button.html'></link> 