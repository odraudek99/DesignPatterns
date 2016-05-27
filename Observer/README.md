

http://yuml.me/diagram/scruffy/class/draw

// Class Diagram Adapter
[Observable||void addObserver(Observer obs);void removeObserver(Observer obs);void notifyObservers();void setValues(int state, float calif)]^-.-[ObservableImpl|-state:int;-calif:float;-observers:List<Observer>|]

[Observer||void update(int state, float calif)]^-.-[ObserverImpl|observable:Observable;state:int;state:int|ObserverImpl(Observable obs)]
[GUI||void display()]^-.-[ObserverImpl]
[ObserverImpl]->[Observable]
