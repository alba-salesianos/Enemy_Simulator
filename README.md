# Minecraft Enemy Simulator
Este proyecto surge de la necesidad de crear varios tipos de enemigos para el juego Minecraft, cada uno con atributos diferentes pero con características similares. Para lograr esto, se han creado dos clases abstractas: HostileMob (para enemigo agresivo) y PacificMob (para criaturas pacíficas).

## Necesidad del proyecto
En Minecraft, los jugadores se enfrentan a diferentes enemigos durante su aventura. Estos enemigos pueden variar en comportamiento, atributos y forma de combate. Para implementar esta variedad de enemigos, es necesario utilizar una estructura flexible que permita crear y personalizar fácilmente nuevos tipos de enemigos.

El proyecto aborda esta necesidad al proporcionar una base sólida con las clases abstractas HostileMob y PacificMob. Estas clases contienen atributos y métodos comunes a los enemigos agresivos y pacíficos. Al heredar de estas clases abstractas, se pueden crear nuevos enemigos con atributos específicos y comportamientos únicos, como es el caso de las diferentes formas de moverse de los Zombies, los Enderman o las Ovejas..


## Aprendizajes de los principios SOLID
La implementación de este proyecto ha brindado una mejor comprensión del principio SOLID, en particular el principio de segregación de interfaces. 

El principio de segregación mantiene que es preferible tener varias interfaces específicas que implementen solo los métodos necesarios en diferentes clases, en lugar de tener una sola interfaz que implemente todos los métodos en todas las clases, incluyendo aquellos que no se necesitan.

Este enfoque ha llevado a un código más limpio y cohesivo. Cada clase de enemigo se enfoca en sus propias características y comportamientos únicos, sin verse afectada por la implementación de métodos irrelevantes.
