

http://yuml.me/diagram/scruffy/class/draw

// Class Diagram Adapter
[Paloma||vuela();come();gorgorea()]^-.-[PalomaImpl]
[Pollito||brinca();pica();pio()]^-.-[PollitoImpl]
[Paloma]^-.-[AdapterPollito|-pollito:Pollito |AdapterPollito(Pollito pollito)]
[AdapterPollito]->[Pollito]