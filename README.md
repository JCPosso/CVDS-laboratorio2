# Ciclos de vida y desarrollo de software - Laboratorio 2
Creación de proyecto maven y conocimiento de los archivos

# *Maven*
### ¿Cúal es su mayor utilidad?
Maven facilita la creación y gestion de proyectos de Software, basandose en el
concepto de modelo de objeto de proyecto (POM).
La ventaja mas grande es la conectividad remota a su propio repositorio, permitiendo
el acceso a utilidades adicionales, que solo son usadas si se desea.

### Fases de Maven
1. *Compile:* Genera los archivos *.class, compilando las fuentes *.java**.
Se recomienda verificar que no existan errores de sintaxis o de compilacion, o 
los archivos no se van a generar.
2. *Test:* Ejecuta los test automaticos de *JUnit* existentes, abortando el
proceso si alguno de ellos falla.
3. *Package:* Genera el *.jar* con los *.class* compilados.
4. *Install:* Copia los *.jar* a un directiorio en nuestro ordenador, permitiendo
que este se pueda usar en otros proyectos *maven* sobre la misma maquina.
5. *Deploy:* Ubica una copia del *.jar* a un servidor remoto, permitiendo
el acceso a este desde cualquier otro proyecto *maven* que tenga los permisos
de acceso al servidor.

### Plugins
*¿Qué es un Plugin?:* Un plugin es un fragmento o componente de código.
*¿Para qué sirven los Plugins?:* Nos permiten ampliar las funciones de un programa o una herramienta.

### Repositorio central de Maven
El repositorio central de Maven es un espacio público en el que se puede tanto
subir, como descargar plugins útiles para la comunidad.

En su página principal se puede encontrar de manera cronológica las mas recientes 
publicaciones, aunque se pueden filtar por categorias con un menú en la parte 
izquierda, buscando la funcionalidad que necesitamos.

### Crando proyecto en Maven con ayuda de arquetipos
Para la creación de un proyecto en Maven con arquetipos necesitaremos el siguiente comando:

mvn archetype:generate -Dfilter=maven-archetype-quickstart

Una vez ejecutado nos permitirá configurar el empaquetamiento de nuestro proyecto.
Y para este caso lo configuraremos de la siguiente manera:
- *Grupo:* edu.eci.cvds
- *Id del artefacto:* Pattern
- *Paquete:* edu.eci.cvds.patterns
- *arcgetypeArtifactId:* maven-archetype-quickstart

Una vez configurado, en nuestro directorio se debe haber creado un nuevo proyecto
*Patterns* a partir de un modelo arquetipo.
