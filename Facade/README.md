

//http://yuml.me/diagram/scruffy/class/draw

// Class Diagram Facade


[SistemaA]^-.-[Facade|SistemaA sistemaA;SistemaB sistemaB]
[SistemaB]^-.-[Facade]

[SistemaA]^-.-[SistemaAImpl]
[SistemaB]^-.-[SistemaBImpl]

[Facade]->[SistemaA]
[Facade]->[SistemaB]
